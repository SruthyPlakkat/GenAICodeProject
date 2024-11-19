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
        Assert.assertEquals(15, result);
    }

    @Test
    public void testMultiplePaths() {
        int[][] graph = {
                {0, 10, 10, 0, 0, 0},
                {0, 0, 0, 10, 0, 0},
                {0, 0, 0, 10, 10, 0},
                {0, 0, 0, 0, 0, 10},
                {0, 0, 0, 0, 0, 10},
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
    public void testNegativeCapacities() {
        // Graph with negative capacities
        int[][] graph = {
                {0, -10, 0, 0, 0, 0},
                {0, 0, -5, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0}
        };
        // Expectation: The algorithm should handle this gracefully, possibly by ignoring negative edges
        int result = ff.fordFulkerson(graph, 0, 5);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testSelfLoops() {
        // Graph with self-loops
        int[][] graph = {
                {10, 10, 0, 0, 0, 0},
                {0, 10, 5, 0, 0, 0},
                {0, 0, 10, 0, 0, 0},
                {0, 0, 0, 10, 0, 0},
                {0, 0, 0, 0, 10, 0},
                {0, 0, 0, 0, 0, 10}
        };
        // Expectation: Self-loops should not affect the maximum flow calculation
        int result = ff.fordFulkerson(graph, 0, 5);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testLargeGraph() {
        // Large graph with multiple paths
        int[][] graph = new int[100][100];
        // Initialize graph with some capacities
        for (int i = 0; i < 99; i++) {
            graph[i][i + 1] = 10;
        }
        // Expectation: The algorithm should handle large graphs efficiently
        int result = ff.fordFulkerson(graph, 0, 99);
        Assert.assertEquals(10, result);
    }

    @Test
    public void testSingleNodeGraph() {
        // Graph with a single node
        int[][] graph = {
                {0}
        };
        // Expectation: No flow possible in a single node graph
        int result = ff.fordFulkerson(graph, 0, 0);
        Assert.assertEquals(0, result);
    }
}