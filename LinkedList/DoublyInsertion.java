public class DoublyInsertion{
  // node 
  
  static Node head;

  static class Node{
    Node prev;
    int data;
    Node next;

  }
  
// create 
  void create(int a[], int n){

    Node t,last;
    head = new Node();
    head.data = a[0];
    head.prev = head.next = null;
    last = head;
    
    // for all
    for(int i = 1; i<n; i++){
      t = new Node();
      t.data = a[i];
      t.next = last.next;// if last.next was null them now t.next is last, so it will be null
      t.prev = last;
      last.next = t;
      last = t;
      
     
      
    }
  }


 
 static int Length(Node p){
  int len=0;
  while(p!=null){
      
    len++;
    p = p.next;
  }
 return len;

}

  static void Insert(Node p, int index, int x){

    Node t;

    int i;

    if(index<0 || index > Length(p))
      return;

    if(index == 0){
      t = new Node();
      t.data = x;
      t.prev = null;
      t.next = head;
      head.prev = t;

      head = t;
    }

    else{


      for(i=0;i<index-2;i++){
        p = p.next;
      }
        t = new Node();
        t.data  =x;
        t.prev = p;
        t.next = p.next;
        if(p.next!=null)p.next.prev = t;
        p.next = t;
      
    }


  }

  
 void Print(Node p){

    while(p!=null){
      System.out.print(p.data+" ");
      p = p.next;
    }
      
  }

  public static void main(String[] args) {
  DoublyInsertion ll = new DoublyInsertion();
  int a[] = {10,20,30,40,50};
  ll.create(a,5);
  Insert(head, 4, 3);
  ll.Print(head);

  }
}
