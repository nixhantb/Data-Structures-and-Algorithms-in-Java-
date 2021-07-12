public class Sp{

  public static void main(String[] args){
   int a[][]
                = {
                    {0, 0, 3, 0, 4},
                    {0, 0, 5, 7, 0},
                    {0, 0, 0, 0, 0},
                    {0, 2, 6, 0, 0}
                };
   
      int size = 0;

      for(int i = 0; i <4; i++){

        for(int j = 0; j <5; j++){
            
          if(a[i][j]!=0){
            size++;
          }
        }
      }

      int mat[][] = new int[3][size];

      int k = 0;
      for(int i = 0; i<4;i++){

        for(int j = 0; j <5; j++){

          if(a[i][j]!=0){

            mat[0][k] = i;
            mat[1][k] = j;
            mat[2][k] = a[i][j];
            k++;
          }

          
        }
      }

      for(int i = 0; i<3; i++){
        for(int j = 0; j <size; j++){

          System.out.print(mat[i][j]+" ");
        }
        System.out.println();

      }

  }
}
