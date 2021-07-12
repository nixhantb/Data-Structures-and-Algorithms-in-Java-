public class Tlop{
  static double s =1;
  static double lo(int x, int n){

    for(; n>0; n--){
      s = 1+x*s/n;
    }

    return s;

  }
  public static void main(String[] args){

    System.out.println(lo(4,15));
  }
}
