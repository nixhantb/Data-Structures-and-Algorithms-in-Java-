class QueueLinkedList{

  Node front=null;
  Node rear = null;
   public class Node{
    int data;
    Node next;



  public Node(){
    this.data = data;
    this.next = null;
  }
  }

  void enqueue(int x){

    Node temp = new Node();

    if(temp==null){
      System.out.println("Queue is Full");

    }
    else{
      temp.data = x;
      temp.next = null;
      
      if(front==null){

        // front node 

        front = temp;
        rear = temp;

      }
      else{
        rear.next  =temp;
        rear = temp;
      }
    }
  }

  void Dequeue(){
    
    if(front==null){
      System.out.println("Empty");

    }

    Node temp = front;
    front = front.next;

    if(front==null){
      rear = null;
    }
  }

  void Display(){

    Node t =front;
    while(t!=null){
      System.out.print(t.data+" ");
      t = t.next;
    }
  }
  public static void main(String[] args){

    QueueLinkedList q = new QueueLinkedList();
    q.enqueue(5);
    q.enqueue(55);
    q.enqueue(45);
    q.Dequeue();
    q.Display();

  }

}

