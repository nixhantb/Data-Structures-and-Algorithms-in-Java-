public class InsertAtSortedLL{
 static Node head;

  static class Node{
    int data;
    Node next;

    Node(int d){
      this.data = d;
      next = null;


    }
  }

  static void push(int x){
    Node n = new Node(x);
    
    if(head==null){
      head = new Node(x);
      return;
    }
    while(head.next!=null){
      head = head.next;
    }

    head.next = n;
  }
  
static boolean sorted(Node n){
  int x = -65536;
  while(n!=null){
    if(n.data < x){
      return false;
    }
    x = n.data;
    n = n.next;
  }

  return true;

}
  static void print(){
    Node n = head;

    while(n!=null){
      System.out.println(n.data);
      n = n.next;
    }
  }
  public static void main(String[] args) {
    InsertAtSortedLL ll  = new InsertAtSortedLL();
    ll.push(1);
    ll.push(9);
    ll.push(2);
    ll.push(3);
    if(ll.sorted(ll.head)){
      System.out.println("Sorted");
    }
    else{
      System.out.println("Not");
    }
    print();
  }
}
