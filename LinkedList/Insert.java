public class Insert{
static  Node head;

static  class Node{
    int data;
    Node next;

    Node(int d){
      this.data = d;
      next = null; 
    }
  }

// at the beginning 
  static void push(int x){
    Node n = new Node(x);
    
    n.next = head;
    head = n;

  }

  // insert at last 

  static void append(int x){
    
    Node n = new Node(x);
    Node p = head;
    if(head == null){
      head = new Node(x);
      return;
    }
    while(p.next!=null){
      p = p.next;

    }

    p.next = n;


  }
  
  static void after(Node n, int x){
    if(n==null){
      System.out.println("Previous node can't be null");
      return;
    }
    Node new_node = new Node(x);
    new_node.next = n.next;
    n.next = new_node;

  }

  static void print(){
    
    Node n = head;
    while(n!=null){
      System.out.println(n.data);
      n = n.next;
    }
  }
public static void main(String[] args) {
  Insert m = new Insert();
  m.push(3);
  m.push(4);
  m.push(5);
  m.append(6);
  after(m.head.next, 7);
  print();
}
}






















