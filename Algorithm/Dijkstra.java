import java.util.*;

import java.lang.*;
import java.io.*;

class Dijkstra{
	static final int V=9;
	int minDistance(int dis[], Boolean sptSet[]){
		int min = Integer.MAX_VALUE,min_index = -1;
		
		for(int v = 0;v<V;v++){
			if(sptSet[v]== false && dis[v]<=min){

				min  = dis[v];
				min_index = v;
			}
		}
		return min_index;
	}

	// print the distance 
	
	void printSol(int dis[]){
		System.out.println("Distance from the source");
		for(int i = 0;i<V; i++){
			
		System.out.println(i+"\t\t "+dis[i]);}
	}

	void djk(int graph[][] , int src){
		int dis[] = new int[V];
	
		Boolean sptSet[] = new Boolean[V];

		for(int i = 0; i<V; i++){
			dis[i] = Integer.MAX_VALUE;
			sptSet[i] = false;


		}

		dis[src] = 0;

		for(int count = 0;count <V-1; count++){
	
			int u = minDistance(dis, sptSet);
			sptSet[u] = true;


			for(int v =0;v<V;v++){

			if(!sptSet[v] && graph[u][v] !=0 && dis[u]!=Integer.MAX_VALUE && dis[u]+graph[u][v] < dis[v])
				dis[v] = dis[u]+graph[u][v];


			}


		}

printSol(dis);

	}
public static void main(String[] args) {
	int graph[][] = new int[][] { { 0, 4, 0, 0, 0, 0, 0, 8, 0 },
                                      { 4, 0, 8, 0, 0, 0, 0, 11, 0 },
                                      { 0, 8, 0, 7, 0, 4, 0, 0, 2 },
                                      { 0, 0, 7, 0, 9, 14, 0, 0, 0 },
                                      { 0, 0, 0, 9, 0, 10, 0, 0, 0 },
                                      { 0, 0, 4, 14, 10, 0, 2, 0, 0 },
                                      { 0, 0, 0, 0, 0, 2, 0, 1, 6 },
                                      { 8, 11, 0, 0, 0, 0, 1, 0, 7 },
                                      { 0, 0, 2, 0, 0, 0, 6, 7, 0 } };
        Dijkstra t = new Dijkstra();
				t.djk(graph, 0);

}}
