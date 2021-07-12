public class RotateArray{

  public static void main(String[] args) {
   int a[] = {1,2,3,4,5};
  int k = 2;

  int n = a.length;
  while(k-- > 0){
  int temp = a[0];
  for(int i = 0; i < n-1; i++){
     
    a[i] = a[i+1];
  }
  a[n-1] = temp;
  }
  for(int i = 0; i < n; i++){
    System.out.print(a[i]+" ");
  }

  }
}
