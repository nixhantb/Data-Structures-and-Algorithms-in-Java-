public class Unique{
  public static void main(String[] args) {
    
    int a[] = {2,3,7,9,11,2,3,11};
    int n = a.length;

    int sum=0;

    for(int i = 0; i < n; ++i){

      sum = (sum^a[i]);
    }
    sum = (sum&-sum);

    int  sum1 = 0;
    int sum2 = 0;

    for(int i = 0; i <a.length; i++){
      
      if((a[i]&sum) >0){

        sum1 = (sum1^a[i]);
      }
      else {

        sum2 = (sum2^a[i]);
      }
    }
    System.out.println(sum1+" "+sum2);
  }
}

