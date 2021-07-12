
public class Nested{

  public static void main(String[] args){

    for(int i = 0; i <10; i++){
      // O(n^2) 
      for(int j = 1; j<=10; j++){

        System.out.print(j+"\t");
      }

      System.out.println();
    }
  }
 }
