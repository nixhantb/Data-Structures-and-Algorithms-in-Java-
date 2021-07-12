public class Power{

  static int pm(int n, int e){

    if(e==0 || e==1){
      return n;
    }
    else{
      return n*pm(n,e-1);
    }
  }

  public static void main(String[] args){

    System.out.println(pm(4,2));
  }
}
