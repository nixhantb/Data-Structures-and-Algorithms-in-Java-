public class LinkedCount{
  Node head;
  static class Node{
    int data;
    Node next;
  
    Node(int d){
      this.data = d;
      next = null;
    }
  }

  public void PrintList(){
    int count = 0;

    Node n = head;
    
    while(n!=null){
      count++;
      n = n.next;
    }
    System.out.println("The total number of node present is "+count);
  }
public static void main(String[] args) {
  LinkedCount lc = new LinkedCount();
  lc.head = new Node(1);
  Node a = new Node(2);
  Node b = new Node(3);
  Node c = new Node(4);
  lc.head.next = a;
  a.next = b;
  b.next = c;

 lc.PrintList();
}

}
