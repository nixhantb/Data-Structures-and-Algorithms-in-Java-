public class AVL{
	// Node class 
	static Node root;

	
	static class Node{
		int key,height;
		Node left,right;
		
		//constructor
		
		Node(int d){
			key = d;
			height = 1;

		}
	}
	// calculates the height of the tree 
	
	int height(Node n){
		if(n==null)
			return 0;
		return n.height;

	}
	// max of two integers 
	
	int max(int a, int b){
		return (a>b) ? a:b;
	}
// RR 
  
	// LL Rotation 
	Node rightRotate(Node y){
		Node x = y.left;
		Node T2  = x.right;

		// perfom the rotation 

		x.right = y;
		y.left = T2;

		// update the heights 

		x.height = max(height(x.left),height(x.right))+1;
		y.height = max(height(y.left),height(y.right))+1;

		// return the new node 
		return x;

	}
	Node leftRotate(Node x){
		// node x as a base root 
	  Node y = x.right;
		Node T2 = y.left;

		// rotate the node 

		y.left = x;
		x.right = T2;
		// update the height 

		x.height = max(height(x.left), height(x.right))+1;

		y.height = max(height(y.left),height(y.right))+1;

		return y;
	}
	// get the balanced factor 
	
	int getBalance(Node n){
		if(n==null) 
			return 0;
	  return height(n.left)-height(n.right);	
	}
 Node insert(Node n, int key){
	 // Perform BST recursion 
	 if(n==null)
		 return (new Node(key));
	 if(key < n.key)
		 n.left = insert(n.left, key);
	 
	 else if(key > n.key)

		 n.right = insert(n.right, key);
	 else  
		 return n;
	 n.height = 1+max(height(n.left),height(n.right));

	 int balance = getBalance(n);

	 if(balance > 1 && key < n.left.key)
		 return rightRotate(n);
	 
	 if(balance < -1 && key > n.right.key)
		 return leftRotate(n);

	 // left right case 

	 if(balance > 1 && key > n.left.key){
		 n.left = leftRotate(n.right);
		 return rightRotate(n);

	 }
	 if(balance < -1 && key < n.right.key){
		 n.right = rightRotate(n.right);
		 return leftRotate(n);
	 }
	 return n;

 }	

 void PreOrder(Node n){
	 if(n!=null){
	 System.out.print(n.key+" ");
	 PreOrder(n.left);
	 PreOrder(n.right);
	 }
 }

public static void main(String[] args) {
	AVL tree = new AVL();
				tree.root = tree.insert(tree.root, 10);
        tree.root = tree.insert(tree.root, 20);
        tree.root = tree.insert(tree.root, 30);
        tree.root = tree.insert(tree.root, 40);
        tree.root = tree.insert(tree.root, 50);
        tree.root = tree.insert(tree.root, 25);
				System.out.println("Preorder Traversal");
				tree.PreOrder(root);
}

		
	}

