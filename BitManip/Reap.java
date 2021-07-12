public class Reap {
  public static void main(String[] args) {
    
    int a[] = {5,4,1,4,3,5,1};

    int res = 0;
    for(int i=0;i <a.length; i++){

      res =res^a[i];

    }
    System.out.println(res);
  }
}


// 5 4 1 4 3 5 1 
// 4 4 5
