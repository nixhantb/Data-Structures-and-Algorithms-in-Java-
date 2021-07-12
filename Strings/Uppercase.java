public class Uppercase {
  public static void main(String[] args) {
    String s = "i love programming";

    
    char ch[] = s.toCharArray();
    for(int i = 0; i <ch.length;i++){


      if(i==0 && ch[i]!=' ' || ch[i]!=' ' && ch[i-1]==' '){

        if(ch[i] >='a' && ch[i] <='z'){

          ch[i] = (char)(ch[i] -'a'+'A');
        }
      }
      else if(ch[i]>='A' && ch[i] <='Z')

        ch[i] = (char)(ch[i]+'a'-'A');

    }

    String st = new String(ch);

    System.out.println(st);
  }
}
