public class Return {

  static void returnM(int n){

    if(n>0){

      System.out.println("Hello");
      returnM(n-1);
      // it will call until it finishes 
      System.out.println(n);
    }
  }

  public static void main(String[] args){

    returnM(10);
  }
}
