package Graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;

public class ShortestPathUnWeighted {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int v = 4;

        for(int i = 0; i < v; i++) {
            adj.add(new ArrayList<Integer>());
        }

        addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 1, 2);
        // addEdge(adj, 2, 4);
        addEdge(adj, 2, 3);

        int s = 0;
        findPath(adj, v, s);
    }

    static void findPath(ArrayList<ArrayList<Integer>> adj, int v, int  s) {
        Queue<Integer> q = new ArrayDeque<>();
        boolean[] visited = new boolean[v];
        int[] dist = new int[v];
        Arrays.fill(dist, Integer.MAX_VALUE);

        q.add(s);
        visited[s] = true;
        dist[s] = 0;
        while(!q.isEmpty()) {
            int u = q.remove();

            System.out.println(u);

            for(Integer vert : adj.get(u)) {
                if(visited[vert] == false) {
                    dist[vert] = dist[u] + 1;
                    q.add(vert);
                    visited[vert] = true;
                }
            }
        }

        System.out.println(Arrays.toString(dist));
    }   

    static void addEdge(ArrayList<ArrayList<Integer>> adj, int v, int u) {
        adj.get(v).add(u);
        adj.get(u).add(v);
    }
}
