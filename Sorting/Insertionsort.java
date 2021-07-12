public class Insertionsort{
  
  static void insertMe(int a[], int n){


    for(int i = 1; i <n; i++){
      // it starts from 1 because we assume, 0th index element is already sorted 
      int j = i-1;
      // for the first. i=1;
      // j = i-1; =0 so, we compare them;
      int x =a[i];
      while(j>-1 && a[j]>x){
        a[j+1] = a[j];
        j--;
      }
      a[j+1] = x;

      

  }
  }

  static void insertionPrint(int a[], int n){

    System.out.println("\nBefore Insertion sort\n");
    for(int i =0; i <n; i++){
      System.out.print(a[i]+" ");
    }
    insertMe(a,n);
    System.out.println("\nAfter Insertion Sort\n");
    for(int i =0; i <n; i++){
      System.out.print(a[i]+" ");
    }
  }

  public static void main(String[] args){
    int a[] = {44,32,553,12,34,231,1,2345};
    int n = a.length;

    insertionPrint(a,n);
  }
}
