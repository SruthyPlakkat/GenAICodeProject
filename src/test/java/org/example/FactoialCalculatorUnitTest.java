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

    // New tests for enhanced coverage
    @Test
    public void testFactorialOfZero() {
        Assert.assertEquals(1, FactorialCalculator.factorial(0));
    }

    @Test
    public void testFactorialOfOne() {
        Assert.assertEquals(1, FactorialCalculator.factorial(1));
    }

    @Test
    public void testFactorialOfSmallNumber() {
        Assert.assertEquals(6, FactorialCalculator.factorial(3));
    }

    @Test
    public void testFactorialOfLargeNumber() {
        Assert.assertEquals(3628800, FactorialCalculator.factorial(10));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialOfNegativeNumber() {
        FactorialCalculator.factorial(-5);
    }

    @Test
    public void testFactorialOfVeryLargeNumber() {
        try {
            FactorialCalculator.factorial(10000);
            Assert.fail("Expected an exception for very large input");
        } catch (ArithmeticException e) {
            // Expected behavior
        }
    }
}