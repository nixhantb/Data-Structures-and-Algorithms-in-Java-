public class SearchTree{
  // root node
  
  static Node root;

  static class Node{
    int key;
    Node left;
    Node right;
    // constructor

    Node(int k){

      this.key = k;
      this.left = null;
      this.right = null;

    }
  }
 // insert  
 

static  void insert(int key){
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
      if (key < t.key) {
        t = t.left;
      }
      else if(key > t.key){
        t = t.right;
      }
      else{
        return;
      }
    }
    // make new node for insertion
    p = new Node(key);
    if(key < r.key){
      r.left = p;
    }
    else{
      r.right  = p;
    }
  }


static boolean search(int key){
  Node t = root;
  while(t!=null){
    if(key == t.key)
      return true;
    else if(key<t.key)
      t = t.left;
    else
      t = t.right;
    
    
   }
  return false;
}
void Inorder(Node n){
  if(n!=null){
    Inorder(n.left);
    System.out.print(n.key+" ");
    Inorder(n.right);
  }
}
public static void main(String[] args) {
  SearchTree tree = new SearchTree();

  insert(3);
  insert(7);
  insert(32);
  insert(44);
  insert(1);
  System.out.println();
  tree.Inorder(root);
  System.out.println();
  if(search(44)){
    System.out.println("It is in the tree");
  }
  else{
    System.out.println("Not in a tree");
  }
}










}
