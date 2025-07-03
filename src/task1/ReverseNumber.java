package task1;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to reverse: ");
        int number = scanner.nextInt();

        int reversed = 0;

        int originalNumber = number;

        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        System.out.println("The reverse of " + originalNumber + " is: " + reversed);

        scanner.close();
    }
}
