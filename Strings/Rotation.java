public class Rotation {

  public static void main(String[] args) {
    
    String s1 = "geeksforgeeks";

    String s2 = "forgeeksgeeks";

    String s3 = s1+s2;
    
    if(s1.length()==s2.length() && s3.indexOf(s2)!=-1){
      System.out.println("1");
    }
    else{
      System.out.println("-1");
    }
  }
}
