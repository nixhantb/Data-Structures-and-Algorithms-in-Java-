public class RevSliding{
  
static  Node head;

 static class Node{
    int data;
    Node next;

    Node(int d){
      this.data = d;
      next = null;

    }
  }

static void revers(){

   Node p = head;
   Node q = null;
   Node r = null;

   while(p!=null){
     r = q;
     q = p;
     p = p.next;

     q.next = r;


   }

   head = q;

 }

static void newNode(int x){

  Node n = new Node(x);
  n.next = head;
  head = n;

  return;
}

public void print(){
  Node n = head;
  while(n!=null){
    System.out.print(n.data+" ");
    n = n.next;
  }
}

public static void main(String[] args) {
  RevSliding rc = new RevSliding();

  rc.newNode(5);
  rc.newNode(6);
  rc.newNode(7);
  rc.revers();

 rc.print();
}
}













