class CircularLinkedList{
  
  // node 

  static Node head; 
  static class Node{
    int data;
    Node next;
    
  }

static void push(int a[], int  n){
  int i;
  Node t;
  Node last;
  head = new Node();
  head.data = a[0];
  head.next = head;
  last = head;

  for(i = 1;i<n;i++){
    t = new Node();
    t.data = a[i];
    t.next = last.next;
    last.next = t;
    last = t;
  }
  
}


static void display(Node h){
  if(h==null){
    System.out.println("");
    return;
  }
  do{
    System.out.println(h.data);
    h = h.next;
  } while(h!=head);
}

public static void main(String[] args) {
  
CircularLinkedList ll = new CircularLinkedList();
 
int A[] = {2,3,4,5,6};
ll.push(A, 5);

ll.display(head);

}


  
}
