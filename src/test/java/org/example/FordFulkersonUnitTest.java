package org.example;

import org.junit.Assert;
import org.junit.Test;

public class FordFulkersonUnitTest {
    FordFulkerson ff = new FordFulkerson();
    @Test
    public void testFordFulkerson() {
        
        int[][] graph = {
                {0, 16, 13, 0, 0, 0},
                {0, 0, 10, 12, 0, 0},
                {0, 4, 0, 0, 14, 0},
                {0, 0, 9, 0, 0, 20},
                {0, 0, 0, 7, 0, 4},
                {0, 0, 0, 0, 0, 0}
        };
        int result = ff.fordFulkerson(graph, 0, 5);
        Assert.assertEquals(23, result);
    }

    @Test
    public void test_empty_graph() {
        // An empty graph with no vertices or edges
        int[][] graph = {};
        int source = 0;
        int sink = 0;
        // Expect the maximum flow to be 0 as there are no paths
        Assert.assertEquals(0, ff.fordFulkerson(graph, source, sink));
    }

    @Test
    public void test_single_vertex_graph() {
        // A graph with a single vertex and no edges
        int[][] graph = {{}};
        int source = 0;
        int sink = 0;
        // Expect the maximum flow to be 0 as there are no edges
        Assert.assertEquals(0, ff.fordFulkerson(graph, source, sink));
    }

    @Test
    public void test_max_integer_capacities() {
        int max_int = Integer.MAX_VALUE;
        // A simple graph with maximum integer capacities
        int[][] graph = {
            {0, max_int},
            {0, 0}
        };
        int source = 0;
        int sink = 1;
        // Expect the maximum flow to be max_int
        Assert.assertEquals(max_int, ff.fordFulkerson(graph, source, sink));
    }

    @Test
    public void test_null_graph_input() {
        try {
            int[][] graph = null;
            int source = 0;
            int sink = 0;
            ff.fordFulkerson(graph, source, sink);
            Assert.fail("Expected exception for null graph input");
        } catch (IllegalArgumentException e) {
            // Expected outcome
        }
    }

    @Test
    public void test_invalid_source_sink_indices() {
        int[][] graph = {
            {0, 1},
            {0, 0}
        };
        int invalid_source = -1;
        int invalid_sink = 2;
        try {
            ff.fordFulkerson(graph, invalid_source, invalid_sink);
            Assert.fail("Expected exception for invalid source/sink indices");
        } catch (IndexOutOfBoundsException e) {
            // Expected outcome
        }
    }

    @Test
    public void test_large_graph() {
        // Create a large graph with 1000 nodes and random capacities
        int size = 1000;
        int[][] graph = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                graph[i][j] = (int) (Math.random() * 100);
            }
        }
        int source = 0;
        int sink = size - 1;
        // This test checks if the function can handle large inputs without crashing
        int max_flow = ff.fordFulkerson(graph, source, sink);
        Assert.assertTrue(max_flow >= 0);
    }
}