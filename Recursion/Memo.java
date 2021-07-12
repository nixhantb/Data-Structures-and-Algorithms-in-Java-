public class Memo {
  static int F[] = new int[10];

  
  static int mem(int n){

    if(n<=1){
      F[n] = n;
      return n;
    }

    else{

      if(F[n-2] == -1)
        F[n-2] = mem(n-2);
      if(F[n-1]==-1)
        F[n-1] = mem(n-1);

      F[n] = F[n-2]+F[n-1];

      return F[n-2]+F[n-1];
    }
    
  }
  public static void main(String[] args){
    for(int i = 0; i <10;i++){
      F[i] = -1;
  }
    System.out.println(mem(5));
  }
}
