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
        // This test checks if the method throws an exception for negative inputs
        FactorialCalculator.factorial(-5);
    }

    @Test
    public void testFactorialLargeInput() {
        // This test checks if the method can handle large inputs without stack overflow
        long result = FactorialCalculator.factorial(20);
        Assert.assertTrue(result > 0);  // Ensure the result is positive and computation completes
    }

    @Test
    public void testFactorialBaseCases() {
        // Additional base cases for clarity
        Assert.assertEquals(2, FactorialCalculator.factorial(2));
        Assert.assertEquals(6, FactorialCalculator.factorial(3));
    }
}
