import java.util.*;
public class ParenthesisMatch{

  static boolean areBal(String str){

    Deque<Character> stack = new ArrayDeque<Character>(); // it is faster than regular queue
    
    for(int i = 0; i <str.length(); i++){
      char x = str.charAt(i);

      if(x=='(' || x=='{' || x=='['){

        stack.push(x);
        // skip the other character 
        continue;

      }


      if(stack.isEmpty())
        return false;

      char check;

      switch(x){

        case ')':
          check = stack.pop();
          if(check=='{' || check == '[')
            return false;
          break;

        case '}':
          check = stack.pop();
          
          if(check=='(' || check=='[')
            return false;
          break;
        case ']':
          check = stack.pop();

          if(check == '(' || check == '{')

            return false;
          break;
      }
    }

    return (stack.isEmpty());
  }


  public static void main(String[] args){

    String str = "(e(+{{}})[)";

    if(areBal(str)){
      System.out.println("Matched");
    }
    else{
      System.out.println("Not matched");
    }

  }

}
