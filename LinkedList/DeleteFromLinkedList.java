class DeleteFromLinkedList{
  
  Node head;

   class Node{
    int data;
    Node next;

    Node(int d){
      data = d;
      next = null;

    }
  }

  public void push(int x){
    
   Node newNode = new Node(x);

   newNode.next = head;
   head = newNode;

   
 }

 void deleteNode(int x){

   // if to be deleted is head

   Node temp = head, prev = null;


   if(temp!=null && temp.data == x){
     head = temp.next;
     return; 
   }

   while(temp!=null && temp.data != x){

     prev = temp;
     temp = temp.next; 


   }

   if(temp == null){
     return;
   }


   prev.next = temp.next; 

 }


public void printList(){
   Node n = head; 

   while(n!=null){
     System.out.print(n.data+" ");
     n = n.next;
   }
 }

 public static void main(String[] args) {
   DeleteFromLinkedList LL  = new DeleteFromLinkedList();
   LL.push(3);
   LL.push(5);
   LL.push(4);
  
  LL.printList();
  LL.deleteNode(5);
  System.out.println();
  LL.printList();
 }
}
