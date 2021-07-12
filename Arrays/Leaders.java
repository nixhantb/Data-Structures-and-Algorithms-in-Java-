public class Leaders{
  public static void main(String[] args) {
    int a[] = {16,17,4,3,5,2};
    int n = a.length;

    int max;
    max = a[n-1]; // right most element is always a leader
    System.out.print(max+" ");
    
    for(int i = n-2; i >=0; i--){

      if(a[i] > max){
        max = a[i];
        
      System.out.print(a[i]+" ");
      }

    }


  }
}
