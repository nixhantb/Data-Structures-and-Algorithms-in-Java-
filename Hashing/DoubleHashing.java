public class DoubleHashing{
  static int size = 10;

  // first hash function
  
  static int hash1(int key){
    return key%size;
  }

  static int hash2(int key){
    int r = 7;

    return r-(key%r);
  }


  static int probe(int H[],int key){
    int index = hash1(key);
    int id2 =hash2(key);

    
    int i = 0;
    
    while(H[(index+i*(id2))%size]!=0){
      i++;
    }

    return (index+i*(id2))%size;
    
  }


  static void insert(int H[], int key){

    int index = hash1(key);

    if(H[index]!=0)
      index = probe(H,key);
    H[index] = key;
  }

  static int search(int H[], int key){
    int index = hash1(key);

    int id2= hash2(key);
    int i=0;
    while(H[(index+i*(id2))%size]!=key){
      i++;
    }

    return (index+i*(id2))%size;



  }
  public static void main(String[] args) {
    int HT[] = new int[10];

    for(int i=0;i<size;i++){
      HT[i] = 0;
    }
    insert(HT,5);
    insert(HT,25);
    insert(HT,15);
    insert(HT,35);
    System.out.println("Key found at the index "+search(HT,35));
  }

}

