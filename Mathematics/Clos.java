public class Clos{

  static int find(int m, int n){

    int q = m/n;

    int n1  =q*n;

    int n2 = (m*n)>0?m*(q+1):m*(q-1);// last expression is fot the negetive numbers 

    if(Math.abs(n-n1)<Math.abs(n-n2)){
      return n1;
    }

    return n2;


  }

  public static void main(String[] args) {
    
    System.out.println(find(15,7));
  }
}
