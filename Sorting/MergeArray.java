// Simple process for merging the two array 

public class MergeArray {

  static void merge(int a[], int b[], int n, int m){
    // here n and m are the sizes of a and b

    int c[] = new int[30];

     int i = 0,j=0,k=0;
     while(i<n && j<m){
       
       if(a[i] < b[j]){
         c[k++] = a[i++];
       }
       else{
         c[k++] = b[j++];
       }
     }


     for(; i <n;i++){

       c[k++] = a[i];
     }

     for(; j<m; j++){
       c[k++] = b[j];
     }



     for(i = 0; i<7;i++){
       System.out.print(c[i]+" ");
     }
  }

  public static void main(String[] args){

    int a[] = {2,3,4};
    int b[] = {5,6,7,8};
    int n = a.length;
    int m = b.length;
    merge(a,b,n,m);

  }

  }
