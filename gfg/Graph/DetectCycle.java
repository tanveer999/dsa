package Graph;

import java.util.ArrayList;

public class DetectCycle {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        ArrayList<ArrayList<Integer>> adjDirected = new ArrayList<>();
        int v = 6;

        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<Integer>());
            adjDirected.add(new ArrayList<Integer>());

        }

        addEdge(adj, 0, 1);
        addEdge(adj, 1, 2);
        addEdge(adj, 0, 2);
        // addEdge(adj, 1, 2);
        // addEdge(adj, 2, 4);
        // addEdge(adj, 5, 4);
        // addEdge(adj, 2, 3);

        int s = 0;
        // System.out.println(dfs(adj, v));

        addEdgeDirected(adjDirected, 0, 1);
        addEdgeDirected(adjDirected, 2, 1);
        addEdgeDirected(adjDirected, 2, 3);
        addEdgeDirected(adjDirected, 3, 4);
        addEdgeDirected(adjDirected, 4, 5);
        addEdgeDirected(adjDirected, 5, 3);
        System.out.println(dfsDirected(adjDirected, v));
    }

    static void addEdgeDirected(ArrayList<ArrayList<Integer>> adj, int v, int u) {
        adj.get(v).add(u);
    }

    static void addEdge(ArrayList<ArrayList<Integer>> adj, int v, int u) {
        adj.get(v).add(u);
        adj.get(u).add(v);
    }

    static boolean findCycleDirected(ArrayList<ArrayList<Integer>> adj, int s, int parent, boolean[] visited, int v) {
        visited[s] = true;

        for (int u : adj.get(s)) {
            if (visited[u] == false)
                if(findCycleDirected(adj, u, s, visited, v) == true) {
                    return true;
                }
            else if (u != parent) {
                return true;
            }
        }
        return false;
    }

    static boolean dfsDirected(ArrayList<ArrayList<Integer>> adj, int v) {
        boolean[] visited = new boolean[v];

        for (int i = 0; i < v; i++) {
            if (visited[i] == false) {
                if(findCycleDirected(adj, i, -1, visited, v)) {
                    return true;
                }
            }
        }
        return false;
    }

    static boolean findCycle(ArrayList<ArrayList<Integer>> adj, int s, boolean[] visited, int parent) {
        visited[s] = true;

        for (int vert : adj.get(s)) {
            if (visited[vert] == false) {
                if (findCycle(adj, vert, visited, s) == true)
                    return true;
            } else if (vert != parent) {
                return true;
            }
        }
        return false;
    }

    static boolean dfs(ArrayList<ArrayList<Integer>> adj, int v) {
        boolean[] visited = new boolean[v];

        for (int i = 0; i < v; i++) {
            if (visited[i] == false) {
                if (findCycle(adj, i, visited, -1) == true) {
                    return true;
                }
            }
        }
        return false;
    }
}
