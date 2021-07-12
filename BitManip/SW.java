public class SW{
  public static void main(String[] args) {
    int a = 4;
    int b = 5;

    System.out.println("Normal");
    a = a+b;
    b =a-b;
    a = a-b;
    System.out.println(a+" "+b);
    System.out.println();
    System.out.println("XOR");
    int x =6;
    int y = 7;

    x = x^y;
    y = x^y;
    x =x^y;
    System.out.println(x+" "+y);
  }
}
