public class Ispalindrome{
  static int isPal(int n){
    int s = 0;

    while(n!=0){

      int r = n%10;

      s = s*10+r;

      n/=10;

    }

    return s;
     }

  static int sumOf(int n){

    int sum = 0;

    while(n!=0){

      int rev = n%10;

      sum+=rev;

      n = n/10;

    }

    return sum;
  }

  public static void main(String[] args) {
    int s = sumOf(56);

    if(isPal(s)==s){
      System.out.println("Yes, It is palindrome");
    }
    else{
      System.out.println("No, It ain't Palindrome");
    }
  }
}
