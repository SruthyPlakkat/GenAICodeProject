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
    public void testEmptyGraph() {
        int[][] graph = new int[0][0];
        FordFulkerson ff = new FordFulkerson();
        int maxFlow = ff.fordFulkerson(graph, 0, 0);
        assertEquals(0, maxFlow);
    }

    @Test
    public void testSingleVertexGraph() {
        int[][] graph = new int[1][1];
        FordFulkerson ff = new FordFulkerson();
        int maxFlow = ff.fordFulkerson(graph, 0, 0);
        assertEquals(0, maxFlow);
    }

    @Test
    public void testMaxIntegerCapacities() {
        int maxInt = Integer.MAX_VALUE;
        int[][] graph = {
            {0, maxInt},
            {0, 0}
        };
        FordFulkerson ff = new FordFulkerson();
        int maxFlow = ff.fordFulkerson(graph, 0, 1);
        assertEquals(maxInt, maxFlow);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNullGraphInput() {
        FordFulkerson ff = new FordFulkerson();
        ff.fordFulkerson(null, 0, 1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testInvalidSourceSinkIndices() {
        int[][] graph = {
            {0, 1},
            {0, 0}
        };
        FordFulkerson ff = new FordFulkerson();
        ff.fordFulkerson(graph, 0, 2);
    }

    @Test
    public void testLargeGraph() {
        int size = 1000;
        int[][] graph = new int[size][size];
        for (int i = 0; i < size - 1; i++) {
            graph[i][i + 1] = 1;
        }
        FordFulkerson ff = new FordFulkerson();
        int maxFlow = ff.fordFulkerson(graph, 0, size - 1);
        assertEquals(1, maxFlow);
    }
}