public class Toupper {

  public static void main(String[] args) {
    
    String s = "i love programming";

    char ch[] = s.toCharArray();


    for (int i = 0; i < ch.length; i++) {

      if( i==0 && ch[i]!=' ' || ch[i-1] == ' ' && ch[i]!=' ') {



      if(ch[i]>='a' && ch[i] <='z'){

        ch[i] = (char)(ch[i]-'a'+'A');

      }
      else if(ch[i] >='A' && ch[i]<='Z'){

        ch[i] = (char)(ch[i]-'A'+'a');
      }

        
      } 
    }

    String st = new String(ch);
    System.out.println(st);

    char a = 'i';
    char b = 'a';
    char c = 'A';



    System.out.println(a-b+c);
    System.out.println((char)a-b);
    System.out.println(b);
    System.out.println(c);
    
  }
}
