class Stack{

  static final int Max = 1000;

  int top;

  int a[] = new int[Max];

  boolean isEmpty(){

    return (top <0);
  }

  Stack(){
    top = -1;
  }

  void push(int x){
    if(top>(Max-1)){
      System.out.println("Stack Overflow");
    }
    else{
      top++;
      a[top] = x;

      System.out.println(x+" is pushed");
    }
  }

  void pop(){
    if(top<0){
      System.out.println("Stack underflow");
    }
    else{
      int temp = a[top];
      top--;

      System.out.println(temp+" is popped");
    }
  }
  void peek(int pos){
    int t=-1;
    if(top-pos+1 <0){
      System.out.println("Stack underflow");
    }
    else{

      t = a[top-pos+1];
      System.out.println(t+" is the element");
    }
  }

  void stacktop(){
    if(top==-1){
      System.out.println("Stack is empty");
    }
    else{
      System.out.println("Top element is a stack is "+a[top]);
    }
  }

  void isFull(){
    if(top == Max-1){
      System.out.println("Stack is full");
    }
    else{
      int k =Max-top; 
      System.out.println("Still there is "+k+" space vacant for insertion");
    }
  }
  public static void main(String[] args){

    Stack st = new Stack();
    st.push(3);
    st.push(4);
    st.push(5);
    st.peek(1);
    st.stacktop();
    st.isFull();
    st.pop();
    

  }
}
