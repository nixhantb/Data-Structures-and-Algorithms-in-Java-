public class TailRecursion {
  // Tail recursion
  // Everything is done at the calling time
  // (n-1)+n is not the tail recursion because, it prints at the run time

  static void printme(int n){
    if(n>0){
      System.out.println(n);
      printme(n-1);
    }
  }
  public static void main(String[] args){
    printme(5);
  }
}
