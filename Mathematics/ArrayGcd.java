public class ArrayGcd{

static int gcd(int a, int b){
  if(a==0)
    return b;
  return gcd(b%a,a);

}

static int findGCD(int a[], int n){

  int result = 0;

  for(int x:a){

    result = gcd(result,x);

     }

  // if result is 1 at any time, we will just return 1 without further process
 if(result == 1){
      return 1;
    }


return result;
}





  public static void main(String[] args) {
    int a[]={2,4,6};
    int n = a.length;
    System.out.println(findGCD(a,n));
  }
}
