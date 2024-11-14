package calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Simple Calculator");
        System.out.println("Choose an operation: + for addition, - for subtraction");
        char operation = scanner.next().charAt(0);

        System.out.print("Enter the first number: ");
        double num1 = 0;
        try {
            num1 = Double.parseDouble(scanner.next());
        } catch (NumberFormatException e) {
            System.out.println("Invalid number input.");
        }

        System.out.print("Enter the second number: ");
        double num2 = 0;
        try {
            num2 = Double.parseDouble(scanner.next());
        } catch (NumberFormatException e) {
            System.out.println("Invalid number input.");
        }

        double result = 0;

        switch (operation) {
            case '+':
            	Addition add = new Addition(num1, num2);
            	result = add.add(num1, num2);
                System.out.println("Result: " + result);
                break;
            case '-':
            	Subtraction minus = new Subtraction(num1, num2);
            	result = minus.minus(num1, num2);
                System.out.println("Result: " + result);
                break;
            default:
                System.out.println("Invalid operation. Please choose + or -.");
        }

        scanner.close();
    }
}