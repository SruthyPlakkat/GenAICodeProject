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
    public void testDisconnectedGraph() {
        int[][] graph = {
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0}
        };
        int result = ff.fordFulkerson(graph, 0, 5);
        Assert.assertEquals(0, result); // Expect 0 as there is no path from source to sink
    }

    @Test
    public void testMinimumVertices() {
        int[][] graph = {
            {0, 10},
            {0, 0}
        };
        int result = ff.fordFulkerson(graph, 0, 1);
        Assert.assertEquals(10, result); // Expect 10 as there is a direct path from source to sink
    }

    @Test
    public void testZeroCapacityEdges() {
        int[][] graph = {
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0}
        };
        int result = ff.fordFulkerson(graph, 0, 5);
        Assert.assertEquals(0, result); // Expect 0 as all capacities are zero
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidGraph() {
        int[][] graph = null;
        ff.fordFulkerson(graph, 0, 5); // Expect an exception due to null graph
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeCapacities() {
        int[][] graph = {
            {0, -1, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0}
        };
        ff.fordFulkerson(graph, 0, 5); // Expect an exception due to negative capacity
    }

    @Test
    public void testLargeGraph() {
        int vertices = 1000;
        int[][] graph = new int[vertices][vertices];
        for (int i = 0; i < vertices - 1; i++) {
            graph[i][i + 1] = 1; // Create a chain of vertices with capacity 1
        }
        int result = ff.fordFulkerson(graph, 0, vertices - 1);
        Assert.assertEquals(999, result); // Expect 999 as the maximum flow
    }
}