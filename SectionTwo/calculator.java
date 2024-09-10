package SectionTwo;
import java.util.Scanner;

class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, result = 0;
        char operation;

        System.out.print("Enter the first number: ");
        num1 = scanner.nextDouble();

        System.out.print("enter the second number: ");
        num2 = scanner.nextDouble();

        System.out.print("select the operation (+, -, *, /): ");
        operation = scanner.next().charAt(0);

        switch (operation) {
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
                    System.out.println("Error: Cannot divide by zero.");
                    return;
                }
                break;
            default:
                System.out.println("Invalid Operation.");
                return;
        }

        System.out.println("The Result  " + num1 + " " + operation + " " + num2 + " is: " + result);

        scanner.close();
    }
}

