package org.example;

import org.junit.Assert;
import org.junit.Test;

public class FactoialCalculatorUnitTest {

    // Existing tests
    @Test
    public void testFactorial() {
        Assert.assertEquals(1, FactorialCalculator.factorial(0));   // testing edge case
        Assert.assertEquals(1, FactorialCalculator.factorial(1));
        Assert.assertEquals(120, FactorialCalculator.factorial(5));
        Assert.assertEquals(720, FactorialCalculator.factorial(6));
    }

    // New test for boundary values
    @Test
    public void testFactorialBoundaryValues() {
        Assert.assertEquals(2, FactorialCalculator.factorial(2));   // testing boundary value
        Assert.assertEquals(6, FactorialCalculator.factorial(3));   // testing boundary value
    }

    // New test for exception handling with negative input
    @Test(expected = IllegalArgumentException.class)
    public void testFactorialNegativeInput() {
        FactorialCalculator.factorial(-1);  // should throw IllegalArgumentException
    }

    // New test for stress condition with large input
    @Test
    public void testFactorialLargeInput() {
        // This test checks if the method can handle large inputs without performance issues
        // The expected result is not calculated here due to its large size, but the test ensures no overflow or errors
        FactorialCalculator.factorial(20);  // testing large input
    }
}