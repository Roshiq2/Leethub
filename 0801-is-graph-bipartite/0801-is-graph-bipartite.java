class Pair{
    int x;
    int color;
    Pair(int x,int color){
        this.x = x;
        this.color = color;
    }
}

class Solution {
    int m,n;
    int[] visited;
    int[] color;
    boolean isBipartite = true;

    void dfs(int[][] graph, Pair p) {  
        
        visited[p.x]=1; 
        int[] neighbours = graph[p.x];
        for(int i=0;i<neighbours.length;i++){
            if(p.color == 2 && visited[neighbours[i]] == 0){
                color[neighbours[i]] =1;
                dfs(graph,new Pair(neighbours[i],1));
            }
            else if(p.color == 1 && visited[neighbours[i]] == 0){
                color[neighbours[i]] =2;
                dfs(graph,new Pair(neighbours[i],2));
            }else if(visited[neighbours[i]] == 1 && p.color == color[neighbours[i]]){
                isBipartite = false;
                return;
            }            
        }
        
        return;
    }

    public boolean isBipartite(int[][] graph) {
        m = graph.length;
        n = graph[0].length;
        visited = new int[m];
        color = new int[m];

        //this for is to handle not connected graph case
        for(int k=0;k<m;k++) {
            if(visited[k]==0){
            color[k] = 2;
            dfs(graph,new Pair(k,2));
            }            
        }

        return isBipartite;

    }
}