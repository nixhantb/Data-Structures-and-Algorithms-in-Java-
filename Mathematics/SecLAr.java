import java.util.*;
public class SecLAr{

   
 static long secL() {
   Scanner sc = new Scanner(System.in);
   long a = sc.nextInt();
   long b = sc.nextInt();
   long c = sc.nextInt();

   long sec=0;
   if(a >=b && a>=c){

     if(b >=c)
       sec = b;
     else {
       sec = c;
     }
   }

   else if (b>=a && b >=c) {
     
     if(c>=a)
       sec = c;
     else{
       sec = a;
     }
   }

  
   else if(a >=b){
     sec = a;
   }
   else{
    sec = b;
   }

   return sec;
 }

 public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   long t = sc.nextInt();

   while(t -- >0){
     System.out.println(secL());
   }
 }
}
