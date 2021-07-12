public class ldr {

  public static void main(String[] args) {
    
    int a[] = {16, 17, 4, 3, 5, 2 };
    int n = a.length;

    int max = a[n-1];
    // last element is always the leader 

    System.out.print(max+" ");
    for(int i = n-2;i >=0; i-- ){

      if(max < a[i]) 
      {

        max = a[i];
        System.out.print(max+" ");
      }


      
    }

      



      
  }
}
