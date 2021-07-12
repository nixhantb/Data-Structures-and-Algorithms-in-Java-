
public class NestedRe{

  static int nestN(int n){
    // enter the number 
    if(n>100){
      return n-10;
    }

    else{

      return nestN(nestN(n+11));


    }
  }
  public static void main(String[] args){

    System.out.print(nestN(95)+" ");

   }
  }


