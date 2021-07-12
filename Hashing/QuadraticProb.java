public class QuadraticProb{
  // set max value 
  static int max = 10;

  static int hash(int key){
    return key%max;
  }

  // prob 
  static int Prob(int H[], int key){

    int index  = hash(key);
    int i = 0;
    while(H[(index+(i*i))%max]!=0)
      i++;
    return (index+(i*i))%max;
  }

  static void insert(int H[], int key){
    int index = hash(key);
    
    if(H[index]!=0)
      index = Prob(H,key);
    H[index] = key;
      
    }
  //search 

static  int Search(int H[], int key){
    int index = hash(key);

    int i=0;

    while(H[(index+(i*i))%max]!=key)
      i++;
    return (index+(i*i))%max;
  }
  public static void main(String[] args) {
    int H[] = new int[10];

    for(int i=0;i<max;i++){
      H[i] = 0;
    }

    insert(H,12);
    insert(H,25);
    insert(H,43);
    insert(H,23);

    int x = Search(H,23);
    System.out.println("Key Found at the index "+x);
  }

  
}
