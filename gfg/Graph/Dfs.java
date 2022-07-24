package Graph;

import java.util.ArrayList;

public class Dfs {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int v = 9;

        for(int i = 0; i < v; i++) {
            adj.add(new ArrayList<Integer>());
        }

        addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 1, 4);
        addEdge(adj, 2, 3);
        addEdge(adj, 4, 5);
        addEdge(adj, 7, 6);
        addEdge(adj, 6, 8);
        dfsPrint(adj, v);
        
    }

    static void dfsPrint(ArrayList<ArrayList<Integer>> adj, int v) {
        boolean[] visited = new boolean[v];
        for(int i = 0; i < v; i++) {
            if(visited[i] == false) {
                dfs(adj, i, visited);
            }
        }
    }
    static void dfs(ArrayList<ArrayList<Integer>> adj, int s, boolean[] visited) {
        visited[s] = true;
        System.out.print(s + " ");

        for(int v : adj.get(s)) {
            if(visited[v] == false) {
                dfs(adj, v, visited);
            }
        }
    }


    static void addEdge(ArrayList<ArrayList<Integer>> graph, int v, int u) {
        graph.get(v).add(u);
        graph.get(u).add(v);
    }
}
