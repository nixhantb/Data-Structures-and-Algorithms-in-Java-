import java.util.*;
public class Duplic{

  public static void main(String[] args) {
    
    int a[] = {2,3,1,2,3};

    Arrays.sort(a);
    int n = a.length;
    int j = 0;
    int f=0;
    for(int i = 0; i < n-1;i++){

      if(a[i]==a[i+1])
      {
        f = 1;
      }

      else{
        f=0;
      }
      
      if(f==1){
        System.out.print(a[i]+" ");
      }


      }


    if(f==0){
      System.out.println("-1");
    }
    
  }
}
