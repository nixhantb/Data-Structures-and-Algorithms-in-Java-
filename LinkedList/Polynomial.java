import java.util.Scanner;
public class Polynomial{
static Node head;
  static class Node{
    int coef;
    int expo;
    Node next;

  }

  void create(){
    Node t,last = null;
    int num, i;

    System.out.println("Enter number of terms");

    Scanner sc = new Scanner(System.in);

    num = sc.nextInt();

    System.out.println("Enter each terms with cofficient and exp");
    
    for(i = 0; i< num; i++){
      t = new Node();
      t.coef = sc.nextInt(); 
      t.expo = sc.nextInt();
      t.next = null;
      
      if(head==null){
        head = last  = t;
      }
      else{
        last.next  = t;
        last = t;
      }

    }
  }

  
  void display(Node p){
    while(p!=null){
      System.out.print(p.coef+" x "+p.expo);
      p = p.next;
      System.out.print("+ 0");
    }
  }

  long Eval(Node p, int x){
    long val = 0;
    while(p!=null){
      val+=p.coef*Math.pow(x,p.expo);
      p = p.next;
    }
    return val;
  }
  
  public static void main(String[] args) {
   Polynomial pl = new Polynomial();
   pl.create();
   pl.display(head);
   System.out.println("\nThe Polynomial calculation is:");
   System.out.println(pl.Eval(head,1));
  }
}















