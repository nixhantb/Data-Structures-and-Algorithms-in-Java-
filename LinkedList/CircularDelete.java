public class  CircularDelete{
  
  // Node class 
  static Node head;

  static class Node{
    int data;
    Node next;

  }

  static void create(int a[], int n){
    Node t, last;
    head = new Node();
    head.data = a[0];
    head.next = head;
    last = head;
    
    for(int i=1;i<n; i++){
      t = new Node();
      t.data = a[i];
      t.next = last.next;
      last.next = t;
      last = t;
    }

  }

  static void display(Node h){
    do{
      System.out.print(h.data+" ");
      h = h.next;
    }
    while(h!=head);
  }

  // length 

  int Length(Node p){
    int len = 0;
    do{
      len++;
      p = p.next;
    } while(p!=head);
  return len;
  }

  void Insert(Node p, int index, int x){

    Node t;
    int i;

    if(index <0 || index > Length(p)){
      return;
    }

    if(index==0){
      // head insertion in circular Linked list 

      t = new Node();
      t.data  = x;
      if(head == null){
        head = t;
        head.next = head;
      }

      else
      {
        while(p.next!=head)
          p = p.next;
          p.next = t;
         
          t.next = head;
          head = t;
      }
    }
    else{
      for( i = 0; i < index-1; i++)
        p = p.next;
        t = new Node();
        t.data=x;
        t.next = p.next;
        p.next = t;
      
    }
  }


    // deletion of the node in a linkedlist

    int Delete(Node p, int index){

      Node q;

      int i, x;

      if(index<=0|| index > Length(head))
          return -1;
      if(index==1){

        while(p.next!=head)p = p.next;
        x = head.data;
        if(head==p){
          head = null;
        }

        else{
          p.next = head.next;
          head = p.next;
        }
      }

      // for other position
      else{
        for(i=0; i < index-2; i++){
         p = p.next; 
        }

        q = p.next;
        p.next = q.next;
        x = q.data;

      }

      return x;
    }

  

  public static void main(String[] args) {
    int a[] = {2,3,4,5,6};
    CircularDelete ll = new CircularDelete();
    ll.create(a,5);
   
    
    System.out.println();
    ll.Insert(ll.head,4,8);
    ll.display(ll.head);
    ll.Delete(head,3);
    System.out.println();
    ll.display(ll.head);
  }
}
























