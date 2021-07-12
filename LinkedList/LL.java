public class LL{
  static Node head;

  static class Node{
    
    int data;
    Node next;
  }

  static void create(int a[], int x){

    Node t,last;
    head = new Node();
    head.data = a[0];
    head.next = null;

    last = head;

    for(int i=1;i<x; i++){
      t = new Node();
      t.data = a[i];
      t.next = null;
      last.next = t;
      last = t;

    }
  }

  static void print(){
    Node n = head;
    while(n!=null){
      System.out.println(n.data);
      n= n.next;
    }
  }
  public static void main(String[] args) {
    LL t = new LL();
    int a[] = {2,3,4,5,6};
    int x = 5;
    t.create(a,x);
    t.print();
  }
}
