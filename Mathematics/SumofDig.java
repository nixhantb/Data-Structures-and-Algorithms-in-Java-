public class SumofDig{
  static int sumof(int n){

    int sum = 0;

    while(n!=0){

      int rev = n%10;

      sum+=rev;
      
      n = n/10;

    }

    return sum;
  }

  public static void main(String[] args) {
    
    System.out.println(sumof(56));
  }
}
