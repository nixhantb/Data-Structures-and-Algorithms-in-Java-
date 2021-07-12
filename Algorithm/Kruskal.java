import java.util.*;
import java.lang.*;
import java.io.*;
public class Kruskal{
    static int V  = 5;
    static int [] parent  = new int[V];
    static int INF = Integer.MAX_VALUE;

    static int find(int i){
        while(parent[i]!=i)
            i = parent[i]; 
        return i;
    }
    
    // for th union
    static void union(int i, int j){

        int a = find(i);
        int b = find(j);

        parent[a] = b;
    }
    // kruskal 
    static void kruskal(int cost[][]){
        int mincost = 0;

        for(int i = 0;i<V;i++){
            parent[i] =i;
        }

        int edge_count = 0;

        while(edge_count<V-1){
            int min = INF,a=-1,b=-1;
            for(int i =0;i<V;i++){
                for(int j =0;j<V; j++ ){

                    if(find(i)!=find(j) && cost[i][j]<min){

                        min = cost[i][j];
                        a  = i;
                        b  = j;
                    }
                }
            }
            union(a,b);
            System.out.printf("Edge %d:(%d, %d) cost:%d \n",
            edge_count++, a, b, min);
        mincost += min;
        }
        System.out.println("\nMin cost is "+mincost);
    }
    public static void main(String[] args) {
        int cost[][] = {
        { INF, 2, INF, 6, INF },
        { 2, INF, 3, 8, 5 },
        { INF, 3, INF, INF, 7 },
        { 6, 8, INF, INF, 9 },
        { INF, 5, 7, 9, INF },
    };
  
        kruskal(cost);
    }
}
