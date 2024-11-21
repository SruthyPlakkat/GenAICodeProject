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

    // Test for a graph with no edges
    @Test
    public void testGraphWithNoEdges() {
        int[][] graph = new int[6][6]; // All capacities are zero
        assertEquals(0, ff.fordFulkerson(graph, 0, 5)); // Expect max flow to be 0
    }

    // Test for a graph where source equals sink
    @Test
    public void testSourceEqualsSink() {
        int[][] graph = {
            {0, 10, 0, 0, 0, 0},
            {0, 0, 5, 0, 0, 0},
            {0, 0, 0, 10, 0, 0},
            {0, 0, 0, 0, 10, 0},
            {0, 0, 0, 0, 0, 10},
            {0, 0, 0, 0, 0, 0}
        };
        assertEquals(0, ff.fordFulkerson(graph, 0, 0)); // Source equals sink, expect max flow to be 0
    }

    // Test for a simple graph with a single path
    @Test
    public void testSinglePathGraph() {
        int[][] graph = {
            {0, 10, 0, 0, 0, 0},
            {0, 0, 10, 0, 0, 0},
            {0, 0, 0, 10, 0, 0},
            {0, 0, 0, 0, 10, 0},
            {0, 0, 0, 0, 0, 10},
            {0, 0, 0, 0, 0, 0}
        };
        assertEquals(10, ff.fordFulkerson(graph, 0, 5)); // Expect max flow to be 10
    }

    // Test for handling invalid input (negative capacities)
    @Test(expected = IllegalArgumentException.class)
    public void testNegativeCapacities() {
        int[][] graph = {
            {0, -10, 0, 0, 0, 0},
            {0, 0, 5, 0, 0, 0},
            {0, 0, 0, 10, 0, 0},
            {0, 0, 0, 0, 10, 0},
            {0, 0, 0, 0, 0, 10},
            {0, 0, 0, 0, 0, 0}
        };
        ff.fordFulkerson(graph, 0, 5);
    }
}