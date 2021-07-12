public class Kruskal{

  static void join(int u, int v){
    
    if(set[u] < set[v]){
      set[u]+=set[v];
      set[v]  = u;
    }
    else{
      set[v]+=set[u];
      set[u] = v;
    }
  }

  static int find(int u){
    int x = u;
    int v = 0;
    while(set[x]>0){
      x = set[x];
    }
    while(u!=x){
      v = set[u];
      set[u] = x;
      u = v;
    }
    return x;
  }
  public static void main(String[] args){
    int edge[][]={{1,2,28},{1,6,10},{2,3,16},{2,7,14},{3,4,12},
                   {4,5,22},{4,7,18},{5,6,25},{5,7,24}};
  int set[] = {-1,-1,-1,-1,-1,-1,-1,-1};

    int included[] = {0,0,0,0,0,0,0,0,0};
    
    int t[][] = new int[2][7];
    int u = 0;
    int v = 0;
    int k = 0;
   int min = Integer.MAX_VALUE;
    int i = 0;
    int n = 9;
    
    while(i <6){

      for(int j = 0; j <n; j++){
        if(included[j]==0 && edge[j][2] <min){
          u = edge[j][0];
          v = edge[j][1];
          min = edge[j][2];
          k = j;

        }
      }
      if(find(u)!=find(v)){
        t[0][i] = u;
        t[1][i] = v;

        join(find(u),find(v));
        included[k] = 1;
        i++;
      }
      else{

        included[k] =1;
      }
    }

    System.out.println("Spanning Tree");

    for(int l = 0; l <6; l++){
        System.out.println(t[0][l]+" "+t[1][l]);
    }
  }
}
