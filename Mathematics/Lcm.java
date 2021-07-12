import java.util.*;
public class Lcm{
  static int lcmm (int a, int b){
    int x = a;
    int y = b;
    while(a!=b){
      if(a==b)
        return b;

      if(b==0)
        return a;


      if(b>a)
        b=b-a;

      if(a>b)
        a=a-b;

    }
    return a;
  }

  static int[] lcmo(int a, int b){
 int r = lcmm(a,b);
 int h = (a*b)/r;

 int ar[] = new int[2];

 ar[0] = r;
 ar[1] = h;

 return ar;
    

  }

  public static void main(String[] args) {
     

    int a[] = lcmo(14,8);

     

    System.out.println(a[0]);
    System.out.println(a[1]);
  }
}
