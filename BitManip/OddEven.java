// WAP to find whether the number is odd or even 
import java.util.*;
public class OddEven {
  static boolean even(int a){

    
    int m = a>>1;
    // a&1 works as well 
    if((a & m)==0){
      return true;
    }

    return false;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();

    if(even(a)==true){
      System.out.println("Even");
    }
    else{
      System.out.println("odd");
    }

    
   

  }
}
