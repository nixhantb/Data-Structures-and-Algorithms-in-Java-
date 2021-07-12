public class Dif {

  static int dff(int a[], int x, int y){

    int n = a.length;

    int p = -1, min  = Integer.MAX_VALUE;
    for(int i = 0; i < n; i++){

      if(a[i] == x  || a[i] == y){

        
        if(p!= -1 && a[i]!=a[p]){
          min = Math.min(min, i-p);
        }

        p = i;
      }
          

    }


    if(min == Integer.MAX_VALUE)
      return -1;
    return min;
  }

  public static void main(String[] args) {
    
    int a[] = {1,4,3,0};

    int x= 1;
    int y = 0;

    System.out.println(dff(a,x,y));
  }
}
