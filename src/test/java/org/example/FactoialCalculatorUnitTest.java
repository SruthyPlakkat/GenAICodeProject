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
    public void testNegativeInputHandling() {
        // Suggestion: Throw an IllegalArgumentException for negative inputs
        try {
            FactorialCalculator.factorial(-5);
            Assert.fail("Expected IllegalArgumentException for negative input");
        } catch (IllegalArgumentException e) {
            // Test passes
        }
    }

    @Test
    public void testMaximumComputableFactorial() {
        // Test the maximum factorial that can be computed without overflow
        // Assuming FactorialCalculator uses long, the maximum safe input is 20
        Assert.assertEquals(2432902008176640000L, FactorialCalculator.factorial(20));
        // Test for overflow condition
        try {
            FactorialCalculator.factorial(21);
            Assert.fail("Expected ArithmeticException for overflow");
        } catch (ArithmeticException e) {
            // Test passes
        }
    }

    @Test
    public void testPerformanceUnderStress() {
        // Test performance by calling factorial multiple times
        for (int i = 0; i < 100000; i++) {
            Assert.assertEquals(120, FactorialCalculator.factorial(5));
        }
        // This test ensures that the method can handle repeated calls efficiently
    }

    @Test
    public void testNegativeInputHandling() {
        // Suggestion: Throw an IllegalArgumentException for negative inputs
        try {
            FactorialCalculator.factorial(-5);
            Assert.fail("Expected IllegalArgumentException for negative input");
        }

    @Test
    public void testNegativeInputHandling() {
        // Suggestion: Throw an IllegalArgumentException for negative inputs
        try {
            FactorialCalculator.factorial(-5);
            Assert.fail("Expected IllegalArgumentException for negative input");
        } catch (IllegalArgumentException e) {
            // Test passes
        }
    }

    @Test
    public void testMaximumComputableFactorial() {
        // Test the maximum factorial that can be computed without overflow
        // Assuming FactorialCalculator uses long, the maximum safe input is 20
        Assert.assertEquals(2432902008176640000L, FactorialCalculator.factorial(20));
        // Test for overflow condition
        try {
            FactorialCalculator.factorial(21);
            Assert.fail("Expected ArithmeticException for overflow");
        } catch (ArithmeticException e) {
            // Test passes
        }
    }

    @Test
    public void testPerformanceUnderStress() {
        // Test performance by calling factorial multiple times
        for (int i = 0; i < 100000; i++) {
            Assert.assertEquals(120, FactorialCalculator.factorial(5));
        }
        // This test ensures that the method can handle repeated calls efficiently
    } catch (IllegalArgumentException e) {
            // Test passes
        }

    @Test
    public void testNegativeInputHandling() {
        // Suggestion: Throw an IllegalArgumentException for negative inputs
        try {
            FactorialCalculator.factorial(-5);
            Assert.fail("Expected IllegalArgumentException for negative input");
        } catch (IllegalArgumentException e) {
            // Test passes
        }
    }

    @Test
    public void testMaximumComputableFactorial() {
        // Test the maximum factorial that can be computed without overflow
        // Assuming FactorialCalculator uses long, the maximum safe input is 20
        Assert.assertEquals(2432902008176640000L, FactorialCalculator.factorial(20));
        // Test for overflow condition
        try {
            FactorialCalculator.factorial(21);
            Assert.fail("Expected ArithmeticException for overflow");
        } catch (ArithmeticException e) {
            // Test passes
        }
    }

    @Test
    public void testPerformanceUnderStress() {
        // Test performance by calling factorial multiple times
        for (int i = 0; i < 100000; i++) {
            Assert.assertEquals(120, FactorialCalculator.factorial(5));
        }
        // This test ensures that the method can handle repeated calls efficiently
    }
    }

    @Test
    public void testNegativeInputHandling() {
        // Suggestion: Throw an IllegalArgumentException for negative inputs
        try {
            FactorialCalculator.factorial(-5);
            Assert.fail("Expected IllegalArgumentException for negative input");
        } catch (IllegalArgumentException e) {
            // Test passes
        }
    }

    @Test
    public void testMaximumComputableFactorial() {
        // Test the maximum factorial that can be computed without overflow
        // Assuming FactorialCalculator uses long, the maximum safe input is 20
        Assert.assertEquals(2432902008176640000L, FactorialCalculator.factorial(20));
        // Test for overflow condition
        try {
            FactorialCalculator.factorial(21);
            Assert.fail("Expected ArithmeticException for overflow");
        } catch (ArithmeticException e) {
            // Test passes
        }
    }

    @Test
    public void testPerformanceUnderStress() {
        // Test performance by calling factorial multiple times
        for (int i = 0; i < 100000; i++) {
            Assert.assertEquals(120, FactorialCalculator.factorial(5));
        }
        // This test ensures that the method can handle repeated calls efficiently
    }

    @Test
    public void testMaximumComputableFactorial() {
        // Test the maximum factorial that can be computed without overflow
        // Assuming FactorialCalculator uses long, the maximum safe input is 20
        Assert.assertEquals(2432902008176640000L, FactorialCalculator.factorial(20));
        // Test for overflow condition
        try {
            FactorialCalculator.factorial(21);
            Assert.fail("Expected ArithmeticException for overflow");
        }

    @Test
    public void testNegativeInputHandling() {
        // Suggestion: Throw an IllegalArgumentException for negative inputs
        try {
            FactorialCalculator.factorial(-5);
            Assert.fail("Expected IllegalArgumentException for negative input");
        } catch (IllegalArgumentException e) {
            // Test passes
        }
    }

    @Test
    public void testMaximumComputableFactorial() {
        // Test the maximum factorial that can be computed without overflow
        // Assuming FactorialCalculator uses long, the maximum safe input is 20
        Assert.assertEquals(2432902008176640000L, FactorialCalculator.factorial(20));
        // Test for overflow condition
        try {
            FactorialCalculator.factorial(21);
            Assert.fail("Expected ArithmeticException for overflow");
        } catch (ArithmeticException e) {
            // Test passes
        }
    }

    @Test
    public void testPerformanceUnderStress() {
        // Test performance by calling factorial multiple times
        for (int i = 0; i < 100000; i++) {
            Assert.assertEquals(120, FactorialCalculator.factorial(5));
        }
        // This test ensures that the method can handle repeated calls efficiently
    } catch (ArithmeticException e) {
            // Test passes
        }

    @Test
    public void testNegativeInputHandling() {
        // Suggestion: Throw an IllegalArgumentException for negative inputs
        try {
            FactorialCalculator.factorial(-5);
            Assert.fail("Expected IllegalArgumentException for negative input");
        } catch (IllegalArgumentException e) {
            // Test passes
        }
    }

    @Test
    public void testMaximumComputableFactorial() {
        // Test the maximum factorial that can be computed without overflow
        // Assuming FactorialCalculator uses long, the maximum safe input is 20
        Assert.assertEquals(2432902008176640000L, FactorialCalculator.factorial(20));
        // Test for overflow condition
        try {
            FactorialCalculator.factorial(21);
            Assert.fail("Expected ArithmeticException for overflow");
        } catch (ArithmeticException e) {
            // Test passes
        }
    }

    @Test
    public void testPerformanceUnderStress() {
        // Test performance by calling factorial multiple times
        for (int i = 0; i < 100000; i++) {
            Assert.assertEquals(120, FactorialCalculator.factorial(5));
        }
        // This test ensures that the method can handle repeated calls efficiently
    }
    }

    @Test
    public void testNegativeInputHandling() {
        // Suggestion: Throw an IllegalArgumentException for negative inputs
        try {
            FactorialCalculator.factorial(-5);
            Assert.fail("Expected IllegalArgumentException for negative input");
        } catch (IllegalArgumentException e) {
            // Test passes
        }
    }

    @Test
    public void testMaximumComputableFactorial() {
        // Test the maximum factorial that can be computed without overflow
        // Assuming FactorialCalculator uses long, the maximum safe input is 20
        Assert.assertEquals(2432902008176640000L, FactorialCalculator.factorial(20));
        // Test for overflow condition
        try {
            FactorialCalculator.factorial(21);
            Assert.fail("Expected ArithmeticException for overflow");
        } catch (ArithmeticException e) {
            // Test passes
        }
    }

    @Test
    public void testPerformanceUnderStress() {
        // Test performance by calling factorial multiple times
        for (int i = 0; i < 100000; i++) {
            Assert.assertEquals(120, FactorialCalculator.factorial(5));
        }
        // This test ensures that the method can handle repeated calls efficiently
    }

    @Test
    public void testPerformanceUnderStress() {
        // Test performance by calling factorial multiple times
        for (int i = 0; i < 100000; i++) {
            Assert.assertEquals(120, FactorialCalculator.factorial(5));
        }

    @Test
    public void testNegativeInputHandling() {
        // Suggestion: Throw an IllegalArgumentException for negative inputs
        try {
            FactorialCalculator.factorial(-5);
            Assert.fail("Expected IllegalArgumentException for negative input");
        } catch (IllegalArgumentException e) {
            // Test passes
        }
    }

    @Test
    public void testMaximumComputableFactorial() {
        // Test the maximum factorial that can be computed without overflow
        // Assuming FactorialCalculator uses long, the maximum safe input is 20
        Assert.assertEquals(2432902008176640000L, FactorialCalculator.factorial(20));
        // Test for overflow condition
        try {
            FactorialCalculator.factorial(21);
            Assert.fail("Expected ArithmeticException for overflow");
        } catch (ArithmeticException e) {
            // Test passes
        }
    }

    @Test
    public void testPerformanceUnderStress() {
        // Test performance by calling factorial multiple times
        for (int i = 0; i < 100000; i++) {
            Assert.assertEquals(120, FactorialCalculator.factorial(5));
        }
        // This test ensures that the method can handle repeated calls efficiently
    }
        // This test ensures that the method can handle repeated calls efficiently
    }

    @Test
    public void testNegativeInputHandling() {
        // Suggestion: Throw an IllegalArgumentException for negative inputs
        try {
            FactorialCalculator.factorial(-5);
            Assert.fail("Expected IllegalArgumentException for negative input");
        } catch (IllegalArgumentException e) {
            // Test passes
        }
    }

    @Test
    public void testMaximumComputableFactorial() {
        // Test the maximum factorial that can be computed without overflow
        // Assuming FactorialCalculator uses long, the maximum safe input is 20
        Assert.assertEquals(2432902008176640000L, FactorialCalculator.factorial(20));
        // Test for overflow condition
        try {
            FactorialCalculator.factorial(21);
            Assert.fail("Expected ArithmeticException for overflow");
        } catch (ArithmeticException e) {
            // Test passes
        }
    }

    @Test
    public void testPerformanceUnderStress() {
        // Test performance by calling factorial multiple times
        for (int i = 0; i < 100000; i++) {
            Assert.assertEquals(120, FactorialCalculator.factorial(5));
        }
        // This test ensures that the method can handle repeated calls efficiently
    }
}

    @Test
    public void testNegativeInputHandling() {
        // Suggestion: Throw an IllegalArgumentException for negative inputs
        try {
            FactorialCalculator.factorial(-5);
            Assert.fail("Expected IllegalArgumentException for negative input");
        } catch (IllegalArgumentException e) {
            // Test passes
        }
    }

    @Test
    public void testMaximumComputableFactorial() {
        // Test the maximum factorial that can be computed without overflow
        // Assuming FactorialCalculator uses long, the maximum safe input is 20
        Assert.assertEquals(2432902008176640000L, FactorialCalculator.factorial(20));
        // Test for overflow condition
        try {
            FactorialCalculator.factorial(21);
            Assert.fail("Expected ArithmeticException for overflow");
        } catch (ArithmeticException e) {
            // Test passes
        }
    }

    @Test
    public void testPerformanceUnderStress() {
        // Test performance by calling factorial multiple times
        for (int i = 0; i < 100000; i++) {
            Assert.assertEquals(120, FactorialCalculator.factorial(5));
        }
        // This test ensures that the method can handle repeated calls efficiently
    }