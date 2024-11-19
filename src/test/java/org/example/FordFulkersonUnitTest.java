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

    // Additional test cases for enhanced coverage
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
                {0, 10, 10, 0, 0, 0},
                {0, 0, 0, 10, 0, 0},
                {0, 0, 0, 0, 10, 10},
                {0, 0, 0, 0, 0, 10},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0}
        };
        int result = ff.fordFulkerson(graph, 0, 5);
        Assert.assertEquals(20, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeFlow() {
        int[][] graph = {
                {0, -10, 10, 0, 0, 0},
                {0, 0, 0, 10, 0, 0},
                {0, 0, 0, 0, 10, 10},
                {0, 0, 0, 0, 0, 10},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0}
        };
        ff.fordFulkerson(graph, 0, 5);
    }

    // New tests for enhanced coverage
    @Test
    public void testEmptyGraph() {
        int[][] graph = {};
        int result = ff.fordFulkerson(graph, 0, 0);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testSingleVertexGraph() {
        int[][] graph = {{0}};
        int result = ff.fordFulkerson(graph, 0, 0);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testMaxCapacity() {
        int[][] graph = {
                {0, Integer.MAX_VALUE, 0, 0, 0, 0},
                {0, 0, Integer.MAX_VALUE, 0, 0, 0},
                {0, 0, 0, Integer.MAX_VALUE, 0, 0},
                {0, 0, 0, 0, Integer.MAX_VALUE, 0},
                {0, 0, 0, 0, 0, Integer.MAX_VALUE},
                {0, 0, 0, 0, 0, 0}
        };
        int result = ff.fordFulkerson(graph, 0, 5);
        Assert.assertEquals(Integer.MAX_VALUE, result);
    }

    @Test(expected = NullPointerException.class)
    public void testNullGraph() {
        ff.fordFulkerson(null, 0, 5);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testInvalidSourceSinkIndices() {
        int[][] graph = {
                {0, 10, 0, 0, 0, 0},
                {0, 0, 10, 0, 0, 0},
                {0, 0, 0, 10, 0, 0},
                {0, 0, 0, 0, 10, 0},
                {0, 0, 0, 0, 0, 10},
                {0, 0, 0, 0, 0, 0}
        };
        ff.fordFulkerson(graph, -1, 6);
    }

    @Test
    public void testLargeGraph() {
        int[][] graph = new int[1000][1000];
        for (int i = 0; i < 999; i++) {
            graph[i][i + 1] = 1; // Create a path from 0 to 999
        }
        int result = ff.fordFulkerson(graph, 0, 999);
        Assert.assertEquals(999, result);
    }
}