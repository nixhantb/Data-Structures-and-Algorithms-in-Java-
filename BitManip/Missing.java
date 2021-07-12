public class Missing{
  public static void main(String[] args) {
    int n = 10;
    int res = n*(n+1)/2;
    int a[] = {2,3,4,5,6,7,8,9,10};

    int sum = 0;
    for(int i =0; i <a.length;i++){
     sum+=a[i];
    }
    System.out.println(res-sum);

  }
}
