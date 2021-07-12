public class Compare {
  
  static void fun(int n){
    // here space complexity is O(1) as n is just using 1 space, 
    // in recursion, there was 4 activation function in a stack, if n = 5 
    while(n>0){
      System.out.println(n);
      n--;
    }
  }
  public static void main(String[] args){
    fun(5);
  }
}
