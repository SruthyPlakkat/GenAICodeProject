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
    public void testGraphWithCycles() {
        int[][] graph = {
                {0, 10, 5, 15, 0, 0},
                {0, 0, 4, 0, 10, 0},
                {0, 0, 0, 10, 0, 10},
                {0, 0, 0, 0, 10, 10},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0}
        };
        int result = ff.fordFulkerson(graph, 0, 5);
        Assert.assertEquals(20, result);
    }

    @Test
    public void testEmptyGraph() {
        int[][] graph = {};
        int result = ff.fordFulkerson(graph, 0, 0);
        Assert.assertEquals(0, result); // Expect 0 as there are no nodes.
    }

    @Test
    public void testSingleNodeGraph() {
        int[][] graph = {{0}};
        int result = ff.fordFulkerson(graph, 0, 0);
        Assert.assertEquals(0, result); // Expect 0 as source and sink are the same.
    }

    @Test
    public void testMaxCapacity() {
        int[][] graph = {
            {0, Integer.MAX_VALUE, 0},
            {0, 0, Integer.MAX_VALUE},
            {0, 0, 0}
        };
        int result = ff.fordFulkerson(graph, 0, 2);
        Assert.assertEquals(Integer.MAX_VALUE, result); // Expect max flow to be Integer.MAX_VALUE.
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeCapacities() {
        int[][] graph = {
            {0, -10, 0},
            {0, 0, 10},
            {0, 0, 0}
        };
        ff.fordFulkerson(graph, 0, 2); // Expect exception due to negative capacity.
    }

    @Test
    public void testLargeGraph() {
        int size = 1000;
        int[][] graph = new int[size][size];
        for (int i = 0; i < size - 1; i++) {
            graph[i][i + 1] = 1; // Simple path with capacity 1
        }
        int result = ff.fordFulkerson(graph, 0, size - 1);
        Assert.assertEquals(1, result); // Expect max flow to be 1.
    }
}