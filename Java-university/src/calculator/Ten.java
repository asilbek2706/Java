package calculator;

import java.util.Scanner;

public class Ten {
    public static void calculator() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Simple Calculator ===");

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Choose an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        double result = 0;
        boolean validOperation = true;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: You can't divide by zero.");
                    validOperation = false;
                }
                break;
            default:
                System.out.println("Error: Invalid operator chosen!");
                validOperation = false;
                break;
        }

        if (validOperation) {
            System.out.println("Result: " + num1 + " " + operator + " " + num2 + " = " + result);
        }
    }

}
