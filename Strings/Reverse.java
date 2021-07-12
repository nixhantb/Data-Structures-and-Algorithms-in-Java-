public class Reverse {

  public static void main(String[] args) {
    
    String s = "mno.pqr";
    String c = "i am fine";

    String stA[] = s.split("\\.");

    String o = "";
    for(int i = stA.length-1; i>=0; i--){

      o+=stA[i]+".";
      
    }

    char l[] = o.toCharArray();
    String s3 = "";

    for(int i =0; i < s.length();i++){
      s3+=l[i];
    }
    System.out.println(s3);
  }
}
