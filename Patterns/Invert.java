public class Invert {
  public static void main(String[] args) {
    
    int w = 15;
    int n = w*2;
    

    // row 
    for(int i=0; i < n; i++){
      for(int j =0; j < i; j++){
        System.out.print(" ");
      }

      for(int k = n-1; k>=2*i+1; k--){

        System.out.print("*");
      }
      System.out.println();
    }
  }
}
