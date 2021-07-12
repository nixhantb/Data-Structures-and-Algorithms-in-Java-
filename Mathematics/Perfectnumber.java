public class Perfectnumber{
  static int isperf(int n){


    int sum = 0;
    for(int i = 1;i <Math.sqrt(n)+1; i++){
      
      if(n%i==0)
        sum+=i;
    }

    if(sum==n){
      return 1;
    }
    else{
      return 0;
    }
  }

  public static void main(String[] args) {
    
    System.out.println(isperf(10));
  }
}
