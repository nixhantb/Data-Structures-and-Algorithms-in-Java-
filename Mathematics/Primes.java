public class Primes{
  static void Pairs(int n){

    int flag;
    for(int i=1;i <= n; i++){

      // this loops should have complexity logn

      if(i==1 || i==0)
      {
        continue;
      }

      flag = 1;
      for(int j=2; j <= i/2; j++){

        if(i%j==0){
          flag=0;
          break;}


      }

      if(flag==1){
        System.out.println(i);
      }
    }

  }

  public static void main(String[] args) {
    Pairs(19);
  }
}
