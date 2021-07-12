class Node{
  int key;
  Node left, right;

  public Node(int d){
    this.key = d;
    left = null;
    right = null;

  }
}


// Tree class 

class BinaryTreeTraversal{
  Node root;


  void printPostorder(Node n){

    if(n!=null){

      printPostorder(n.left);
      printPostorder(n.right);
      System.out.print(n.key+" ");

    }

  }

  void printInorder(Node n){

    if(n!=null){

    printInorder(n.left);

    System.out.print(n.key+" ");
    printInorder(n.right);
  }
  }

  void printPreOrder(Node n){

    if(n!=null){
      System.out.print(n.key+" ");
      printPreOrder(n.left);
      printPostorder(n.right);
    }
  }


  public static void main(String[] args) {
    
    BinaryTreeTraversal tree  = new BinaryTreeTraversal();
    tree.root = new Node(1);
    tree.root.left = new Node(2);
    tree.root.right = new Node(3);

    tree.root.left.left = new Node(4);
    tree.root.right.right = new Node(5);

    System.out.println("\nPre-Order Travesal\n");
    tree.printPreOrder(tree.root);


    System.out.println("\nIn order Traversal\n");
    tree.printInorder(tree.root);

    System.out.println("\nPost Order Traversal\n");

    tree.printPostorder(tree.root);
  }
}
