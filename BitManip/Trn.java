import java.util.*;
public class Trn {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();

    while(t-- >0){

    
    long a = sc.nextInt();

    if(a >0) {

    long arr[] = new long[(int)a];
    long s = 0;
    for(int i = 0; i <a; i++){

      arr[i] = (i)*(i+1)/2;
    }


    long temp = a;
    long res=0;
    for (int i = 0; i < a; i++) {
      if(temp==arr[i]){
        res = i+1;
      }
      else if(temp < arr[i]){

        res =i+1;
        break;
      }


  }

  System.out.println(res);
   }
  }
}
}
