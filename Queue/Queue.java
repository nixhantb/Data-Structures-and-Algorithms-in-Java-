class Queue{
  
  final static int size = 1000;

  int rare,front;
  int a[] = new int[size];

  Queue(){
    front = -1;
    rare = -1;
    
  }

  void enqueue(int x){

    if(rare== size-1){
      System.out.println("Queue is Full");
    }
    
    else{
      rare++;
      a[rare] = x;
      System.out.println(x+" is enqued");
    }
  }

  void dequeue(){

    if(front==rare){
      System.out.println("Queue is Empty");
    }

    else{
      front++;

      int y = a[front++];

      System.out.println(y+" is dequeed");

    }
  }

  boolean isFull(){

    if(rare==size-1){
      return true;
    }

    else{
      return false;
    }
  }

  boolean isEmpty(){

    if(front==rare){
      return true;
    }

    else{
      return false;
    }
  }

  void Display(){
    if(front==rare){
      System.out.println("Queue is Empty");
    }

    else{

    for(int i = front; i <=rare; i++){
      System.out.print(a[i]+" ");
    }
    
  }

  }

  public static void main(String[] args){

    Queue q = new Queue();
    q.enqueue(4);
    q.enqueue(6);
    q.enqueue(7);
    q.dequeue();
    q.Display();

    System.out.println();
    System.out.println(q.isEmpty());
  }

  

}
