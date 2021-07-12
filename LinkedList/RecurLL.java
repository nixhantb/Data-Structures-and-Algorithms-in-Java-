public class RecurLL{
  
static  Node head;

 static class Node{
    int data;
    Node next;

    Node(int d){
      this.data = d;
      next = null;

    }
  }

 static void revMe(Node n){
    if(n==null){
      return;
    }
    else{
      
      
      revMe(n.next);

      System.out.print(n.data+" ");
    }
 }

public void newNode(int x){

  Node n = new Node(x);
  n.next = head;
  head = n;

  return;


}
static void prn(){
  Node n = head;
  while(n!=null){
    System.out.print(n.data+" ");
    n = n.next;
  }
}


public static void main(String[] args) {
RecurLL LL = new RecurLL();
LL.newNode(4);
LL.newNode(3);
LL.newNode(5);
LL.newNode(2);
System.out.println("Original LinkedList");
LL.prn();
System.out.println("\nReversed LinkedList");;
LL.revMe(head);

}
}
