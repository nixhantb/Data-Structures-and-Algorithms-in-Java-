public class FirstRepeating {

  public static void main(String[] args) {
    
    String s = "hhello";

    int a[]  = new int[26];

    for(int i=0; i < s.length(); i++){

      a[s.charAt(i)-'a']++;
    }

    int k=0;
    for(int i=0; i <s.length(); ++i){

      if(a[s.charAt(i)-'a'] >1){

        k = i;
        break;
      }
    }

    System.out.println(s.charAt(k));
  }
}
