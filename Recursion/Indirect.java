// Indirect Recursion 

public class Indirect{
  static void A(int n){

    if(n>0){
      System.out.println(n);
      B(n-1);
      
    }
  }

  static void B(int n){

    if(n>0){
      System.out.println(n);
      A(n/2);
    }

  }

  public static void main(String[] args){
    A(20);
  }
}
