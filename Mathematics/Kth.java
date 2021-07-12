public class Kth{
  static int printKth(int A, int B, int K){

    int res=(int)Math.pow(A,B);
    
    int k = 0;

    while(res!=0 && K-->0){
      
      int r = res%10;
      k = r;

      res/=10;

    
    
    }

    return k;

  }

  public static void main(String[] args) {
    System.out.println(printKth(3,3,2));
  }
}
