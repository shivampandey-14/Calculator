package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.println("Enter an operator (sqrt->s, power-> ^ , factorial -> ! ,log-> l) or 'q' to quit: ");
            char operator = scanner.next().charAt(0);

            if (operator == 'q') {
                System.out.println("Exiting calculator. Goodbye!");
                break;
            }

            double num2 = 0;
            if (operator != 's' && operator != '!' && operator != 'l') {
                System.out.println("Enter second number: ");
                num2 = scanner.nextDouble();
            }

            try {
                double result = Calculator.calculate(num1, operator, num2);
                System.out.println("Result: " + result);
            } catch (IllegalArgumentException e) {
                System.out.println("Error! " + e.getMessage());
            }
        }

        scanner.close();
    }
}
