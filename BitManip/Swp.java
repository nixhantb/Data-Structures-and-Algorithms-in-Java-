import java.util.*;

public class Swp {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    System.out.println("Before Swapping");
    System.out.println(a+" "+b);

    a = a^b;
    b = a^b;
    a = a^b;
    System.out.println("After Swapping");
    System.out.println(a+" "+b);
  }
}
