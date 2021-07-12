public class Tridiag{

  public static void main(String[] args){
      int[][] matrix = {{1, 4, 0, 5}, {3, 4, 1, 4}, {9, 2, 3, 4}, {5, 4, 1, 3}};

      System.out.println("Matrix Representation");
      for(int i =0; i <4; i++){

        for(int j =0; j <4; j++){

          System.out.print(matrix[i][j]+"\t");
        }
        System.out.println();
      }

     
      System.out.println("Making  it is tridiagonal or not");

       for(int i =0; i <4; i++){

        for(int j =0; j <4; j++){

          if(Math.abs((i-j))>1){

            System.out.print("0\t");
          }
          else{
            System.out.print(matrix[i][j]+"\t");

          }
        }
        System.out.println();
      }

      


  }
  
  
}
