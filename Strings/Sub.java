import java.util.*;

public class Sub {

  public static void main(String[] args) {
    
    String x = "gksrek";
    String y = "geeksforgeeks";


    char a[] = x.toCharArray();
    char b[] = y.toCharArray();


    int j=0;
    int m = x.length();
    int n = y.length();
    for(int i = 0; i < n && j <m; i++){

      if(a[j]==b[i]){ // increase J if matching character is found 

        j++;

      }
      
     }
    System.out.println(j==m);
  }
}
