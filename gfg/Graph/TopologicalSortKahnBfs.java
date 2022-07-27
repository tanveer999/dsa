package Graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;

// works only for DAG(directed acyclic graph)
public class TopologicalSortKahnBfs {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int v = 6;

        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<Integer>());

        }

        addEdgeDirected(adj, 0, 1);
        addEdgeDirected(adj, 0, 4);
        addEdgeDirected(adj, 1, 2);
        addEdgeDirected(adj, 4, 2);
        addEdgeDirected(adj, 4, 5);
        addEdgeDirected(adj, 2, 3);
        addEdgeDirected(adj, 5, 3);

        topologicalSort(adj, v);
    }

    static void addEdgeDirected(ArrayList<ArrayList<Integer>> adj, int v, int u) {
        adj.get(v).add(u);
    }

    static void topologicalSort(ArrayList<ArrayList<Integer>> adj, int v) {
        int[] inDegree = new int[v];

        for(ArrayList<Integer> u: adj) {
            for(int vert : u) {
                inDegree[vert] += 1;
            }
        }

        Queue<Integer> q = new ArrayDeque<>();
        for(int i = 0 ; i < v; i++) {
            if(inDegree[i] == 0) {
                q.add(i);
            }
        }

        while(!q.isEmpty()) {
            int u = q.remove();
            System.out.print(u + " ");

            for(int vert : adj.get(u)) {
                inDegree[vert] -= 1;
                if(inDegree[vert] == 0) {
                    q.add(vert);
                }
            }
        }

    }

}
