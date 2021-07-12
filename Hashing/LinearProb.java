public class LinearProb{

 static int max = 10;

  static int hash(int key){
    return key%max;

  }
  
  static int probe(int H[], int key){
    int index = hash(key);

    int i  =0;

    while(H[(index+i)%max]!=0)
      i++;
    return (index+i)%max;
  }

  static void Insert(int H[], int key){
    int index = hash(key);
    if(H[index]!=0)
      index = probe(H,key);
    H[index] = key;

  }

  static int Search(int H[], int key){
    int index = hash(key);
    int i=0;

    while(H[(index+i)%max]!=key)
      i++;

    return (index+i)%max;
  }
public static void main(String[] args) {
    int HT[]  = new int[max];
  
    for(int i = 0;i<max;i++){
        HT[i] = 0;
        
    }
   
    Insert(HT,12);  
    Insert(HT,25);
    Insert(HT,35);
    Insert(HT,26);
    Insert(HT,45);
    int x = Search(HT,45);
    
    System.out.println("key Found at the index "+x);    
   
}
}

