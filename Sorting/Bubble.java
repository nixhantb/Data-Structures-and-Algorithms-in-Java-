public class Bubble{
 
  static void myBubble(int a[], int n){

    for(int i = 0; i<n-1; i++){
      // No of comparision
      for(int j = 0; j <n-i-1; j++){
        // No of swaps 
        // n-1-i , in every ith complete, one element is sorted
        // No need to compare that

        if(a[j]>a[j+1]){
        
          int temp =a[j];
          a[j] = a[j+1];
          a[j+1] = temp;

        }
      }
    }

      }

  public static void main(String[] args){
      int a[] = {6,4,23,5,64,24,64,1,2,5,6};
       int n = a.length;

        myBubble(a,n);
    for(int i = 0; i <n; i++){
      System.out.print(a[i]+" ");
    }

  }
}
