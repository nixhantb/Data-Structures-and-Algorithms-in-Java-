public class LinkedList{
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

  public void printList(){
    Node n = head; //temp pointer 
    while(n!=null){

      System.out.println(n.data+" ");
      n = n.next; 
    }
  }

  public static void main(String[] args) {
    LinkedList llish = new LinkedList();

    llish.head = new Node(10);
    Node a = new Node(3);
    Node b = new Node(5);
    
    llish.head.next = a;
    a.next = b;
    llish.printList();
  }
}
