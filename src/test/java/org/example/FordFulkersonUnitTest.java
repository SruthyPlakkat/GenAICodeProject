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
    public void testMaxIntegerCapacity() {
        int[][] graph = {
                {0, Integer.MAX_VALUE},
                {0, 0}
        };
        int result = ff.fordFulkerson(graph, 0, 1);
        Assert.assertEquals(Integer.MAX_VALUE, result);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testNullGraphInput() {
        int[][] graph = null;
        ff.fordFulkerson(graph, 0, 1);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testInvalidSourceSink() {
        int[][] graph = {
                {0, 16, 13},
                {0, 0, 10},
                {0, 4, 0}
        };
        ff.fordFulkerson(graph, -1, 3);
    }

    @Test
    public void testLargeGraph() {
        int[][] graph = new int[1000][1000];
        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < 1000; j++) {
                graph[i][j] = 1;
            }
        }
        int result = ff.fordFulkerson(graph, 0, 999);
        Assert.assertTrue(result > 0);
    }
}