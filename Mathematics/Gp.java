public class Gp{
  static int findme(int a, int r, int n){

    return a*(int)Math.pow(r,n-1);
  }

  public static void main(String[] args) {
    System.out.println(findme(2,2,4));
  }
}
