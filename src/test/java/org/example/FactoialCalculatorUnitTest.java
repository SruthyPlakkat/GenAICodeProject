package org.example;

import org.junit.Assert;
import org.junit.Test;

public class FactoialCalculatorUnitTest {
    @Test
    public void testFactorial() {
        Assert.assertEquals(1, FactorialCalculator.factorial(0));   // testing edge case
        Assert.assertEquals(1, FactorialCalculator.factorial(1));
        Assert.assertEquals(120, FactorialCalculator.factorial(5));
        Assert.assertEquals(720, FactorialCalculator.factorial(6));
    }

    // Test for negative input values
    @Test(expected = IllegalArgumentException.class)
    public void testFactorialNegativeInput() {
        // This test checks if the method throws an exception for negative inputs
        FactorialCalculator.factorial(-1);
    }

    // Test for large input values to check for stack overflow
    @Test
    public void testFactorialLargeInput() {
        // This test checks if the method can handle large inputs without crashing
        // Note: This test might need adjustment based on system stack size
        try {
            FactorialCalculator.factorial(20); // Adjust the number based on system capability
        } catch (StackOverflowError e) {
            Assert.fail("Stack overflow occurred for large input");
        }
    }

    // Test for maximum integer input
    @Test
    public void testFactorialMaxIntInput() {
        // This test checks if the method handles the maximum integer input gracefully
        // Expected to fail or handle gracefully based on implementation
        try {
            FactorialCalculator.factorial(Integer.MAX_VALUE);
        } catch (StackOverflowError e) {
            Assert.fail("Stack overflow occurred for maximum integer input");
        }
    }
}