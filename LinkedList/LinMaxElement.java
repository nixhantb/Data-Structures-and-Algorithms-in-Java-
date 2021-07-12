public class LinMaxElement{
  Node head;

  static class Node{
    int data;
    Node next;

    // constructor 
    Node(int d){
      this.data = d;
      next = null;
    }
  }

  static void findMax(Node n){
    int m =-113; 

    while(n!=null){
     if(n.data>m){
       m = n.data;
     }
     n = n.next;
    }
    System.out.println(m);
  }
  public static void main(String[] args) {
    LinMaxElement mx = new LinMaxElement();
    mx.head = new Node(3);
    Node a = new Node(4);
    Node b = new Node(12);

    Node n = mx.head;
    mx.head.next  = a;
    a.next = b;
    
    mx.findMax(n);
    
  }
}
