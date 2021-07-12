class CircularQueue{

  int front,rear;
  private int size = 10;
  int a[] = new int[size];

  CircularQueue(){
    front = 0; 
    rear = 0;
  }


  void enqueue(int x){

    if((rear+1)%size == front){
      
      
      System.out.println("Queue is full");
    }

    else{

      
      rear = (rear+1)%size;
      a[rear] = x;
      System.out.println(x+" is enqueued");
    }
  }

  void Dequeue(){

    if(front == rear){
      System.out.println("Empty");

    }
    else{
      front = (front+1)%size;
      int x = a[front];
      System.out.println(x+" Dequeued");
    }
  }

  void Display(){

    int i = front+1;
    do{
      System.out.print(a[i]+" ");
      i = (i+1)%size;

    } 
    while(i!=(rear+1)%size);
  }
  public static void main(String[] args){

    CircularQueue q = new CircularQueue();
    q.enqueue(4);
    q.enqueue(2);
    q.enqueue(45);
    q.enqueue(23);
    q.Display();
    q.Dequeue();
    q.Display();
  }
}

