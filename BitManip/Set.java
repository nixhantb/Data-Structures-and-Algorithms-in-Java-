public class Set{
  static int setM(int a, int i){

    int mask = 1 <<i;
    int r = mask | a;

    return r;
  }
  public static void main(String[] args) {
    
    System.out.println(setM(8,2));
    
  }
}
