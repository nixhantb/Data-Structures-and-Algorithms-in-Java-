public class SumNat{
  static int sum(int n){
    if(n>0){
      return n+sum(n-1);
    }

    return 0;
  }

  public static void main(String[] args){

    System.out.println(sum(5));
  }
}
