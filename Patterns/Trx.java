public class Trx {
  public static void main(String[] args) {
    
    int n = 10;

    for(int i = 0; i < 10; i++){
      
      for(int j = 0; j < n-i; j++){
        System.out.print(" ");
      }

      for (int k = 0; k < i ; k++) {
        System.out.print("* ");
        
      }
      System.out.println();
    }
  }
}
