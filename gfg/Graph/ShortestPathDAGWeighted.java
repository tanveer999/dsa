package Graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;

class AdjVert {
    int v;
    int w;

    AdjVert(int v, int w) {
        this.v = v;
        this.w = w;
    }

    @Override
    public String toString() {
        return "(" + v + ", " + w + ")";
    }
}

public class ShortestPathDAGWeighted {
    public static void main(String[] args) {
        ArrayList<ArrayList<AdjVert>> adj = new ArrayList<>();
        final int V = 6;
        int s = 0;
        for(int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        addEdge(adj, 0, 1, 2);
        addEdge(adj, 0, 4, 1);
        addEdge(adj, 1, 2, 3);
        addEdge(adj, 2, 3, 6);
        addEdge(adj, 4, 2, 2);
        addEdge(adj, 4, 5, 4);
        addEdge(adj, 5, 3, 1);
        shortestPath(adj, V, s);
    }

    static void addEdge(ArrayList<ArrayList<AdjVert>> adj, int u, int v, int w) {
        adj.get(u).add(new AdjVert(v, w));
    }

    static void shortestPath(ArrayList<ArrayList<AdjVert>> adj, int V, int s) {
        List<Integer> sortedVert = topologicalSort(adj, V, s);

        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);

        dist[s] = 0;

        for(int u : sortedVert) {
            for(AdjVert vert : adj.get(u)) {
                if(dist[vert.v] > dist[u] + vert.w) {
                    dist[vert.v] = dist[u] + vert.w;
                }
            }
        }
        System.out.println(Arrays.toString(dist));
    }

    static List<Integer> topologicalSort(ArrayList<ArrayList<AdjVert>> adj, int V, int s) {
        Queue<Integer> q = new ArrayDeque<>();
        int[] inDegree = new int[V];
        List<Integer> sortedVert = new ArrayList<>(); 
        for(int i = 0; i < V; i++) {
            for(AdjVert vert : adj.get(i)) {
                inDegree[vert.v] += 1;
            }
        }

        inDegree[s] = 0;
        q.add(s);

        while(!q.isEmpty()) {
            int u = q.remove();
            sortedVert.add(u);
            for(AdjVert vert : adj.get(u)) {
                inDegree[vert.v] -= 1;
                if(inDegree[vert.v] == 0) {
                    q.add(vert.v);
                }
            }
        }
        return sortedVert;
    }
}
