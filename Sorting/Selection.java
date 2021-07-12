public class Selection{

  static void swap(int a[], int i,int k){

       int temp = a[i];
       a[i] = a[k];
       a[k] = temp;
      }

  static void select(int a[], int n){
    
    for(int i = 0; i <n-1; i++){


      for(int j= i; j <n; j++){
          int k = i;



        if(a[j]<a[k]){
          k = j;
        }
      
        swap(a,i,k);

    }

    
  }
  }

  public static void main(String[] args){

    int a[] = {4,2,5,7,2,6,87};
    int n = a.length;
    select(a,n);

    for(int i = 0; i <n; i++){

      System.out.print(a[i]+" ");
    }
  }
}
