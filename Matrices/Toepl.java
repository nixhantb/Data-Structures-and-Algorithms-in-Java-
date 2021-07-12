public class Toepl{

  public static void main(String[] args){
      
        int a[][] = { { 6, 7, 8, 9 },
                        { 4, 6, 7, 8 },
                        { 1, 4, 6, 7 },
                        { 0, 1, 4, 6 },
                        { 2, 0, 1, 4 } };

        int f = 1;



        for(int i =1; i  <4; i++){

          for(int j = 1; j<4; j++){

            if(a[i][j]!= a[i-1][j-1]){
              f=0;
              break;



            }
          }
        }


        if(f==1){
          System.out.println("The matrix is trap");
        }
        else{
          System.out.println("The matrix is not trap");
        }
    }
}
