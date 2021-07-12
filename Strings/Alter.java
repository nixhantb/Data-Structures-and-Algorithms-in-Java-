public class Alter{
 public static void main(String[] args) {
   
   String s = "I am :IronnorI Ma, i";

   String res="";
   for(int i = 0; i <s.length(); i++){

     if(s.charAt(i)>='a' && s.charAt(i)<='z' || s.charAt(i)>='A' && s.charAt(i) <='Z'){


       res+=s.charAt(i);



       }
     }

   String k = res.toLowerCase();

   String m = "";
   for(int i  = k.length()-1; i >=0; i--){

     m+=k.charAt(i);

   }

   if(m.equals(k)){
     System.out.println("Saved");
   }
   else{
     System.out.println("Not Saved");
   }
   }
 } 

