public class Fib{
  static int t0=0;
  static int t1 =1;
  static int sum = 0;
  static int fibo(int n){

    if(n<=1){
      return n;
    }
    
    for(int i = 2; i <=n; i++){
      sum = t0+t1;
      t0 = t1;
      t1 = sum;
    }
    return sum;
}

public static void main(String[] args){
  System.out.println(fibo(6));
}
}
