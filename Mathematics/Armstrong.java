public class Armstrong{
  static int isArmstrong(int n){
   int res = 0; 
    while(n!=0){
      
      int r = n%10;

      res+=Math.pow(r,3);

      n = n/10;
    }
    return res;

}

  public static void main(String[] args) {
  
    int n = 371;
    if(isArmstrong(n)==n)
      System.out.println("Yes");
    else
      System.out.println("No");
    
   }
}
