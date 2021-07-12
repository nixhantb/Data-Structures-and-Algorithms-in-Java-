public class Max {

  public static void main(String[] args) {
    
    String s = "100klh564abc365bg";

    int a[] = new int[150];


    int num=0, res = 0;
    char ch[] = s.toCharArray();

    for(int i = 0; i < s.length(); ++i){
      

      if(Character.isDigit(s.charAt(i)))

        num = num*10+(s.charAt(i)-'0');

      else{

        res = Math.max(res,num);
        num=0;
      }

    }
    System.out.println(res);
  }
}
