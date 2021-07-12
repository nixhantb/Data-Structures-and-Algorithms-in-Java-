import java.util.Scanner;

public class AnagP {

  static boolean isPali(String s){

    int freq[] = new int[256];


    for (int i = 0; i < s.length(); i++) {
      freq[s.charAt(i)]++;
      
    }
    int odd = 0;

    for(int i = 0; i < 256; i++){

      if((freq[i])!=0)
        odd++;
      if(odd > 1)
        return false;
    }
    return true;

  }

  public static void main(String[] args) {
   System.out.println(isPali("Nishant")); 
  }
}
