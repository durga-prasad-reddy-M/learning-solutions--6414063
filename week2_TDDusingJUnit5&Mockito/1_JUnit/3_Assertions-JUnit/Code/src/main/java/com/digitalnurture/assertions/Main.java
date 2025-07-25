package com.digitalnurture.assertions;

public class Main {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }
    
    public int multiply(int a, int b) {
        return a * b;
    }
    
    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return (double) a / b;
    }
    
    public boolean isPositive(int number) {
        return number > 0;
    }

    public boolean isNegative(int number) {
        return number < 0;
    }
    
    public int abs(int number) {
        return number < 0 ? -number : number;
    }
}
