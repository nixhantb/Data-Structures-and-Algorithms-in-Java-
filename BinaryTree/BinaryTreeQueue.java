import java.util.Scanner;
import java.util.*;


public class BinaryTreeQueue{
  static Node root;

  class Node{
    int key;
    Node left;
    Node right;

    Node(int d){
      this.key = d;

      this.left = null;
      this.right = null;
    }
  }



  void CreateTree(){
    Node p,t;

    int x;

    Queue<Node>q = new LinkedList<>();

    System.out.println("Enter the root value");
    Scanner sc= new Scanner(System.in);
    x = sc.nextInt();
    root = new Node(x);
    q.add(root);

    while(!q.isEmpty()){
      p = q.poll();

      System.out.println("Enter the left Child "+p.key);

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
       p.right = t;
       q.add(t);

      }
      
    }
    



  }
  void Preorder(Node p){
    if(p!=null){
      System.out.print(p.key+" ");
      Preorder(p.left);
      Preorder(p.right);
    }
  }

  void Inorder(Node p){
    if(p!=null){
      Inorder(p.left);
      System.out.print(p.key+" ");
      Inorder(p.right);
    }
  }
  void PostOrder(Node p){
    if(p!=null){
      PostOrder(p.left);
      PostOrder(p.right);
      System.out.print(p.key+" ");
    }
  }
  
  public static void main(String[] args) {
    BinaryTreeQueue tree = new BinaryTreeQueue();
    tree.CreateTree();
    System.out.println("Preorder Traversal\n");
    tree.Preorder(root);
    System.out.println();
    System.out.println("Inorder Traversal\n");
    tree.Inorder(root);
    System.out.println();
    System.out.println("PostOrder Traversal\n");
    System.out.println();
    tree.PostOrder(root);


  }

}















 
