public class Shellsort{

  static void shell(int a[], int n){

    int temp,j;

    for(int gap = n/2; gap>=1; gap/=2){
      // sucessive division until it becomes 1
      //
      for(int i = gap; i <n; i++){


        temp = a[i];

        // will be in 5th place at first
        j = i-gap;

        while(j>=0 && a[j]>temp){
          // a[0] > a[5] at first, then swap 
          a[j+gap] = a[j];
          j =j-gap;
        }
        a[j+gap] = temp;
      

      }
    }
  }
  public static void main(String[] args){

    int a[] = {4,5,6,2,4,6,7,3,1,3,55,6,4,443,2,4,5,777,90};
    int n = a.length;
    shell(a,n);

    for(int i = 0; i<n; i++){
      System.out.print(a[i]+" ");
    }
  }
}
