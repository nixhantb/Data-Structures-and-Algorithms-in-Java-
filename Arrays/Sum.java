public class Sum{

  static int summe(int a[],int n){

    int sum = 0;

    for(int i = 0; i < n; i++){
      sum+= a[i];

    }

    return sum;
  }

  public static void main(String[] args) {

    int a[] = {4,5,2,1,4,2};
    int n = a.length;
    System.out.println(summe(a,n));
  }
}
