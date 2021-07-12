// Sorry this code if for the concatenation of tht two Linked list
public class LinkedMerge{

  Node head;

  static class Node{
    int data;

    Node next;


    Node(int d){
      this.data = d;
      next = null;


    }
  }

// push the node 
  public void push(int x){
    Node n = new Node(x);
    n.next = head;
    head = n;
  }


  public void mergeMe(Node p, Node q){
    
    while(p.next!=null){
      p = p.next;
    }
    p.next = q;
    q = null;
  }

  public void print(){
    Node n = head;

    while(n!=null){
      System.out.print(n.data+" ");
      n = n.next;

    }
  }
  public static void main(String[] args) {
    LinkedMerge l1 = new LinkedMerge();
    LinkedMerge l2 = new LinkedMerge();
    
    l1.push(1);
    l1.push(2);
    l1.push(3);

    System.out.println("First Linked List");
    l1.print();
    System.out.println("\nSecond Linked List");
    l2.push(4);
    l2.push(5);

    l2.print();

    l1.mergeMe(l1.head, l2.head);
    System.out.println("\nMerged Linked List");
    l1.print();
  }
}
