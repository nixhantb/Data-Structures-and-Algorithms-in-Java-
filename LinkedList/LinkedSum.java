public class LinkedSum{
  Node head;

  static class Node{
    int data;
    Node next;

    Node(int d){
    this.data =d;
    next = null;
    }
  }


  public void sum(Node n){
    int sum = 0;

    
    while(n!=null){
      sum+=n.data;

      n= n.next;

    }
System.out.println(sum);
  }
  public static void main(String[] args) {
    LinkedSum lc = new LinkedSum();
    lc.head=new  Node(2);
    Node a  = new Node(4);
    Node b = new Node(5);

    lc.head.next = a;
    a.next = b;
    Node n = lc.head;
    lc.sum(n);

  }
}
