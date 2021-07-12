public class Prime{

  static int findPrime(int n){
  
    int flag = 0;
    if(n<=1){
      return 0;
    }

    else{

      for(int i =2; i < n; i++){

        if(n%i==0){

          flag = 1;

          break;


        }
      }
    }

    if(flag==0){
      return 1;
    }

    else{
      return 0;
    }
  }

  public static void main(String[] args) {
    
    System.out.println(findPrime(2));
  }
}
