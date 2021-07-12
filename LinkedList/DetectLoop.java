public class DetectLoop{
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

  // create the node 
  public void push(int x){
    Node n = new Node(x);

    n.next = head;
    head = n;
  }

  public boolean isLoop(Node first){
    Node p, q;

    p= q = first;
    do{
      p = p.next;
      q = q.next;

      if(q!=null){
        q = q.next;
      }
      else{
        q = null;
      }
    } while(p!=null && q!=null  && p!=q);
    if(p==q){
      return true;
    }
    else{
      return false;
    }
  }
  public static void main(String[] args) {
  DetectLoop LL = new DetectLoop();

  LL.push(2);
  LL.push(4);
  LL.push(5);
  LL.head.next = LL.head; 
  if(LL.isLoop(LL.head)){
    System.out.println("Yes, there is loop");
  }
  else{
    System.out.println("No, there is no loop in the linked list");
  }
  }
}










