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
        int[][] graph = {};
        int source = 0;
        int sink = 0;
        Assert.assertEquals(0, ff.fordFulkerson(graph, source, sink));
    }

    @Test
    public void test_single_vertex_graph() {
        int[][] graph = {{0}};
        int source = 0;
        int sink = 0;
        Assert.assertEquals(0, ff.fordFulkerson(graph, source, sink));
    }

    @Test
    public void test_max_integer_capacities() {
        int maxInt = Integer.MAX_VALUE;
        int[][] graph = {{0, maxInt}, {0, 0}};
        int source = 0;
        int sink = 1;
        Assert.assertEquals(maxInt, ff.fordFulkerson(graph, source, sink));
    }

    @Test
    public void test_null_graph_input() {
        int[][] graph = null;
        int source = 0;
        int sink = 0;
        try {
            ff.fordFulkerson(graph, source, sink);
            Assert.fail("Expected an exception for null graph input");
        } catch (NullPointerException e) {
            // Expected exception
        }
    }

    @Test
    public void test_invalid_source_sink_indices() {
        int[][] graph = {{0, 1}, {0, 0}};
        int source = 2; // Invalid index
        int sink = 1;
        try {
            ff.fordFulkerson(graph, source, sink);
            Assert.fail("Expected an exception for invalid source index");
        } catch (ArrayIndexOutOfBoundsException e) {
            // Expected exception
        }
        source = 0;
        sink = 2; // Invalid index
        try {
            ff.fordFulkerson(graph, source, sink);
            Assert.fail("Expected an exception for invalid sink index");
        } catch (ArrayIndexOutOfBoundsException e) {
            // Expected exception
        }
    }

    @Test
    public void test_large_graph() {
        int size = 1000;
        int[][] graph = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                graph[i][j] = (int) (Math.random() * 100);
            }
        }
        int source = 0;
        int sink = size - 1;
        int maxFlow = ff.fordFulkerson(graph, source, sink);
        Assert.assertTrue(maxFlow >= 0);
    }
}