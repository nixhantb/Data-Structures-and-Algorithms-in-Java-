public class InsertBinary{
  // Make node

  static Node root;

  static class Node{

    int key;
    Node left;
    Node right;


    Node(int d){
      this.key = d;
      this.left = null;
      this.right = null;
    }
  }
  
  // Insert in a BST

 static void insert(int key){
    
    Node t = root;
    Node r = null;
    Node p;
    
    if(root == null){

      p = new Node(key);
      root = p;
      return;
    }
    while(t!=null){
      
      r = t;

      if(key<t.key)
        t = t.left;
      else if(key>t.key)
        t = t.right;

      else
        return;
    }

    p = new Node(key);
    if(p.key< r.key){
       r.left = p;
    }
    else{

      r.right = p;
    }

  }

  void Inorder(Node p){
    if(p!=null){
      Inorder(p.left);
      System.out.print(p.key+" ");
      Inorder(p.right);
    }
  }

  

  
  public static void main(String[] args) {
    
    InsertBinary tree = new InsertBinary();
    insert(8);
    insert(66);
    insert(78);
    insert(4);
    insert(5);

    tree.Inorder(root);
  }

}









