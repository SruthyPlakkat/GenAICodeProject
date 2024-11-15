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

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialNegativeInput() {
        // Test to ensure that negative inputs throw an exception
        FactorialCalculator.factorial(-5);
    }

    @Test
    public void testFactorialLargeInput() {
        // Test for large input values to check for performance and stack overflow
        long result = FactorialCalculator.factorial(20);
        Assert.assertEquals(2432902008176640000L, result);
    }
}