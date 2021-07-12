import java.util.*;
public class D{

  public static void main(String[] args) {
    
    String s = "geeks";

    char ch[] = s.toCharArray();

    Arrays.sort(ch);

    for(int i = s.length()-1; i>=0; i--){
      System.out.print(ch[i]+" ");
    }
  }
}
