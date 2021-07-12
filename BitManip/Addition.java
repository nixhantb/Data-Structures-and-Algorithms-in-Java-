import java.util.*;
public class Addition {



static int add(int x, int y) {
  
  while(y!=0){
    int c = (x)&y;
    x = x^y;
    y = c<<1;
  }
  return x;
}
public static void main(String[] args) {
  
  Scanner sc = new Scanner(System.in);
  int a = sc.nextInt();
  int b = sc.nextInt();
  System.out.println(add(a,b));
}
}
