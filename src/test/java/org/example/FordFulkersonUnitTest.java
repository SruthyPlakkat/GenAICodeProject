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
    public void testNoEdges() {
        // Graph with no edges
        int[][] graph = new int[6][6];
        int result = ff.fordFulkerson(graph, 0, 5);
        // Expecting 0 flow as there are no edges
        Assert.assertEquals(0, result);
    }

    @Test
    public void testSourceEqualsSink() {
        // Graph where source equals sink
        int[][] graph = {
            {0, 16, 13, 0, 0, 0},
            {0, 0, 10, 12, 0, 0},
            {0, 4, 0, 0, 14, 0},
            {0, 0, 9, 0, 0, 20},
            {0, 0, 0, 7, 0, 4},
            {0, 0, 0, 0, 0, 0}
        };
        int result = ff.fordFulkerson(graph, 0, 0);
        // Expecting 0 flow as source equals sink
        Assert.assertEquals(0, result);
    }

    @Test
    public void testSingleEdge() {
        // Graph with a single edge
        int[][] graph = {
            {0, 10, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0}
        };
        int result = ff.fordFulkerson(graph, 0, 1);
        // Expecting flow equal to the single edge capacity
        Assert.assertEquals(10, result);
    }

    @Test
    public void testNegativeCapacity() {
        // Graph with negative capacity (invalid input)
        int[][] graph = {
            {0, -10, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0}
        };
        try {
            ff.fordFulkerson(graph, 0, 1);
            Assert.fail("Expected IllegalArgumentException for negative capacity");
        } catch (IllegalArgumentException e) {
            // Expected exception
        }
    }

    @Test
    public void testLargeGraph() {
        // Large graph for stress testing
        int[][] graph = new int[1000][1000];
        // Populate graph with random capacities
        for (int i = 0; i < 999; i++) {
            graph[i][i + 1] = 100;
        }
        int result = ff.fordFulkerson(graph, 0, 999);
        // Expecting flow equal to the total capacity
        Assert.assertEquals(100 * 999, result);
    }
}