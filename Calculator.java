 import java.util.Scanner;

public class Calculator {

    // Functions
    static double add(double a, double b) {
        return a + b;
    }

    static double subtract(double a, double b) {
        return a - b;
    }

    static double multiply(double a, double b) {
        return a * b;
    }

    static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        char op = sc.next().charAt(0);

        double result = 0;

        if (op == '+') {
            result = add(num1, num2);
        } 
        else if (op == '-') {
            result = subtract(num1, num2);
        } 
        else if (op == '*') {
            result = multiply(num1, num2);
        } 
        else if (op == '/') {
            result = divide(num1, num2);
        } 
        else {
            System.out.println("Invalid operator");
            return;
        }

        System.out.println("Result = " + result);

        sc.close();
    }
}