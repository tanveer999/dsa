package Graph;

import java.util.ArrayList;

public class AdjacencyListRepresentation {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        int v = 4;
        for(int i = 0; i < v; i++) {
            graph.add(new ArrayList<Integer>());
        }
        addEdge(graph, 0, 1);
        addEdge(graph, 1, 3);
        addEdge(graph, 2, 0);
        addEdge(graph, 2, 1);

        printGraph(graph);
    }

    static void addEdge(ArrayList<ArrayList<Integer>> graph, int v, int u) {
        graph.get(v).add(u);
        graph.get(u).add(v);
    }

    static void printGraph(ArrayList<ArrayList<Integer>> graph) {
        for(int i = 0; i < graph.size(); i++) {
            for(int j = 0; j < graph.get(i).size(); j++) {
                System.out.print(graph.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
