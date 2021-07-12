public class Countsort{

  static int findMax(int a[],int n){

    int max = a[0];
    for(int i =0; i <n; i++){
      if(a[i] >max){
        max = a[i];
      }
    }
    return max;
  }
  static void count(int a[], int n){
    int k = findMax(a,n);
    int c[] = new int[k+1];

    for(int i = 0; i <k+1;i++){
      c[i] = 0;
    }

    for(int j = 0;  j <n; j++){
      c[a[j]]++;
    }

    int i=0,j=0;
    while(j < k+1){

      if(c[j]>0){
        a[i++] = j;
        c[j]--;
      }
      else{
        j++;
      }
    }
    
    }


  public static void main(String[] args){

    int a[] = {5,6,3,2,3,3,5,5,6,1,1};

    int n = a.length;
    
    count(a,n);

    for(int i=0;i <n; i++){
      System.out.print(a[i]+" ");
    }
  }
}

