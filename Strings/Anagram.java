public class Anagram{

  static boolean isA(String a, String b){

    int s1 = 0;
    int s2 = 0;

    if(a.length() != b.length()){
      return false;
    }
    else {
    for(int i = 0; i <a.length(); i++){
      s1+=a.charAt(i);
      s2+=b.charAt(i);
    }

    if(s1==s2){
      return true;
    }
    }

    return false;

    
  }
  public static void main(String[] args) {
    
    System.out.println(isA("nishant","nisanth"));
    System.out.println((isA("abx","bx")));
    System.out.println((isA("allergy","allergic")));
  }
}
