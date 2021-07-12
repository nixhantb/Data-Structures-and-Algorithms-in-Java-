// If the function is calling itself for more than one time is known as Tree recursion

public class Tree{

  static void printme(int n){
    if(n>0){
       System.out.println(n);
       printme(n-1);
       printme(n-1);

    }
     }


  public static void main(String[]  args){
    printme(3);
  }
}
