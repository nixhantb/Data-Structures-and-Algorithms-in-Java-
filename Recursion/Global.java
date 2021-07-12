public class Global{
  
   static int x = 0;
  static int fun(int n){

    if(n>0){
      x++;
      return fun(n-1)+x;
    }
    else{
      return 0;
    }
  }

  public static void main(String[] args){

    System.out.println(fun(5));
  }
}


