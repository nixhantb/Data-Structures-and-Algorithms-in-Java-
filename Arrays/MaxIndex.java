public class MaxIndex { 

  // function 

  static int max(int a, int b){

    return a>b?a:b;
  }

  static int min(int a, int b){
    return a<b?a:b;
  }


  static int maxinc(int a[], int n){

    int L[] = new int[n];
    int R[] = new int[n];

    // L needs to be filled from left hand side 
    // R needs to be filled from RHS

    L[0] = a[0];
    for(int i = 1; i < n; i++){

      L[i] = min(a[i], L[i-1]);

    }

    R[n-1] = a[n-1];

    for(int j = n-2; j>=1; j--){

      R[j] = max(a[j], R[j+1]);
    }

    int i = 0;
    int j = 0;

    int max_i = -1;

    while(i < n && j < n){

      if(L[i] < R[i]){

        max_i =  max(max_i, j-i);

        j = j+1;
      }
      else{

        i = i+1;
      }
    }
    return max_i;

  }

  public static void main(String[] args) {
    
    int a[] = {9,2,3,4,5,6,7,8,18,0};
    int n = a.length;

    System.out.println(maxinc(a, n));
  }
}
















