import java.util.*;
public class BFSS {

  static void myBf(int G[][], int start, int n){

    Queue<Integer> q = new LinkedList<>();
    int i = start;
    int visited[] = new int[7];

    for(int k = 0; k <visited.length; k++){

      visited[k] = 0;

    }

    System.out.println(i);
    visited[i] = 1;
    q.add(i);

    // repeat 

    while(!q.isEmpty()){
      
      i = q.remove();
      for(int j =1; j <n; j++){

        if(G[i][j]==1 && visited[j] == 0){

          System.out.println(j);
          visited[j] = 1;
          q.add(j);
        }
      }
    }


      

  }

  public static void main(String[] args) {
    
    int G[][] = {{0,0,0,0,0,0,0},
                  {0,0,1,1,0,0,0},
                  {0,1,0,0,1,0,0},
                  {0,1,0,0,1,0,0},
                  {0,0,1,1,0,1,1},
                  {0,0,0,0,1,0,0},
                  {0,0,0,0,1,0,0}};


    myBf(G,5,7);
  }
}
