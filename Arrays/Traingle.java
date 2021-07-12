import java.io.*;
import java.util.*;
public class Traingle{

  static int poss(int a[], int n){

    Arrays.sort(a);
    int count = 0;
    for(int i = 0; i < n-2; i++) // first side 
    {

      int k = i+2; // third side  

      for(int j = i+1;  j < n; j++){
        
        while(k < n && a[i]+a[j] > a[k])
          k++;
      
      if(k > j){
        count+=k-j-1;
      }
      }
      
    }
    return count;

    
  }


  public static void main(String[] args) {
    
    int a[] = {10, 21, 22, 100, 101, 200, 300};

    int n = a.length;

    System.out.println(poss(a, n));
  }
}
