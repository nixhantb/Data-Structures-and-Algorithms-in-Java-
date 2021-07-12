import java.util.*;

public class Bfs {

            /*
             1
            
          2     3

      4      5      7
      */


  static void BFS(int G[][], int start, int n){

    Queue<Integer> queue = new LinkedList<Integer>();
    int i = start;

    int visited[] =new int[7];
    for(int k = 0;k<visited.length;k++){
      visited[k] = 0;
    }


    System.out.println(i);
    visited[i] = 1;


    queue.add(i);


    while(!queue.isEmpty()){

      i = queue.remove();

      for(int j = 1; j <n; j++){

        if(G[i][j]==1 && visited[j]==0){

          System.out.println(j);
          
          visited[j] = 1;

          queue.add(j);

          
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



    BFS(G,4,7);



  }
}
