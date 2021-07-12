
public class MaxSum{

  static int max(int x, int y){ 

    return x>y?x:y;
  }

  static int maxPath(int a1[], int a2[], int m, int n){
    // m is size of a1 
    // n is size of a2 

    int i = 0, j = 0;
    int result = 0, sum1 =0,sum2 = 0;

    while( i < m && j < n) {

      if(a1[i] < a2[j])
        sum1+=a1[i++];

      else if( a1[i] > a2[j]) 
        sum2+=a2[j++];
      
      else {

        result+=max(sum1, sum2);

        sum1 = 0;
        sum2 = 0;

        int temp = i; 
        // j is 4 
        // i is 3 

        // keep updating if there is any other common element in both array 

        while( i < m && a1[i] == a2[j]){

          sum1+=a1[i++];

        }


        while( j < n && a1[temp] == a2[j]){

          sum2+=a2[j++];
        }

        result+=max(sum1,sum2);

        sum1 = 0;
        sum2 = 0;
      }
    }

    // add remaining elements 

    while( i < m)
      sum1+=a1[i++];

    while( j < n)
      sum2+=a2[j++];


    result+=max(sum1, sum2);

    return result;

  }
    public static void main(String[] args) {
      int ar1[] = { 2, 3, 7, 10, 12, 15, 30, 34 };
        int ar2[] = { 1, 5, 7, 8, 10, 15, 16, 19 };
        int m = ar1.length;
        int n = ar2.length;

        System.out.println(maxPath(ar1,ar2,m,n));
    }

  }














