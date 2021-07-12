public class CallPrint{
  static void call(int n){

    if(n>0){
      System.out.println(n);
      call(n-1);
    }
  }
  public static void main(String[] args){
    call(5);
  }
}
