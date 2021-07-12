public class Reverse{
  static int revMe(int n){

    int s = 0;
    while(n!=0){

      int r = n%10;

      s = s*10+r;

      n/=10;

    }

    return s;
  }

  public static void main(String[] args) {
    int n = 345;

    System.out.println("The reverse of the number "+n+" is "+revMe(n));
    System.out.println();
    System.out.println("Time Complexity O(Logn)");
    System.out.println("Space Complexity (1))");
  }
}
