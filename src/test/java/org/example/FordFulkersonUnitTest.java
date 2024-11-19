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

    // Additional test cases for edge cases
    @Test
    public void testNoPath() {
        int[][] graph = {
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0}
        };
        int result = ff.fordFulkerson(graph, 0, 5);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testSinglePath() {
        int[][] graph = {
                {0, 10, 0, 0, 0, 0},
                {0, 0, 5, 15, 0, 0},
                {0, 0, 0, 0, 10, 0},
                {0, 0, 0, 0, 0, 10},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0}
        };
        int result = ff.fordFulkerson(graph, 0, 5);
        Assert.assertEquals(10, result);
    }

    @Test
    public void testMultiplePaths() {
        int[][] graph = {
                {0, 10, 10, 0, 0, 0},
                {0, 0, 0, 10, 10, 0},
                {0, 0, 0, 0, 10, 10},
                {0, 0, 0, 0, 0, 10},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0}
        };
        int result = ff.fordFulkerson(graph, 0, 5);
        Assert.assertEquals(20, result);
    }

    @Test
    public void testGraphWithNoEdges() {
        int[][] graph = {
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0}
        };
        int result = ff.fordFulkerson(graph, 0, 5);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testSingleNodeGraph() {
        // Graph with a single node, source and sink are the same
        int[][] graph = {{0}};
        int result = ff.fordFulkerson(graph, 0, 0);
        // Expected max flow is 0 as there are no edges
        Assert.assertEquals(0, result);
    }

    @Test
    public void testSourceEqualsSink() {
        // Graph where source and sink are the same node
        int[][] graph = {
            {0, 10, 0},
            {0, 0, 5},
            {0, 0, 0}
        };
        int result = ff.fordFulkerson(graph, 1, 1);
        // Expected max flow is 0 as source equals sink
        Assert.assertEquals(0, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeCapacities() {
        // Graph with negative capacities
        int[][] graph = {
            {0, -10, 0},
            {0, 0, -5},
            {0, 0, 0}
        };
        ff.fordFulkerson(graph, 0, 2);
        // Should throw an exception due to invalid negative capacities
    }

    @Test(expected = NullPointerException.class)
    public void testNullGraph() {
        // Null graph input
        int[][] graph = null;
        ff.fordFulkerson(graph, 0, 1);
        // Should throw a NullPointerException
    }

    @Test
    public void testLargeGraph() {
        // Large graph to test performance and overflow
        int size = 1000;
        int[][] graph = new int[size][size];
        for (int i = 0; i < size - 1; i++) {
            graph[i][i + 1] = 1; // Simple chain with capacity 1
        }
        int result = ff.fordFulkerson(graph, 0, size - 1);
        // Expected max flow is 1 as there is only one path with capacity 1
        Assert.assertEquals(1, result);
    }

    @Test
    public void testDirectConnection() {
        // Graph where source and sink are directly connected
        int[][] graph = {
            {0, 15},
            {0, 0}
        };
        int result = ff.fordFulkerson(graph, 0, 1);
        // Expected max flow is 15 as there is a direct connection
        Assert.assertEquals(15, result);
    }
}