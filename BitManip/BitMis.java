public class BitMis {

  public static void main(String[] args) {
    
    int a[] = {1,2,4,5,6};

    int n = a.length;

    int x1 = a[0];
    int x2=0;

    for(int i = 1 ; i <n; i++){

      x1 = x1^a[i];
    }

    for(int i = 1; i <=n+1; i++){

      x2 = x2^i;
    }
    System.out.println(x1^x2);
  }
}
