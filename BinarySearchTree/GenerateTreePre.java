
import java.util.*;
public class GenerateTreePre{
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
  void Create(int a[], int n){

    Stack<Node> st = new Stack<Node>();

    Node t;
    int i = 0;
    
    Node p;
    root = new Node(a[i++]);
    p = root;
    while(i<n){ 
      if(a[i]<p.data){
        t = new Node(a[i++]);
        p.left = t;
        st.push(p);
        p = t;
      }
      else{

      
      if(a[i]>p.data && a[i]<st.pop().data){
        if(st.isEmpty()){
          Node x = new Node(444);
          st.push(x);
        }
        
       t = new Node(a[i++]);
        p.right = t;
        p = t;
      }
      else{
        p = st.pop();

      }


    }
    }
    
  }
  void Inorder(Node n){
    if(n!=null){
      System.out.print(n.data+" ");
      
      Inorder(n.left);
      Inorder(n.right);
    }
  }
  public static void main(String[] args) {
    GenerateTreePre tree = new GenerateTreePre();
    int a[] = {30,20,10,15,25,40,50,45};
    
    tree.Create(a,8);
    tree.Inorder(root);

  }
}

