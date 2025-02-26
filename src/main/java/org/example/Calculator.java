package org.example;

public class Calculator {
    public static double calculate(double num1, char operator, double num2) {
        switch (operator) {
            case '^':
                return Math.pow(num1, num2);
            case 's':
                if (num1 < 0) throw new IllegalArgumentException("Cannot compute square root of a negative number.");
                return Math.sqrt(num1);
            case 'l':
                if (num1 <= 0) throw new IllegalArgumentException("Natural log is undefined for non-positive numbers.");
                return Math.log(num1);
            case '!':
                if (num1 < 0 || num1 != (int) num1) throw new IllegalArgumentException("Factorial is only defined for non-negative integers.");
                return factorial((int) num1);
            default:
                throw new IllegalArgumentException("Invalid operator!");
        }
    }

    private static long factorial(int num) {
        long result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}
