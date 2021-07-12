public class RecursCount{
// Introduce the head Node 
Node head; 
static class Node{
  int data;
  Node next;
  // constructor 

  Node(int d){
    this.data = d;
    next  = null;
  }
}

static int count(Node n){
  
  if(n!=null)
  {
    
   return  count(n.next)+1;
  }
  else{
    return 0;
  }
  }

public static void main(String[] args) {
  RecursCount LL = new RecursCount();
  LL.head = new Node(1);
  Node a = new Node(2);
  Node b = new Node(3);
  LL.head.next = a;
  a.next = b;
  Node  n = LL.head;
  System.out.println(count(n));
}
}
