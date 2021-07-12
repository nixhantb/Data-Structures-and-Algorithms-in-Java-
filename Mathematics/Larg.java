public class Larg{
  static long larg(long n){

    long max  = -1;

    while(n%2==0){

      max = 2;

      n/=2;
    }

    // now come to the odd case ,  

    for(int i=3; i < Math.sqrt(n); i+=2){

      while(n%i == 0){

        max = i;

        n/=i;
      }


    }

    if(n > 2)
      max = n;
    return max;

  }

  public static void main(String[] args) {
    
    System.out.println(larg(2));
  }
}
