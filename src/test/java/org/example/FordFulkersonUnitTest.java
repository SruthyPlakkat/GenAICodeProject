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

    // Test for a graph with no path from source to sink
    @Test
    public void testNoPathFromSourceToSink() {
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
        Assert.assertEquals(0, result); // Expecting 0 flow as there is no path
    }

    // Test for a graph with zero capacities
    @Test
    public void testGraphWithZeroCapacities() {
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
        Assert.assertEquals(0, result); // Expecting 0 flow due to zero capacities
    }

    // Test for source equals sink
    @Test
    public void testSourceEqualsSink() {
        FordFulkerson ff = new FordFulkerson();
        int[][] graph = {
                {0, 16, 13, 0, 0, 0},
                {0, 0, 10, 12, 0, 0},
                {0, 4, 0, 0, 14, 0},
                {0, 0, 9, 0, 0, 20},
                {0, 0, 0, 7, 0, 4},
                {0, 0, 0, 0, 0, 0}
        };
        int result = ff.fordFulkerson(graph, 0, 0);
        Assert.assertEquals(0, result); // Expecting 0 flow as source equals sink
    }

    // Test for a single-edge graph
    @Test
    public void testSingleEdgeGraph() {
        FordFulkerson ff = new FordFulkerson();
        int[][] graph = {
                {0, 10, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0}
        };
        int result = ff.fordFulkerson(graph, 0, 5);
        Assert.assertEquals(10, result); // Expecting 10 flow as there is one edge with capacity 10
    }

} 