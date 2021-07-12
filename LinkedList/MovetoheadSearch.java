public class MovetoheadSearch{
  Node head;
  static class Node{
    int data;
    Node next;

    Node(int d){
      this.data = d;
      next = null;

    }
  }


  Node  search(Node p, int key){
  
    Node q; 
    while(p.next!=null){
      if(key == p.data){
          q.next = p.next;
          p.next = head;
          head = p;

          return p;
      }
      q = p;
      p = p.next;
    }
  return null;
  }

  public static void main(String[] args) {
    MovetoheadSearch l = new MovetoheadSearch();
    l.head.next = new Node(4);
    Node a = new Node(45);
    Node b = new Node(42);
    l.head.next = a;
    a.next = b;

    l.search(l.head, 45);
  }
}
