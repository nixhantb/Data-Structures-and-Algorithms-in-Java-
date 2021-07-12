public class Chaining{
  static int size = 7;

  // node class 
  static class Node{
    int data;
    Node next; // LL 
   
    // constructor 

    Node (int d){
      this.data = d;
      next = null;
    }
  }

  static Node chain[] = new Node[size];
  static void arr(){

    for(int i=0;i < size; i++){
      chain[i] = null;

    }

    
  }

  static void insert(int key){

    Node t = new Node(key);
    // hash key 

    int index = key%size;

    if(chain[index]==null)

      chain[index] = t;
    else{

      // code for collision
      Node temp = chain[index];

      while(temp.next!=null){
        temp = temp.next;
      }
      temp.next = t;

    }
}
 static void print() {
    for(int i=0;i < size; i++){
      Node temp = chain[i];
      System.out.print("Chain "+i+" -->");
      while(temp!=null){
        System.out.print(temp.data+" -->");
        temp = temp.next;
      }
      System.out.println("Empty ");
    }
}

public static void main(String[] args) {
 arr();
 insert(7);
 insert(0);
 insert(22);
 insert(53);
 insert(14);

 print();
}
}










