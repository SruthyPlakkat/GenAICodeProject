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
        // This test checks the behavior of the method with large inputs
        try {
            FactorialCalculator.factorial(20); // 20! is a large number but manageable
        } catch (StackOverflowError e) {
            Assert.fail("Stack overflow occurred for large input");
        }
    }
}
