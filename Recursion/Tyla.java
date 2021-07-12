public class Tyla {

  static double s = 1;
  static double myT(int x, int n){
    if(n==0){
      return s;
    }

    s = 1+x*s/n;
    return myT(x,n-1);
  }

  public static void main(String[] args){

    System.out.println(myT(4,15));
  }
}
