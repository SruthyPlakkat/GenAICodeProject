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

    // Additional test cases to enhance coverage
    @Test
    public void testFordFulkersonNoPath() {
        int[][] graph = {
                {0, 1, 0, 0, 0, 0},
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
    public void testFordFulkersonSinglePath() {
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
    public void testFordFulkersonMultiplePaths() {
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
    public void testFordFulkersonGraphWithNoEdges() {
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
    public void testFordFulkersonNegativeWeights() {
        // Graph with negative weights, should handle gracefully
        int[][] graph = {
                {0, -10, 0, 0, 0, 0},
                {0, 0, -5, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0}
        };
        try {
            int result = ff.fordFulkerson(graph, 0, 5);
            Assert.fail("Expected IllegalArgumentException for negative weights");
        } catch (IllegalArgumentException e) {
            // Expected exception
        }
    }

    @Test
    public void testFordFulkersonSelfLoops() {
        // Graph with self-loops, should ignore self-loops
        int[][] graph = {
                {10, 10, 0, 0, 0, 0},
                {0, 10, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0}
        };
        int result = ff.fordFulkerson(graph, 0, 5);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testFordFulkersonSingleNode() {
        // Graph with a single node
        int[][] graph = {
                {0}
        };
        int result = ff.fordFulkerson(graph, 0, 0);
        Assert.assertEquals(0, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFordFulkersonInvalidInput() {
        // Null graph input
        int[][] graph = null;
        ff.fordFulkerson(graph, 0, 5);
    }

    @Test
    public void testFordFulkersonLargeGraph() {
        // Large graph stress test
        int size = 1000;
        int[][] graph = new int[size][size];
        for (int i = 0; i < size - 1; i++) {
            graph[i][i + 1] = 1;
        }
        int result = ff.fordFulkerson(graph, 0, size - 1);
        Assert.assertEquals(1, result);
    }
}