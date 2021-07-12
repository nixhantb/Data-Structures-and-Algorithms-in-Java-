class Linkedlistremoveduplicate
{

Node head;

class Node{
  int data;
  Node next;

  // constructor 
  //
  Node(int d){
    data = d;

    next = null;

  }
}

public void push(int x){
  Node newNode = new Node(x);

  newNode.next = head;
  head = newNode;


  return;
}

public  void remove_dup(){


Node p = head;
Node q = p.next;

while(q!=null){

  if(p.data!=q.data){
    p = q;

    q = q.next;
  }

  else{

    p.next = q.next;
    q = p.next;
  }
}
}


public void print(){

  Node n = head;

  while(n!=null){
    System.out.print(n.data+"  ");

    n = n.next;
  }
}


public static void main(String[] args) {
  Linkedlistremoveduplicate ll = new Linkedlistremoveduplicate();
  ll.push(5);

  ll.push(2);
  ll.push(2);
  ll.push(4);
  ll.push(45);
  ll.push(45);
  ll.remove_dup();
  ll.print();
}

}
