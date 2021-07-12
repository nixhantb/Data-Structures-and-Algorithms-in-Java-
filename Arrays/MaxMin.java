public class MaxMin{

  static int[] minM(int a[], int n){

    int min = a[0];
    int max = a[0];

    int arr[] = new int[2];

    for(int i = 0; i <n; i++){

      if(a[i] > max)
        max = a[i];

      if(a[i] < min)

        min = a[i];

    }

    arr[0] = min;
    arr[1] = max;

    return arr;


  }


  static void p(int arr[]){

    arr = minM(arr, arr.length);
    for(int i = 0; i < 2; i++){

      
      System.out.println(arr[i]);
    }
  }



  public static void main(String[] args) {
    
    int a[] = {3,1,3,5,77,2,13};

    int n = a.length;

    
    p(a);
  }
}
