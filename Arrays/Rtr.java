// java class 

public class Rtr{

  static int[] Rotate(int a[], int k) {
    int n = a.length;
    // break down the problem 

    while( k -- > 0) {
    int temp = a[0];
    for (int i = 0; i < n-1; i++){

        a[i] = a[i+1];

        
    }

    a[n-1]  = temp;

    }
    return a;
  }


  static void Print(int a[], int k  ){

    int n = a.length;

    Rotate(a, k);
    for(int i = 0; i < n; i++){

      System.out.print(a[i]+" ");
    }
  }

  public static void main(String[] args) {
    
    int a[] = {1,2,3,4,5};
    int k = 2;

    Print(a, k);
}
}
