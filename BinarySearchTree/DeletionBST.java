public class DeletionBST{
  // make a static root node 
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
  void insert(int key){
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
      if(key < t.key)
        t = t.left;
      else if (key > t.key)
        t = t.right;
      else
        return ;
    }
    // so t reaches to it's end and r remains the node just before the t 
    // new node to be inserted 
    p = new Node(key);
    if(key < r.key){
      r.left = p;
    }
    else{
      r.right = p;
    }
  }
  void Inorder(Node n){
    if(n!=null){
      Inorder(n.left);
      System.out.print(n.key+" ");
      Inorder(n.right);
    }
  }

  boolean search(int key){
    Node t = root;
    while(t!=null){
      if(key == t.key)
        return true;
      else if (key < t.key)
        t = t.left;

      else
        t = t.right;
    }
    return false;
    

  }
  // utilities functions 
  int Height(Node p){
    int x,y;
    if(p==null){
      return 0;
    }
    x = Height(p.left); 
    y = Height(p.right);
    
    if(x>y)
      return x+1;
    else
      return y+1;
  }

  // In order predeccesor 
  Node InPre(Node p){
    while(p!=null && p.left!=null){
      p = p.left;
    }
    return p;
  }

  Node Insucc(Node p){
    while(p!=null && p.right!=null){
      p = p.right;

    }
    return p;
    
    
  }
  // deletion of the node in a  tree 
  Node Delete(Node p, int key){
    Node q;

    // if root is null , return simply null
    if(p==null)
      return null;
    if(p.left == null && p.right == null){
      if(p==root)
        root = null;
      return null;
    }
    
    if(key < p.key)
      p.left = Delete(p.left,key);
    else if(key < p.key)
      p.right = Delete(p.right, key);
    else{
      
      if(Height(p.left) > Height(p.right)){
        q = InPre(p.left);
        p.key = q.key;
        p.left = Delete(p.left, q.key);

      }
      else{
        q = Insucc(p.right);
        p.key = q.key;
        p.right = Delete(p.right, q.key);



      }

    }
    return p;
  }
  public static void main(String[] args) {
    DeletionBST tree = new DeletionBST();
    tree.insert(4);
    tree.insert(3);
    tree.insert(2);

    tree.insert(8);
    System.out.println();
    System.out.println("Inorder Traversal");
    tree.Inorder(root);
    System.out.println();
    System.out.println("Search 4");
    if(tree.search(4)){
      System.out.println("It is found ");
    }
    else{
      System.out.println("It is not found");
    }
    System.out.println("Height of the tree:");
    System.out.println(tree.Height(root));
    // delete 3 
    System.out.println("Delete the key 3");
    tree.Delete(root, 3);
    
    System.out.println("After the deleteion");
    tree.Inorder(root);
  }
}
