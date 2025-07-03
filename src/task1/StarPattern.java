package task1;

import java.util.Scanner;

public class StarPattern {
    public static void main(String[] args) {
        // int n = 5;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");

        int n = scanner.nextInt();

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        scanner.close();
    }
}

/*
 * Enter number of rows: 10
 * * * * * * * * * *
 * * * * * * * * *
 * * * * * * * *
 * * * * * * *
 * * * * * *
 * * * * *
 * * * *
 * * *
 * *
 *
 */
