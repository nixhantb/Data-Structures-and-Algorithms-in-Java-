// recursive linkedlist 

public class RecursionLL{
  Node head;

  // node 
  static class Node{
    int data;
    Node next;

    // constructor 

    Node(int d ){
      this.data =d;
      next = null;
    }
  }

  static void Display(Node n){
    if(n!=null){
      System.out.println(n.data+" ");
      Display(n.next);
    }
  }
  public static void main(String[] args) {
    RecursionLL rx = new RecursionLL();
    rx.head = new Node(3);
    Node a = new Node(4);
    Node b = new Node(5);
    

    rx.head.next = a;
    a.next = b;

    Node n =rx. head;
    rx.Display(n);
  }
}
