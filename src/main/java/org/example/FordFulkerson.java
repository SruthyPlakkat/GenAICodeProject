package org.example;

public class FordFulkerson {

    static final int VERTICES = 6;  // Number of vertices in the graph

    /* Returns true if there's a path from source 's' to sink 't' in residual graph.
       Also, fills 'parent[]' to store the path */
    private boolean bfs(int[][] residualGraph, int s, int t, int[] parent) {
        boolean[] visited = new boolean[VERTICES];
        java.util.Queue<Integer> queue = new java.util.LinkedList<>();
        queue.add(s);
        visited[s] = true;
        parent[s] = -1;

        while (!queue.isEmpty()) {
            int u = queue.poll();
            for (int v = 0; v < VERTICES; v++) {
                if (!visited[v] && residualGraph[u][v] > 0) {
                    if (v == t) {
                        parent[v] = u;
                        return true;
                    }
                    queue.add(v);
                    visited[v] = true;
                    parent[v] = u;
                }
            }
        }
        return false;
    }

    // Returns tne maximum flow from s to t in the given graph
    public int fordFulkerson(int[][] graph, int s, int t) {
        int u, v;
        int[][] residualGraph = new int[VERTICES][VERTICES];
        for (u = 0; u < VERTICES; u++)
            for (v = 0; v < VERTICES; v++)
                residualGraph[u][v] = graph[u][v];

        int[] parent = new int[VERTICES];
        int maxFlow = 0;

        // Augment the flow while there is a path from source to sink
        while (bfs(residualGraph, s, t, parent)) {
            int pathFlow = Integer.MAX_VALUE;
            for (v = t; v != s; v = parent[v]) {
                u = parent[v];
                pathFlow = Math.min(pathFlow, residualGraph[u][v]);
            }

            // update residual capacities of the edges and reverse edges along the path
            for (v = t; v != s; v = parent[v]) {
                u = parent[v];
                residualGraph[u][v] -= pathFlow;
                residualGraph[v][u] += pathFlow;
            }

            maxFlow += pathFlow;
        }

        return maxFlow;
    }
}
