public class Stockbuy{

  static int maxProfit(int price[]){

    int n = price.length;
    int cost = 0;
    int max = 0;

    if(n==0){
      return 0;
    }


    int min = price[0]; // 7 is selected 

    for(int i =0; i < n; i++){

      min = Math.min(min, price[i]);

      cost = price[i] - min;

      max = Math.max(max, cost);

    }

    return max;
    

  }

  public static void main(String[] args) {
    int a[] = {7,1,5,3,6,4};

    System.out.println(maxProfit(a));
  }
}
