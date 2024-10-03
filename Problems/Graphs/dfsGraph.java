package Problems.Graphs;

import java.util.*;

public class dfsGraph {

    public static void dfs(int v,ArrayList<ArrayList<Integer>> adj,
    boolean[] vis,ArrayList<Integer> res){
        
        vis[v] = true;
        res.add(v);
        
        for(Integer it : adj.get(v)){
            if(vis[it]==false){
                dfs(it,adj,vis,res);
            }
        }

        
    }
    public static ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] vis = new boolean[V];
        ArrayList<Integer> res = new ArrayList<>();
        dfs(0,adj,vis,res);
        return res;
    }
    public static void main(String[] args) {
        ArrayList < ArrayList < Integer >> adj = new ArrayList < > ();
        for (int i = 0; i < 5; i++) {
            adj.add(new ArrayList < > ());
        }
        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(0).add(4);
        adj.get(4).add(0);
        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(1).add(3);
        adj.get(3).add(1);

        
        ArrayList < Integer > ans = dfsOfGraph(adj.size(),adj); 
        int n = ans.size();
        for(int i = 0;i<n;i++) {
            System.out.print(ans.get(i)+" "); 
        }
        System.out.println();
    }
}
