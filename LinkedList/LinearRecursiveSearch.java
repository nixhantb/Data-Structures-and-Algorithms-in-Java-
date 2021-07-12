public class LinearRecursiveSearch{
  Node head;
  // node class 
  static class Node{
    int data;
    Node next;

    Node(int d){
      this.data = d;
      next = null;
    }
  }

  public void push(int new_data){
    Node new_node = new Node(new_data);
    new_node.next = head;
    head = new_node;

    
  }
  public boolean search(Node head, int x){
    
    if(head==null){
      return false;
    }

    if(head.data == x){
      return true;
    }
    else{
      return search(head.next,x);

    }
  }

  public static void main(String[] args) {
    LinearRecursiveSearch nix = new LinearRecursiveSearch();
    nix.push(13);
    nix.push(4);
    nix.push(44);
    nix.push(45);

    if(nix.search(nix.head,4)){
      System.out.println("Is is found");
    }
    else{
      System.out.println("Is is not found");
    }
  }
}
