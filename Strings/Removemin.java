public class Removemin {

  public static void main(String[] args) {
    
    String s1 = "bcadeh";

    String s2 = "hea";

    int a[] = new int[26];

    int b[] = new int[26];

    for(int i =0; i < s1.length(); i++ ){
      
      a[s1.charAt(i) - 'a']++;
    }

    for(int i = 0; i < s2.length(); i++){

      b[s2.charAt(i) - 'a']++;
    }

    int res = 0;

    for(int i = 0; i <26; i++){

      res+=Math.abs(a[i]-b[i]);
    }
    System.out.println(res);
  }
}
