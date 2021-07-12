public class paircube{

  static int par(int n){

    int count = 0; 
    for(int i=0;i<=Math.cbrt(n);i++){
      int x = i*i*i;

      int dif = n-x;

      int cbt = (int)Math.cbrt(dif); // 2

      if(cbt*cbt*cbt==dif){

        count++;
      }

    }
    return count;
  }

  public static void main(String[] args) {
    System.out.println("The possible pair is ");
    System.out.println(par(9));
  }
}
