public class Clear {

  static int clear(int num,int i){
   
    int mask = ~(1 <<i);

    return mask&num;
  }
  public static void main(String[] args) {
   System.out.println(clear(12,2)); 

  }
}
