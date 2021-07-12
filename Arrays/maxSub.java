
public class maxSub{
  public static void main(String[] args) {

    int arr[] = {1,2,5,-7,2,3};

    int sum = 0, s2 = 0;

    int start = 0, end = 0, s = 0;
    for(int i = 0; i < arr.length; i++){

      
      if(arr[i] < 0){
        s = i+1;
        sum = 0;
      }

      else{
        sum+=arr[i];
      }

      if(sum > s2) {

        s2 = sum;

        start = s;

        end = i;
        
      }

      



  }
System.out.println(s2);


  }

 
  }

