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
    public void testFactorialWithNegativeInput() {
        // Test negative input to ensure proper exception handling
        FactorialCalculator.factorial(-5);
    }

    @Test
    public void testFactorialWithLargeInput() {
        // Test large input to evaluate performance and recursion depth
        Assert.assertEquals(2432902008176640000L, FactorialCalculator.factorial(20));
    }
}