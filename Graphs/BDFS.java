// Queue 

import java.util.*;
public class BDFS {


  static void Bfs (int G[][], int start, int n){

    Queue<Integer> q  =new LinkedList<>();

    int i = start;


    int visited[] = new int[7];

    for(int k = 0; k <n; ++k){
      visited[k] = 0;
    }

    System.out.print(i+" ");

    visited[i] = 1;

    q.add(i);

    while (!q.isEmpty()){


      i = q.remove();
      for(int j =1; j <n; j++){

        if(G[i][j]==1 && visited[j] == 0){

          System.out.print(j+" ");
          visited[j] = 1;
          q.add(j);
        }
      }
    }
    
  }

   static  int visited[] = {0,0,0,0,0,0,0};
  static void Dfs(int G[][], int start, int n){
    
    if(visited[start] == 0){
      System.out.print(start+" ");
      visited[start]= 1;

      
      for(int i = 1; i <n; i++){

        if(G[start][i] == 1 && visited[i]==0){
          Dfs(G,i,n);
        }

      }
    }
  }
  public static void main(String[] args) {
    
    int G[][] = {{0,1,1,1,0,0,0},
                {1,0,1,0,0,0,0},
                {1,0,0,1,1,0,0},
                {1,0,1,0,1,0,0},
                {0,0,1,1,0,1,1},
                {0,0,0,0,1,0,0},
                {0,0,0,0,1,0,0}};


    System.out.println("BFS");
    Bfs(G,4,7);
    System.out.println();
    System.out.println("DFS");
    Dfs(G,4,7);
  }
}
