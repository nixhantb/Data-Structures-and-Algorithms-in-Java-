public class Descending {
  
  public static void main(String[] args) {
    String s = "geeks";

    int freq[] = new int[256];

    for(int i = 0; i < s.length(); i++){

      freq[s.charAt(i)]++;
    }

    for(int i = freq.length-1; i >=0; i--){
      while(freq[i] -- >0){

        System.out.print((char)i+" ");
      }
    
    }

  }
}
