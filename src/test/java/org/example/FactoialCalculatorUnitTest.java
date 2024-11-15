package org.example;

import org.junit.Assert;
import org.junit.Test;

public class FactoialCalculatorUnitTest {

    @Test
    public void testFactorial() {
        Assert.assertEquals(1, FactorialCalculator.factorial(0));   // testing edge case
        Assert.assertEquals(1, FactorialCalculator.factorial(1));   // base case
        Assert.assertEquals(120, FactorialCalculator.factorial(5)); // typical case
        Assert.assertEquals(720, FactorialCalculator.factorial(6)); // typical case
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialNegativeInput() {
        // Test to ensure that negative inputs throw an IllegalArgumentException
        FactorialCalculator.factorial(-1);
    }

    @Test
    public void testFactorialBoundaryValue() {
        // Testing boundary value between 1 and 2
        Assert.assertEquals(2, FactorialCalculator.factorial(2)); // boundary case
    }

    @Test
    public void testFactorialLargeInput() {
        // Stress test for large input to check for performance and overflow issues
        // Assuming the method should handle up to 20! correctly
        Assert.assertEquals(2432902008176640000L, FactorialCalculator.factorial(20)); // large input
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialOverflowInput() {
        // Test to check if the method handles inputs that cause overflow
        // Assuming the method should throw an exception for inputs greater than 20
        FactorialCalculator.factorial(21);
    }
}
