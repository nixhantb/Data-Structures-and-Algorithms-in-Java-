public class Kthroot{


  static double power(double x, double y){

    double result = x;

    for (int i = 1; i < y; i++) {
      result = result * x;
    }

    return result;
  }

  static double rootme(int n, int m){
    return power(n,1./m);
  }
  public static void main(String[] args) {

    System.out.println(rootme(9,2));

  }
}
