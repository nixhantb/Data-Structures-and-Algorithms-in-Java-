public class Quicksort{
  static void swap(int a[], int i, int j){
    int temp = a[i];
    a[i] = a[j];
    a[j] = temp;
  }

  static int partition(int a[], int l, int h){

    int pivot = a[l];
    int i = l;
    int j = h;
    
    do{
     
      do{i++;}while(i<h && a[i]<=pivot);
      do{j--;}while(a[j]>pivot);
    
      if(i<j)swap(a,i,j);
    }while(i<j);

      swap(a,l,j);
      return j;
  }

    

  static void quick(int a[], int l, int h){

    int j;
    if(l<h){
      j = partition(a, l,h);

      quick(a,l,j);
      quick(a,j+1,h);

    }
  }

  public static void main(String[] args){

    int a[] = {4,5,22,5,6,3,3,6,7,5,3,1,1};
    int n = a.length;

    System.out.println("\nBefore sorting\n");
    for(int i = 0; i <n; i++){
      System.out.print(a[i]+" ");
    }
    quick(a,0,n);

    System.out.println("\nAfter sorting\n");
    for(int i =0; i <n; i++){
      System.out.print(a[i]+" ");
    }
  }
}
