public class Doublydelete{
 static  Node head;
  static class Node{
    Node prev;
    int data;
    Node next;

  }

  // create the list 
void create(int a[], int n){
  int i;
  Node t,last;

  head = new Node();
  head.data = a[0];
  head.prev =head.next =  null;
  last = head;

  for(i=1;i<n;i++){
    t = new Node();
    t.data = a[i];
    t.next = last.next;
    t.prev = last;
    last.next = t;
    last = t;
  }
}

void display(Node p){
  while(p!=null){
    System.out.print(p.data+" ");
    p = p.next;
  }
}

int Length(Node p){
  int len = 0;
  while(p!=null){
    len++;
    p = p.next;
  }
  return len;
}

int delete(Node p, int index){
  int x = -1, i;
  if(index<1 || index > Length(p))
    return -1;
  // head 

  if(index == 1)
  {

    head = head.next;
    if(head!=null){
      head.prev = null;
    }
    x = p.data;

  }

  else{
    for(i = 0; i< index-1; i++){
      p = p.next;
    }
      p.prev.next = p.next;
      if(p.next!=null)
        p.next.prev = p.prev;

    x = p.data;
  }
  return x;
}
// Reversing the linked list 
public void reverse(Node p){
  Node temp;
  while(p!=null){
    temp = p.next;
    p.next = p.prev;
    p.prev = temp;
    p = p.prev;
    if(p!=null && p.next == null)
      head = p;
  }
}
public static void main(String[] args) {
  Doublydelete ll = new Doublydelete();
  int a[] = {1,2,3,4};
  ll.create(a,4);
  System.out.println("Initial:");
  ll.display(head);
  ll.delete(head,3);
  System.out.println();
  System.out.println("After Deletion:");
  ll.display(head);
  System.out.println();
  System.out.println("Reversing the list:");
  ll.reverse(head);
  ll.display(head);
}

  
}
