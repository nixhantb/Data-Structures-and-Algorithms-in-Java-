public class Lower{

  public static void main(String[] args){

    int a[][] = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
      

    for(int i = 0; i <3;i++){

      for(int j = 0; j <3; j++) {
      if(i>=j){
        System.out.print(a[i][j]+" ");
        
      }
      else{
        System.out.print("0 ");
      }
    }
    System.out.println();
    
  }

}
}
