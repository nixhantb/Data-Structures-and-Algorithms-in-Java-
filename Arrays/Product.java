public class Product{

  static void printMe(int a[], int n){

    int L[] = new int[n];
    int R[] = new int[n];

    int prod[] = new int[n];


    L[0] = 1;

    R[n-1] = 1;

    // for left 

    for(int i = 1; i < n; i++){
      L[i] = a[i-1]*L[i-1];
    }


    // for the right 

    for(int i = n-2; i >=0 ; i--){
      R[i] = a[i+1]*R[i+1];
    }

    for(int i =0; i<n; i++){

      prod[i] = L[i]*R[i];
    }

    for (int i = 0; i < n; i++) {

      System.out.print(prod[i]+" ");
      
    }
  }
  public static void main(String[] args) {
    int a[] = {10,3,5,6,2};
    int n = a.length;

    printMe(a,n);
  }
}
