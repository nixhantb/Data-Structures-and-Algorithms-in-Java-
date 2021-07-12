public class Dsec {
  public static void main(String[] args){
    int a[][]= {{3,0,0,0,4},
               {0,7,0,8,0},
               {0,0,4,0,0},
               {0,9,0,9,0},
               {0,0,0,0,0}};
    int n = 5-1;


    for(int i = 0; i<5; i++){
      

      System.out.print(a[i][n]+" ");

      n--;
    }
  }
}
