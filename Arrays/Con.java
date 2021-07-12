import java.util.*;
public class Con {

  static int trai(int a[], int n) 
  {
    Arrays.sort(a);

    int res = 0;

    for (int i = 0; i < n; i++){

      int k= i+2; //3 

      for(int j = i+1; j < n-1; j++)
      {

        while( k < n && a[i]+a[j] > a[k])
          k++;

        if(k > j ){

          res+=k-j-1;
        }
      }
    }

    return res;
  }

  public static void main(String[] args) {
    int a[] = {3,4,5};
    int n = a.length;

    System.out.println(trai(a,n));
  }
}
