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
    public void testEmptyGraph() {
        // Test with an empty graph
        FordFulkerson ff = new FordFulkerson();
        int[][] graph = {};
        int result = ff.fordFulkerson(graph, 0, 0);
        Assert.assertEquals(0, result); // Expect 0 flow for an empty graph
    }

    @Test
    public void testSingleEdgeGraph() {
        // Test with a graph having a single edge
        FordFulkerson ff = new FordFulkerson();
        int[][] graph = {
            {0, 10},
            {0, 0}
        };
        int result = ff.fordFulkerson(graph, 0, 1);
        Assert.assertEquals(10, result); // Expect flow equal to the single edge capacity
    }

    @Test
    public void testSourceEqualsSink() {
        // Test where source and sink are the same
        FordFulkerson ff = new FordFulkerson();
        int[][] graph = {
            {0, 10},
            {0, 0}
        };
        int result = ff.fordFulkerson(graph, 0, 0);
        Assert.assertEquals(0, result); // Expect 0 flow when source equals sink
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeCapacity() {
        // Test with negative capacities
        FordFulkerson ff = new FordFulkerson();
        int[][] graph = {
            {0, -10},
            {0, 0}
        };
        ff.fordFulkerson(graph, 0, 1); // Expect exception for negative capacity
    }

    @Test
    public void testLargeGraph() {
        // Stress test with a large graph
        FordFulkerson ff = new FordFulkerson();
        int size = 1000;
        int[][] graph = new int[size][size];
        for (int i = 0; i < size - 1; i++) {
            graph[i][i + 1] = 1;
        }
        int result = ff.fordFulkerson(graph, 0, size - 1);
        Assert.assertEquals(1, result); // Expect flow of 1 through a linear chain
    }

    @Test
    public void testEmptyGraph() {
        // Test with an empty graph
        FordFulkerson ff = new FordFulkerson();
        int[][] graph = {};
        int result = ff.fordFulkerson(graph, 0, 0);
        Assert.assertEquals(0, result); // Expect 0 flow for an empty graph
    }

    @Test
    public void testSingleEdgeGraph() {
        // Test with a graph having a single edge
        FordFulkerson ff = new FordFulkerson();
        int[][] graph = {
            {0, 10},
            {0, 0}
        };
        int result = ff.fordFulkerson(graph, 0, 1);
        Assert.assertEquals(10, result); // Expect flow equal to the single edge capacity
    }

    @Test
    public void testSourceEqualsSink() {
        // Test where source and sink are the same
        FordFulkerson ff = new FordFulkerson();
        int[][] graph = {
            {0, 10},
            {0, 0}
        };
        int result = ff.fordFulkerson(graph, 0, 0);
        Assert.assertEquals(0, result); // Expect 0 flow when source equals sink
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeCapacity() {
        // Test with negative capacities
        FordFulkerson ff = new FordFulkerson();
        int[][] graph = {
            {0, -10},
            {0, 0}
        };
        ff.fordFulkerson(graph, 0, 1); // Expect exception for negative capacity
    }

    @Test
    public void testLargeGraph() {
        // Stress test with a large graph
        FordFulkerson ff = new FordFulkerson();
        int size = 1000;
        int[][] graph = new int[size][size];
        for (int i = 0; i < size - 1; i++) {
            graph[i][i + 1] = 1;
        }
        int result = ff.fordFulkerson(graph, 0, size - 1);
        Assert.assertEquals(1, result); // Expect flow of 1 through a linear chain
    }
}