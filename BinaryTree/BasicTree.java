// make a node class 

class Node{
  int key;
  Node left, right;

  public Node(int d){
    this.key = d;
    this.left = null;
    this.right = null;


  }

}


class BasicTree{
  // make a root node 
 
  Node root;





  public void printM(Node h){
   if(h!=null){

     System.out.print(h.key+" ");
     printM(h.left);
     printM(h.right);
   } 
  }

  public static void main(String[] args) {
    BasicTree tree = new BasicTree();

    tree.root = new Node(1);

    tree.root.left = new Node(2);
    tree.root.right = new Node(3);

    tree.root.left.left = new Node(4);

    tree.printM(tree.root);

  }
}



