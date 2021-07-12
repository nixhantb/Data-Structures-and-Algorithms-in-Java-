public class GCD{
  static int findGCD(int a, int b){
    while(a!=b){
     if(a==0)
       return b;
     if(b==0)
       return a;
      if(b>a)
        b = b-a;

      if(a>b)
        a = a-b;

    }

    return a;

  }

  public static void main(String[] args) {
    System.out.println(findGCD(0,18));
  }
}
