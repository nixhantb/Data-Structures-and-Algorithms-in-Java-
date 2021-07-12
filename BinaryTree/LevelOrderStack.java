import java.util.*;
public class LevelOrderStack{

    static Node root;


    static class Node{

      int data;
      Node left;
      Node right;
      // constructor 

      Node(int d){
        this.data = d;
        this.left = null;
        this.right = null;

      }
    }

    static void Create(){

      Node p, t;

      int x;
      Queue<Node> q = new LinkedList<>();
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the root value: ");
      x = sc.nextInt();
      
      root = new Node(x);

      q.add(root);

      while(!q.isEmpty()){
        p = q.poll();

        System.out.println("Enter the left child of root "+p.data);

        x = sc.nextInt();

        if(x!=-1){
          t = new Node(x);
          p.left = t;

          q.add(t);


        }

        System.out.println("Enter the child of right child "+p.data);
        x = sc.nextInt();

        if(x!=-1){
          
          t = new Node(x);

          p.right = t;

          q.add(t);
        }
      }

      
      
      
      
    }


    void LevelOrder(Node n){
      
      Queue<Node> q = new LinkedList<>();

      System.out.print(n.data+" ");
      q.add(n);


      while(!q.isEmpty()){
        n = q.poll();

        if(n.left!=null){
          System.out.print(n.left.data+" ");
          q.add(n.left);
        }
        if(n.right!=null){

          System.out.print(n.right.data+" ");
          q.add(n.right);

        }
      }
    }
    
    public static void main(String[] args) {
      LevelOrderStack tree = new LevelOrderStack();

      tree.Create();
      System.out.println("Level Order Traversal");
      System.out.println();
      tree.LevelOrder(root);
    }
}














