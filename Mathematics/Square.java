public class Square {

  public static void main(String[] args) {
    
    int m[] = {1,2,3,4,5};
    int n[] = {10,9,8,7,5};
    for(int i = 0; i <4/2; i++){

      for(int j = 0; j < 4; j++){

        System.out.print(m[j]);
        System.out.print(n[j]);

        m[i] = i+10;
        n[i] = i+10;

      }
      System.out.println();
    
    

   }
}

}
