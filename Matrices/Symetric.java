// Symmetric Matrix 

public class Symetric {

  public static void main(String[] args){

    int[][] a = {{15, 25, 35}, {45, 55, 65}, {75, 85, 95}};
    int f = 0;
    for(int i = 0; i <3; i++){

      for(int j = 0; j <3; j++){

        if(a[i][j] != a[j][i]){

          f++;
          break;
        }
      }
    }
    System.out.println("Matrix form");

    

 for(int i = 0; i <3; i++){

      for(int j = 0; j <3; j++){

        System.out.print(a[i][j]+"\t");
      }

      System.out.println();
 }
 System.out.println();
    if(f==1){
      System.out.println("It is symmetric matrix");
    }
    else{
      System.out.println("It is not symmetric matrix");
    }
  }
}
