// java program for traversal of linked list 

class DisplayLinkedList{

// head node

  Node head;

  // class and the constructor for the node 

   static class Node{
     int data;
     Node next;
     //[200]--> [ 4 | 345]---> [ 5 | 324]
     //           200            345 

     // constructor 
      Node(int d){
        
        this.data = d;
        this.next = null;
      }
   }

      // traversal 

      public void traverse(){
        
        Node n = head; 

        while(n!=null){

          System.out.println("Data : "+n.data);
          n  = n.next;

        }
      }


      public static void main(String[] args) {
        
        DisplayLinkedList L = new  DisplayLinkedList();

        L.head = new Node(1);
        Node sec = new Node(2);
        Node thrdd =new Node(4);


        L.head.next = sec;
        sec.next = thrdd;

        L.traverse();
      }
   }






























