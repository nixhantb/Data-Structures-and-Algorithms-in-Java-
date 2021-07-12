public class StrStr{
  
  public static void main(String[] args) {
    


  
    String s = "geeksgeeksfor";
		String x = "for";
    int m =s.length();
		int n = x.length();

		for(int i=0;i<=s.length()-n;i++) {

      int j=0;

      while(j < m && s.charAt(i+j) == x.charAt(j))
        j++;


      if(j==m){

        System.out.println(i);
      }
      else{
        System.out.println("-1");
      }


		}
	}
  }

