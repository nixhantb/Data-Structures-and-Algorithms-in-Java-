public class Dup{

  public static void main(String[] args) {
    int a[] = {1,1,2,2,3,3,4,4,5};
  int n = a.length;
  int t = 0;
  
  for(int i = 0; i <n-1; i++){

    if(a[i]!=a[i+1]){
      
      a[t++] = a[i];

    }

  }
  a[t++] = a[n-1];
  for(int i = 0; i<t; i++){

    System.out.println(a[i]);

  }


}
}
