public class Palindrome {
  static boolean isPal(){
    String s = "abc";

    String s1 = "";

    for(int i = s.length()-1; i>=0; i--){
      s1+=s.charAt(i);
    }

    if(s.equals(s1)){
      return true;
    }
    return false;


  }
  public static void main(String[] args) {
    
    System.out.println(isPal());
  }
}
