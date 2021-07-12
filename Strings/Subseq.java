public class Subseq {

  public static void main(String[] args) {
    
    String A = "AXY";
    String B = "YADXCP";

    int m = A.length();

    int n = B.length();

    for(int i = 0; i <=B.length()-m; i++){

      int j = 0;

      while( j < n && B.charAt(i+j)==A.charAt(j)){
        j++;
      }

      if(j==n){
        System.out.println(i);
        break;}
      else{
        System.out.println("-1");
      }
    }
  }
}
