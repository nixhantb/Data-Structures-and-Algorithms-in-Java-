public class GCDA{
  static int gcd(int a, int b){

    if(a==0){
      return b;
    }

    else{
      return gcd(b%a, a);
    }
  }

  // make gcd for array

  static int gca(int a[]){
    int result = 0;

    
    for(int i = 0; i < a.length; i++){
    result = gcd(result, a[i]);
    }

    if(result == 1){
      return 1;
    }

    return result;
  }

  public static void main(String[] args) {

    int a[] = {2,4,6};

    System.out.println(gca(a));
    
  }
}
