package Graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class Bfs {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int v = 5;

        for(int i = 0; i < v; i++) {
            adj.add(new ArrayList<Integer>());
        }

        addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 1, 2);
        addEdge(adj, 2, 4);
        addEdge(adj, 2, 3);

        int s = 0;
        bfs(adj, v, s);

    }

    static void bfs(ArrayList<ArrayList<Integer>> adj, int v, int s) {
        boolean visited[] = new boolean[v + 1];
        Queue<Integer> q = new ArrayDeque<>();

        visited[s] = true;
        q.add(s);

        while(!q.isEmpty()) {
            int u = q.poll();

            System.out.print(u + " ");

            for(int vert : adj.get(u)) {
                if(!visited[vert]) {
                    visited[vert] = true;
                    q.add(vert);
                }
            }
        }
    }

    static void addEdge(ArrayList<ArrayList<Integer>> adj, int v, int u) {
        adj.get(v).add(u);
        adj.get(u).add(v);
    }
}
