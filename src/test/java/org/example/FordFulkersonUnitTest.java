package org.example;

import org.junit.Assert;
import org.junit.Test;

public class FordFulkersonUnitTest {
    @Test
    public void testFordFulkerson() {
        FordFulkerson ff = new FordFulkerson();
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
    public void testZeroCapacityEdges() {
        FordFulkerson ff = new FordFulkerson();
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
    public void testDisconnectedGraph() {
        FordFulkerson ff = new FordFulkerson();
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
    public void testMaximumCapacity() {
        FordFulkerson ff = new FordFulkerson();
        int[][] graph = {
                {0, Integer.MAX_VALUE, Integer.MAX_VALUE, 0, 0, 0},
                {0, 0, Integer.MAX_VALUE, Integer.MAX_VALUE, 0, 0},
                {0, 0, 0, 0, Integer.MAX_VALUE, 0},
                {0, 0, 0, 0, 0, Integer.MAX_VALUE},
                {0, 0, 0, 0, 0, Integer.MAX_VALUE},
                {0, 0, 0, 0, 0, 0}
        };
        int result = ff.fordFulkerson(graph, 0, 5);
        Assert.assertEquals(Integer.MAX_VALUE, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeCapacities() {
        FordFulkerson ff = new FordFulkerson();
        int[][] graph = {
                {0, -1, 0, 0, 0, 0},
                {0, 0, -1, 0, 0, 0},
                {0, 0, 0, -1, 0, 0},
                {0, 0, 0, 0, -1, 0},
                {0, 0, 0, 0, 0, -1},
                {0, 0, 0, 0