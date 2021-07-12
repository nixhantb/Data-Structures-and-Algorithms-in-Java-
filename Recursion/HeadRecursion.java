// actuall in the head recursion, the function is called and something is there after the function call 
public class HeadRecursion {

  static void head(int n){

    if(n>0){
      head(n-1);
      System.out.println(n);


    }
  }
  
  static void whil(int n){
    int i = 1;
    while(i<=n){
      System.out.println(i);
      i++;
    }
  }
  
  public static void main(String[] args){
//    head(5);
      whil(5);
  }
}
