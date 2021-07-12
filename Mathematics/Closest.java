// Day 1 of 365 days of java 
// Goal first internship at amazon and microsoft
// June 19
public class Closest{

  static int close(int n, int m){
    
    int q = n/m;
    // first closest  number 
    int n1 = q*m;

    // second closest number 

    int n2 = (n*m) > 0 ? m*(q+1): m*(q-1);

    if(Math.abs(n-n1) < Math.abs(n-n2))
      return n1;

    return n2;
    
  }
  
   public static void main(String[] args) {
     System.out.println(close(-15,6));
     System.out.println(close(15,4));
   } 
   
}
