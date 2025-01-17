package org.example.ui;

import org.example.service.Calculator;

import java.util.Scanner;

public class CalculatorDriver {

    private final Scanner scanner = new Scanner(System.in);
    private final Calculator calculator = new Calculator();

    public void run() {
        performAddition();
    }

    private void performAddition() {
        System.out.println("Addition");

        System.out.print("Enter num1: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter num2: ");
        int num2 = scanner.nextInt();

        int result = calculator.add(num1, num2);
        System.out.println("Sum: " + result);
    }

    private void performSubtraction() {
        System.out.println("Subtraction");

        System.out.print("Enter num1: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter num2: ");
        int num2 = scanner.nextInt();

        int result = calculator.subtract(num1, num2);
        System.out.println("Difference: " + result);
    }
    private void performMultiplication() {
        System.out.println("Multiplication");

        System.out.print("Enter num1: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter num2: ");
        int num2 = scanner.nextInt();

        int result = calculator.multiply(num1, num2);
        System.out.println("Product: " + result);
    }
    private void performDivision() {
        System.out.println("Division");

        System.out.print("Enter num1: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter num2: ");
        int num2 = scanner.nextInt();
        if(num2==0){
        System.out.println("Cant Divide with Zero");
        }
        else{
        double result = calculator.division(num1, num2);
        System.out.println("Division: " + result);
        }
    }
    
}
