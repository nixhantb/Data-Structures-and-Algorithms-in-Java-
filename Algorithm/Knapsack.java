import java.util.Arrays;

import java.util.Comparator;

public class Knapsack{

     static double knapsacks(int wt[], int val[], int capacity) {
        // ItemValue : integrates above parameters in one index of array
        ItemValue[] ival = new ItemValue[wt.length];

        for (int i = 0; i < wt.length; i++) {
            // makes partion of wt val and index i 
            // gets stored in aray 
            ival[i] = new ItemValue(wt[i],val[i],i);

            
            
        }
        
        // sorting the items as per val/wt ratio in a decreasing order
        // comparator function used for that
        // it compares the cost of val/wt 
        
        Arrays.sort(ival, new Comparator<ItemValue>(){

            @Override

                public int compare(ItemValue o1, ItemValue o2){
                
                // here the comparing is first made between to object 
                // that holds the wt/val ratio and cost is compared 
                // and then it is sorted in descending order 

                return o2.cost.compareTo(o1.cost);

            }
            
        });

        double totalValue = 0d;

        for(ItemValue i : ival){
            
            // current weight 
            int curWt  = (int)i.wt;
            int curVal = (int)i.val;
            
            if(capacity-curWt >=0){
                capacity = capacity - curWt;
                totalValue+=curVal;

            }
            else{
                // item can't pick whole the value 
                double fraction = ((double)capacity/(double)curWt);
                totalValue+=(curVal*fraction);

                capacity = (int)(capacity-(curWt*fraction));
                break;

            }






        }
          
    return totalValue;
    }
    
    // Item value class 
    static class ItemValue{
        Double cost;

        double wt,val,ind;
        public ItemValue(int wt, int val, int ind){
            this.wt = wt;
            this.val = val;
            this.ind = ind;
            cost = new Double((double)val / (double)wt);
        }
    }
    
    public static void main(String[] args) {
        int[] wt = {2,3,5,7,1,4,1};
        int[] val = {10,5,15,7,6,18,3};
        int capacity = 15;

        double maxVal =knapsacks(wt,val,capacity);
        System.out.println("The max value is "+maxVal);
    }


}
