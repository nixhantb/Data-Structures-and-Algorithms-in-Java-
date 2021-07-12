public class RecursiveSearch{
  static Node root;

  static class Node{
    int key;

    Node left;
    Node right;

    // constructor

    Node(int d){
      this.key = d;
      this.left = null;
      this.right = null;
    }
  }
  
  static void insert(int key){
    Node t = root;
    Node r = null;
    Node p;

    if(root==null){

      p =  new Node(key);
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
        return;

    }
    p = new Node(key);
    if(key < r.key){
      r.left = p;
    }
    else{
      r.right = p;
    }
  }
  static Node Rinsert(Node p, int key){
    Node t = null;
    if(p == null){
      t = new Node(key);
      return t;
    }
    if(key < p.key)
      p.left = Rinsert(p.left,key);
    else if(key > p.key)
      p.right = Rinsert(p.right, key);
    return p;
  }

  static void Inorder(Node n){
    if(n!=null){
      Inorder(n.left);
      System.out.print(n.key+" ");
      Inorder(n.right);
    }
  }
  static boolean search(int key){
    Node t = root;
    while(t!=null){
      if(key == t.key)
        return true;
      else if(key < t.key)
        t= t.left;
      else
        t = t.right;
    }
    return false;
  }
    public static void main(String[] args) {
      RecursiveSearch tree = new RecursiveSearch();

    tree.Inorder(root);
    System.out.println();
    root = Rinsert(root, 42);
    Rinsert(root, 3);
    Rinsert(root, 4);
    Rinsert(root, 8);

        
    tree.Inorder(root);
    System.out.println();
    if(search(4)){
      System.out.println("Found");
    }
    else{
      System.out.println("Not in the tree!!");
    }

    }
  }

