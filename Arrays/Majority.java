import java.util.*;
public class Majority {

  static int findM(int a[], int n){

    Arrays.sort(a);

    int p = -1;
    int count = 0;

    for(int i = 0; i < n; i++){

      if( p != -1){

        if(a[i] == a[p]){

          count++;
        }


      }
      p = i;
    }


    if(count >=n/2){
      int k = a[count];
      return k;}

    return -1;
  }

  public static void main(String[] args) {
    int a[] = {3,1,3,3,2};
    int n = a.length;

    System.out.println(findM(a, n));
  }
}
