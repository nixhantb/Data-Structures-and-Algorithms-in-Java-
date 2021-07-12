public class PPrim{

  static int PPrim(int n){

    // a^3 + b^3 = N

    int count = 0;
    for(int i = 0; i < Math.cbrt(n); i++){

      int a = i*i*i;

      int dif = n-a;

      int d =(int) Math.cbrt(dif);


      if(d*d*d == dif)
        count++;
    }

    return count;
  }

  public static void main(String[] args) {
    
    System.out.println(PPrim(9));
  }
}
