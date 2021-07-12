import java.util.*;


public class CountTreeHeight{

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

  // create tree 
  
  void Create(){

    Node p, t;

    int x;

    Queue<Node> q = new LinkedList<>();

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the root value");

    x = sc.nextInt();

    root = new Node(x);

    q.add(root);

    // [root              ]

    while(!q.isEmpty()){

      p = q.poll();// [ t1   ] 

      System.out.println("Enter the left child of root "+p.data);
      x = sc.nextInt();

      if(x!=-1){
        t = new Node(x);

        p.left = t;

        q.add(t);
      }
      // [t1  ]

      System.out.println("Enter the right child of root "+p.data);

      x = sc.nextInt();

      if(x!=-1){
        t = new Node(x);

        p.right= t;

        q.add(t);

        // [t1 t2  ]


      }

    }



  }

 int Height(Node n){
   if(n==null){
     return 0;
   }
   
   int x = Height(n.left);
  int  y = Height(n.right);

   if(x>y){
     return (x+1);
   }
   else{
     return (y+1);
   }
   
 }
 public static void main(String[] args) {
   CountTreeHeight tree = new CountTreeHeight();
   tree.Create();
   System.out.println("Height of tree");
   System.out.println(tree.Height(root));
 }
}
















