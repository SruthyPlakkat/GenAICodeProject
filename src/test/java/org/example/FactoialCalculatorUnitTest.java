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

    @Test
    public void testFactorialOfZero() {
        // Test the factorial of 0, which should return 1
        Assert.assertEquals(1, FactorialCalculator.factorial(0));
    }

    @Test
    public void testFactorialOfOne() {
        // Test the factorial of 1, which should return 1
        Assert.assertEquals(1, FactorialCalculator.factorial(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialOfNegativeNumber() {
        // Test the factorial of a negative number, expecting an exception
        FactorialCalculator.factorial(-5);
    }

    @Test
    public void testFactorialOfLargeNumber() {
        // Test the factorial of a large number to ensure performance and no stack overflow
        Assert.assertEquals(2432902008176640000L, FactorialCalculator.factorial(20));
    }

    @Test
    public void testFactorialOfZero() {
        // Test the factorial of 0, which should return 1
        Assert.assertEquals(1, FactorialCalculator.factorial(0));
    }

    @Test
    public void testFactorialOfOne() {
        // Test the factorial of 1, which should return 1
        Assert.assertEquals(1, FactorialCalculator.factorial(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialOfNegativeNumber() {
        // Test the factorial of a negative number, expecting an exception
        FactorialCalculator.factorial(-5);
    }

    @Test
    public void testFactorialOfLargeNumber() {
        // Test the factorial of a large number to ensure performance and no stack overflow
        Assert.assertEquals(2432902008176640000L, FactorialCalculator.factorial(20));
    }
}