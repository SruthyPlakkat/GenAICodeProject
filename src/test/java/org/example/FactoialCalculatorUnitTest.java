package org.example;

import org.junit.Assert;
import org.junit.Test;

public class FactoialCalculatorUnitTest {

    @Test
    public void testFactorialZero() {
        // Edge case: Factorial of 0 should be 1
        Assert.assertEquals(1, FactorialCalculator.factorial(0));
    }

    @Test
    public void testFactorialOne() {
        // Base case: Factorial of 1 should be 1
        Assert.assertEquals(1, FactorialCalculator.factorial(1));
    }

    @Test
    public void testFactorialPositiveNumber() {
        // Typical case: Factorial of 5 should be 120
        Assert.assertEquals(120, FactorialCalculator.factorial(5));
    }

    @Test
    public void testFactorialAnotherPositiveNumber() {
        // Typical case: Factorial of 6 should be 720
        Assert.assertEquals(720, FactorialCalculator.factorial(6));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialNegativeNumber() {
        // Invalid input: Factorial of a negative number should throw an exception
        FactorialCalculator.factorial(-1);
    }

    @Test
    public void testFactorialLargeNumber() {
        // Stress test: Factorial of a large number to check for performance or overflow
        // Note: This test might need adjustment based on the system's capabilities
        try {
            FactorialCalculator.factorial(20); // 20! is a large number but manageable
        } catch (StackOverflowError e) {
            Assert.fail("Stack overflow occurred for factorial of 20");
        }
    }
}
