public class Static {
  static int find(int n){
    if(n>0){
      return find(n-1)+n;
    }
    else{
      return 0;
    }
  }
  public static void main(String[] args){

    System.out.println(find(5));
    int x = 5*(5+1)/2;
    System.out.println(x);
  }
}
