public class Wave{

  static void swap(int ar[],int a, int b){
    int temp = ar[a];
    ar[a] = ar[b];
    ar[b] = temp;
  }
  public static void main(String[] args) {
    
    int a[] = {1,2,3,4,5};

    for(int i = 0; i < a.length-1; i+=2){

      swap(a, i,i+1);
    }


    for (int i = 0; i < a.length; i++) {

      System.out.print(a[i]+" ");
      
    }
  }
}
