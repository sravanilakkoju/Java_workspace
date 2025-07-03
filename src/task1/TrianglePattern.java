package task1;

import java.util.Scanner;

public class TrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter triangle height: ");
        int height = sc.nextInt();

        for (int i = 1; i <= height; i++) {
            for (int num = 1; num <= i; num++) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}

/*
 * Enter triangle height: 7
 * 1
 * 1 2
 * 1 2 3
 * 1 2 3 4
 * 1 2 3 4 5
 * 1 2 3 4 5 6
 * 1 2 3 4 5 6 7
 */