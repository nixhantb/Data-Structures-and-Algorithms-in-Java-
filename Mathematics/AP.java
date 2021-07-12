public class AP{
static int printAp(int A1, int A2, int n) {

  return A1+(A2-A1)*(n-1);
    }
  
public static void main(String[] args) {
  System.out.println(printAp(1,2,10));
}
}
