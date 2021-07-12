public class Pairso{

  static void print(int n){

    int flag;

    for (int i = 1; i<=n; i++){

      if(i==0 || i ==1){
        continue;
      }

      flag = 1; // is prime 
      for (int j = 2; j <=i/2; ++j){


        if (i%j == 0){
            flag = 0;
            break;
        }





      }

     if(flag == 1){
       System.out.println(i);
    }

  }
  }

  public static void main(String[] args) {
    print(10);
  }
}
