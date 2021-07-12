public class MergeLinkedList{
  Node head;

  static class Node{
    int data;
    Node next;

    // constructor 

    Node(int d){
      this.data = d;
      next = null;

    }

  }


  public void push(int x){

    Node newN = new Node(x);
    newN.next = head;
    head = newN;
  }

  public void print(Node n){

    while(n!=null){
      System.out.print(n.data+" ");
      n = n.next;

    }
  }

  // merge two linked list functio
  public void mergeMe(Node first, Node second){
    // pointer for merged list 
    
    Node third; 
    Node last;

     if(first.data < second.data){
      third = last = first;
      first = first.next;
      third.next = null;
      



    }
    else{
      third = last = second;
      second = second.next;
      third.next = null;

    }

    while(  first!=null && second!=null ){

      if(first.data < second.data){
        last.next = first;
        last = first;

        first = first.next;
        last.next = null;
      }

      else{
        last.next = second;
        last = second;
        second = second.next;
        last.next = null;
      }
    }

    if(first!=null){
      last.next = first;
    }
    else{
      last.next = second;
    }
  }
  public static void main(String[] args) {
    MergeLinkedList LL = new MergeLinkedList();
    MergeLinkedList L2 = new MergeLinkedList();

    LL.push(4);
    LL.push(3);
    LL.push(2);
    LL.push(1);
    L2.push(7);
    L2.push(6);
    L2.push(5);

    System.out.println("First Linked List");
    LL.print(LL.head);
    System.out.println("\nSecond Linked List");
    L2.print(L2.head);
    System.out.println("\n Merged one"); 
    LL.mergeMe(LL.head,L2.head);
    LL.print(LL.head);
  }
}
