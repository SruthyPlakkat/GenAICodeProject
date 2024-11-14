package org.example;

public class FactorialCalculator {
    // Method to find the factorial using recursion
    public static long factorial(int number) {
        if (number <= 1) {
            return 1;
        }
        return number * factorial(number - 1);
    }
}
