// GET 
// SET
// CLEAR 

import java.util.Scanner;
// to know, if the ith position is 1 0r 0 
public class BitMasking {
  static boolean boo(int num, int i){

    int mask = 1 <<i;

    int r = mask & num;

    if((r)==0){
      return true;
    }
    else{
      return false;
    }
  }
  public static void main(String[] args) {
    
    System.out.println(boo(8,3));
  }
}
