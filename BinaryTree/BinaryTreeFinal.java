import java.util.*;

public class BinaryTreeFinal{
  // Node class 
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

  // create the tree by user input 
  // we use the queue 

  void Create(){

    Node p, t;

    int x;

    Scanner sc = new Scanner(System.in);
    System.out.println("Entet the root node: ");

    x = sc.nextInt();
    Queue<Node> q = new LinkedList<>();

    root = new Node(x);

    q.add(root);
  // now the root node is pushed into the queue

  while(!q.isEmpty()){

    p  = q.poll();
    System.out.println("Enter the left child of "+p.data);
    x = sc.nextInt();
    
    if(x!=-1){
      t = new Node(x);
      p.left = t;
      q.add(t);
    }
    System.out.println("Enter the right child of "+p.data);
    x = sc.nextInt();

    if(x!=-1){
      t = new Node(x);
      p.right = t;

      q.add(t);

    }
  }
    

  }
// pre order traversal

  void PreorderTraveral(Node n){

    Stack<Node> st = new Stack<Node>();

    while(n!=null || !st.isEmpty()){
      if(n!=null){
        
        System.out.print(n.data+" ");
        st.push(n);
        n = n.left;
      }
       
      else{
        
        n = st.pop();
        n = n.right;

      } 
      }
    }

   
  void InorderTraversal(Node n){

    Stack<Node> st = new Stack<Node>();
    while(n!=null || !st.isEmpty()){
      if(n!=null){
        st.push(n);
        n = n.left;

      }
      else{
        n = st.pop();
        System.out.print(n.data+" ");
        n = n.right;
      }
    }
  }
  
  void PostOrderTraversal(Node n){
      Stack<Node> st = new Stack<Node>();

      while(n!=null || !st.isEmpty()){
        if(n!=null){
          st.push(n);

          n = n.left;

        }

        else{
          
          n = st.pop();


          n = n.right;

        }

      }
    
  }

  int Height(Node n){
    if(n==null){
      return 0;
    }  
    int x = Height(n.left);
    int y = Height(n.right);
    if(x>y){
      return (x+1);
    }
    else{
      return (y+1);
    }
  }

  int CNode(Node n){
    if(n!=null){

      return CNode(n.left)+CNode(n.right)+1;
    }
    return 0;
  }

  public static void main(String[] args) {
    
    BinaryTreeFinal tree  = new BinaryTreeFinal();

    tree.Create();
    System.out.println("Pre Order Traversal:\n");
    tree.PreorderTraveral(root);
    System.out.println("\nInorder Traversal:\n");
    tree.InorderTraversal(root);
    System.out.println("\nPostOrder Traversal:\n");
    System.out.println();
    System.out.println("Height of Tree: ");
    System.out.println(tree.Height(root)-1);
    System.out.println();
    System.out.println("Node");
    System.out.println(tree.CNode(root));
  }


}


