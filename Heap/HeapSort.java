public class HeapSort{

  public void sort(int arr[]){

    int n = arr.length;

    for(int i  = n/2-1;i>=0; i--){
        heapify(arr, n, i);
    }


    for(int i =n-1; i>=0; i--){

      int temp = arr[0];
      arr[0]= arr[i];
      arr[i] = temp;

      heapify(arr,i,0);
    }
  }
  

  void heapify(int arr[], int n, int i){

    int largest = i;

    int l = 2*i+1;
    int r = 2*i+2;

    if(l<n && arr[l]> arr[largest])
      largest = l;

    if(r < n && arr[r] > arr[largest])
      largest = r;

    if(largest!=i){
      int temp = arr[i];
      arr[i] = arr[largest];
      arr[largest] = temp;

      heapify(arr,n,largest);
    }
  }

  void print(int a[]){

    for(int i=0;i<a.length; i++){
      System.out.print(a[i]+" ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    
    HeapSort h = new HeapSort();
    int a[] = {5,10,30,20,35,40,15};
    System.out.println("Before Heap Sort");
    h.print(a);
    System.out.println("After Heap Sort:\n");

    h.sort(a);
    h.print(a);

    
  }
}
