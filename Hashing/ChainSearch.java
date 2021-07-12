public class ChainSearch{
  // make a node a class 
static int size = 7;
  static class Node{
    int data;
    Node next;
    // constructor 

    Node(int d){
      data = d;
      next = null;

    }
  }
 
  static Node chain[] = new Node[size];
  static void arr(){

    for(int i=0;i < size; ++i){
     chain[i] = null; 
    }
  }


  static void insert(int key){

    Node t = new Node(key);
    int index = key%size;

    if(chain[index] == null)
      chain[index] = t;
    else{
      // it is for the collision 

      Node temp = chain[index];
      while(temp.next!=null)
      {
        temp = temp.next;
      }
      temp.next = t;
    }


  }

  static int search(int key){
    int index = key%size;

    Node temp = chain[index];

    while(temp!=null){
      if(temp.data == key)
        return 1;
      temp = temp.next;
    }
    return 0;
  }

  static void print(){
   
    for(int i=0;i < size; i++){
      Node temp = chain[i];
      System.out.print("Chain " +i+" -- > ");
      while(temp!=null){
        System.out.print("--> "+temp.data+"-->");
        temp = temp.next;
      }
      System.out.println("Null-->");
    }
  }
public static void main(String[] args) {
  arr();
  insert(7);
  insert(0);
  insert(3);
  insert(10);
  insert(4);
  insert(5);
  print();
  System.out.println();
  System.out.println("Search for Key 7");

  if(search(7)==1)
    System.out.println("Found the element");
  else
    System.out.println("No element found");

}

}














