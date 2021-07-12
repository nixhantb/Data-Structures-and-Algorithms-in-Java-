import java.util.*;

class StackTraversal{

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


  static void Create(){

    Node p,t;

    int x;

    Queue<Node> q = new LinkedList<>();
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the root ");
    x = sc.nextInt();
    root = new Node(x);

    q.add(root);

    while(!q.isEmpty()){
      p = q.poll(); // dequeue 

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

        p.right = t;
        q.add(t);
      }
    }

    
      
  }


void Preorder(Node p){
  Stack<Node> st = new Stack<Node>();
  while(p!=null || !st.isEmpty()){


  if(p!=null){
    System.out.print(p.key+" ");

    st.push(p);
    p = p.left;
    
  }
  else{
    p = st.pop();
    p = p.right;
  }
  }
}
public static void main(String[] args) {
  StackTraversal tree = new StackTraversal();

  tree.Create();
  System.out.println("Preorder");
  System.out.println();
  tree.Preorder(root);
}









}
