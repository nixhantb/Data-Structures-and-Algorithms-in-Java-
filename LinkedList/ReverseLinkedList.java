public class ReverseLinkedList{
  
static  Node head;

 static class Node{
    int data;
    Node next;

    Node(int d){
      this.data = d;
      next = null;

    }
  }

static void reverse(){
  Node p = head;
  int i = 0;
  int a[] = new  int[2];
  while(p!=null){
  a[i] = p.data;
  p = p.next;
  i++;
}

p = head;
i--;
while(p!=null){
p.data = a[i--];
p = p.next;
}

}

public void newNode(int x){

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
  ReverseLinkedList LL = new ReverseLinkedList();

  LL.newNode(3);
  LL.newNode(2);
  LL.newNode(1);
 LL. print();


  
}
}
