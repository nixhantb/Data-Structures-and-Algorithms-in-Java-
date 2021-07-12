public class Alternate{

  static void printm(int a[]){

    for(int i = 0; i < a.length; i++){

      if(a[i]%2 == 0)
        continue;
      System.out.print(a[i]+" ");
    }
  }


  public static void main(String[] args) {
    int a[] = {1,2,3,4,5,6,7,8,9,10};
    printm(a);
  }
}
