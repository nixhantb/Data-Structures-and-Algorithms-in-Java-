public class Tayler{
    static double r;
     static double f = 1;
     static double  p = 1;
  static double tser(int x, int n){
    if(n==0){
      return 1;
    }
    else{

      r = tser(x,n-1);
      p = p*x;
      f = f*n;

      return r+(p/f);
    }
  }
  
  public static void main(String[] args){
    System.out.println(tser(4,15));
  }
}
