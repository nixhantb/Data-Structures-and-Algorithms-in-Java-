public class NonR {
  public static void main(String[] args) {
    String s = "hello";

    int a[] = new int[26];

    for(int i = 0; i < s.length(); i++ ){

      a[s.charAt(i)-'a']++;
    }

    int k = 0;
    for(int i =0; i <s.length(); i++){
  
      if(a[s.charAt(i)-'a'] ==1){

        k+=i;

        break;
      }
    }
    int l = k;
    System.out.println(s.charAt(l));
  }
}
