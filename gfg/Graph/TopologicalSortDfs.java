package Graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class TopologicalSortDfs {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int v = 5;

        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<Integer>());

        }

        addEdgeDirected(adj, 0, 1);
        addEdgeDirected(adj, 1, 3);
        addEdgeDirected(adj, 2, 3);
        addEdgeDirected(adj, 2, 4);
        addEdgeDirected(adj, 3, 4);

        dfs(adj, v);
    }

    static void addEdgeDirected(ArrayList<ArrayList<Integer>> adj, int v, int u) {
        adj.get(v).add(u);
    }

    static void topologicalSort(ArrayList<ArrayList<Integer>> adj, int s, boolean[] visited, Deque<Integer> stack) {
        visited[s] = true;

        for(int vert : adj.get(s)) {
            if(visited[vert] == false) {
                topologicalSort(adj, vert, visited, stack);
            }
        }
        stack.push(s);
    }

    static void dfs(ArrayList<ArrayList<Integer>> adj, int v) {
        boolean[] visited = new boolean[v];
        Deque<Integer> stack = new ArrayDeque<>();
        for(int i = 0; i < v; i++) {
            if(visited[i] == false) {
                topologicalSort(adj, i, visited, stack);
            }
        }
        while(!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }

}
