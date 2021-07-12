public class BintoDec{
  static void BintoD(int n){
  int s = -1;
  int result = 0;
    while(n!=0){

      int d = n%10;
      s+=1;

      result+=((int)Math.pow(2,s)*d); // n

      
      n/=10;// logn


    }
System.out.println(result);// O(nlogn)
    
  }

  public static void main(String[] args) {
    BintoD(10001000);
  }
}
