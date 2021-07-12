public class Second{

  static int find(int a[], int n){

    int max = a[0];

    int Sec = a[0];

    int c=0;
    
    if(n <=1){
      return  -1;
    }
    for(int i = 0; i < n; i++){

      
      if(a[i] > max)

        max = a[i];

      }
    
    for(int i = 0; i < n; i++){

      if(a[i] != max){

        if( a[i] > Sec)
          Sec = a[i];
      }
    }
    


    return Sec;

    }

  

    

  public static void main(String[] args) {
    int a[]= {1,5,66,12,3,553,1};
    int n = a.length;

    System.out.println(find(a, n));
  }
}
