class StackLinkedList{

  public class Node{
    int data;
    Node next;
  }

  Node top;

  StackLinkedList(){
    this.top= null;
  }


  void push(int x){

    Node temp = new Node();

    if(temp==null){
      System.out.println("Stack Overflow ");
      return;

    }


      temp.data = x;
      temp.next = top;
      top=temp;
    }

  boolean isEmpty(){

    return top==null;
  }

  public int peek(){
    if(!isEmpty()){
      return top.data;

    }
    else{
      System.out.println("Stack is Empty");
      return -1;
    }
  }
  void pop(){

    int x = top.data;

    if(top==null){
      System.out.println("Stack Underflow");
      return;

    }

    top = top.next;
    // [A]-[B] , top = A, now,top = top.next, top is B now 

}


void Display(){
  if(top==null){
    System.out.println("Overflow");
  }
  else {
  Node temp = top;

  while(temp!=null){
    System.out.print(temp.data+"-->");
    temp = temp.next;
  }
}

}


  public static void main(String[] args){

    StackLinkedList st = new StackLinkedList();
    st.push(4);
    st.push(3);
    st.push(2);
    st.push(5);


    st.Display();
    st.pop();
    System.out.println();
    st.Display();
    System.out.println();

    System.out.println(st.peek());
  }
}
