/*
 * Create a Calculator class with methods: add(),
 * subtract(), multiply(), and divide().Take user 
 * input for two numbers and perform operations.
 */

import java.util.Scanner;

public class MathCalculator {
    // ADD
    public static double add(double a, double b) {
        double result = a + b;
        return result;
    }

    // SUBTRACT
    public static double subtract(double a, double b) {
        double result = a - b;
        return result;
    }

    // MULTIPLY
    public static double multiply(double a, double b) {
        double result = a * b;
        return result;
    }

    // DIVIDE
    public static double divide(double a, double b) {
        double result = a / b;
        return result;
    }

    // MODULUS
    public static double mod(double a, double b) {
        double result = a % b;
        return result;
    }

    public static void oppFunctions(double a, double b, Scanner sc) {
        // SWITCH statement for operations..
        System.out.println("enter the operation you want to perform:\n<<<< +,-,*,/,% >>>> ");
        String c = sc.next();
        try {
            switch (c) {
                case "+":
                    System.out.println(add(a, b));
                    break;
                case "-":
                    System.out.println(subtract(a, b));
                    break;
                case "*":
                    System.out.println(multiply(a, b));
                    break;
                case "/":
                    System.out.println(divide(a, b));
                    break;
                case "%":
                    System.out.println(mod(a, b));
                    break;
                default:
                    System.out.println("Invalid..! \nPlease give the proper input\n");
                    oppFunctions(a, b, sc);
                    break;
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }

    public static void main(String[] args) {
        // creating the dscaner object
        Scanner sc = new Scanner(System.in);

        // input fro the user

        // tru block to catch the error in input
        try {
            System.out.println("Enter your first number");
            double a = sc.nextDouble();
            System.out.println("Enter your second number");
            double b = sc.nextDouble();

            // calling the function to perform gthe operations
            oppFunctions(a, b, sc);
        } catch (Exception e) {
            System.out.println("There was some problem: " + e.toString());
        }

        sc.close();
    }
}
