package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FactorialCalculatorTest {

    // Test for base case: factorial of 0
    @Test
    public void testFactorialOfZero() {
        assertEquals(1, FactorialCalculator.factorial(0), "Factorial of 0 should be 1");
    }

    // Test for base case: factorial of 1
    @Test
    public void testFactorialOfOne() {
        assertEquals(1, FactorialCalculator.factorial(1), "Factorial of 1 should be 1");
    }

    // Test for a small positive number
    @Test
    public void testFactorialOfSmallNumber() {
        assertEquals(120, FactorialCalculator.factorial(5), "Factorial of 5 should be 120");
    }

    // Test for a negative number
    @Test
    public void testFactorialOfNegativeNumber() {
        try {
            FactorialCalculator.factorial(-5);
            fail("Factorial of negative numbers should throw an exception");
        } catch (IllegalArgumentException e) {
            assertEquals("Negative numbers are not allowed", e.getMessage());
        }
    }

    // Test for a large number to check for stack overflow
    @Test
    public void testFactorialOfLargeNumber() {
        try {
            FactorialCalculator.factorial(10000);
            fail("Factorial of large numbers should throw a stack overflow error");
        } catch (StackOverflowError e) {
            // Expected behavior
        }
    }

    // Test for boundary value: factorial of 2
    @Test
    public void testFactorialOfTwo() {
        assertEquals(2, FactorialCalculator.factorial(2), "Factorial of 2 should be 2");
    }
}
