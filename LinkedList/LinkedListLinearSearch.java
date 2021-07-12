public class LinkedListLinearSearch{
  Node head;

  // Node class 
  
  static class Node{
    int data;
    Node next;

    // constructor 
    
    Node(int d){
      this.data = d;
      next = null;


    }
  }

  public void Searchme(int val){
    Node n = head;
    int c = 0;
    int flag = 0;
    while(n!=null){
      c++;
    if(n.data == val){
      flag = 1;
      break;
    }
    
    n = n.next;
    }
    if(flag==1){
      System.out.println("The element present in the "+c+" LinkedList");

    }
    else{
    System.out.println("No! The element is not in the list");

    }
  }
  public static void main(String[] args) {
   LinkedListLinearSearch rx = new LinkedListLinearSearch(); 
    rx.head = new Node(3);
    Node a = new Node(4);
    Node b = new Node(5);
    

    rx.head.next = a;
    a.next = b;

    Node n =rx. head;
    rx.Searchme(4);
 
  }
  
}
