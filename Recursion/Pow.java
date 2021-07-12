public class Pow{

  static int p(int n, int e){
    if(e==0){
      return 1;
    }
    if(e%2==0){
      return p(n*n,e/2);
    }
    else{
      return n*p(n*n,e/2);
    }
  }

  public static void main(String[] args){

    System.out.println(p(4,1));
  }
}
