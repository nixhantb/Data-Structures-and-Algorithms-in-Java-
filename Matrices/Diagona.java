public class Diagona{

  public static void main(String[] args){

    int a[][]= {{3,0,0,0,0},
               {0,7,0,0,0},
               {0,0,4,0,0},
               {0,0,0,9,0},
               {0,0,0,0,0}};

  int t[] = new int[5];

  for(int i = 0; i <5; i++){

    for(int j= 0; j <5;j++){

      if(i==j){
        System.out.print(a[i][j]+" ");
      }
    }
    System.out.println();
  }
}
}


