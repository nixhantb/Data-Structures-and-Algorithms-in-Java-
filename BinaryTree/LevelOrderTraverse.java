import java.util.*;

class LevelOrderTraverse{

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


  void create(){
  
    Node p,t;

    int x;
    Queue<Node> q = new LinkedList<>();

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the root value");

    x = sc.nextInt();

    root = new Node(x);

    q.add(root);

    while(!q.isEmpty()){

      p = q.poll();
      System.out.println("Enter the left child of "+p.key);

      x = sc.nextInt();
      if(x!=-1){

        t = new Node(x);
        p.left = t;

        q.add(t);

      }
    
      System.out.println("Enter the right child of "+p.key);
      x = sc.nextInt();

      if(x!=-1){
      
        t = new Node(x);
        p.right= t;

        q.add(t);

        
      }
      


    }


    


  }

  void Inorder(Node p){
    if(p!=null){

      Inorder(p.left);
      System.out.print(p.key+" ");
      Inorder(p.right);
    }
    
  }

  void LevelOrder(Node p){
   if(p==null){
     return;
   }
    Queue<Node> q = new LinkedList<>();

    System.out.print(p.key+" ");
    q.add(p);

    while(!q.isEmpty()){

      p = q.poll();// dequeue

      if(p.left!=null){
        System.out.print(p.left.key+" ");
        q.add(p.left);
      }
      if(p.right!=null){

        System.out.print(p.right.key+" ");
        q.add(p.right);
      }


    }
  }


public static void main(String[] args) {
  LevelOrderTraverse tree =  new LevelOrderTraverse();

  tree.create();

  System.out.println("Inorder Traversal");
  tree.Inorder(root);

  System.out.println();
  System.out.println("LevelOrder Traversal");
  tree.LevelOrder(root);
  
}








}
