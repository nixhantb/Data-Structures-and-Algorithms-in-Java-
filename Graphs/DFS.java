import java.util.*;
public class DFS {

    static int visited[] = {0,0,0,0,0,0,0};
  static void DFM(int G[][], int start, int n){



    if(visited[start] == 0){

      System.out.println(start);
      visited[start] = 1;

      for(int j = 1; j <n; j++){

        if(G[start][j]==1 && visited[j]==0){

        
          DFM(G, j, n);}
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

    DFM(G,4,7);
  }
}
