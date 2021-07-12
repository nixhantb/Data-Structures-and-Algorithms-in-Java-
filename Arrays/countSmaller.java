public class countSmaller{
  static int small(int a[], int n, int x){

    int sum = 0;
    for(int i = 0; i < n; i++){
      if(a[i]<x){
        sum++;
      }

      }
    
    return sum;
    }

    
  

  public static void main(String[] args) {
    int a[] = {2,3,1,4,5,7,44,1};
    int n = a.length;
    System.out.println(small(a,n,4));
  }
}
