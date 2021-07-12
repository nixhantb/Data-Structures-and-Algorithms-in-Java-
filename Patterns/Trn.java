public class Trn {

  public static void main(String[] args) {
    
    int k  = 10;

    for(int i = 0; i < k; i++){

      for(int t = 0; t < k-i; t++){
        System.out.print(" ");
      }
      for(int j = 0; j<2*i+1; j++){
        System.out.print("*");
      }


      System.out.println();
    }
  }
}
