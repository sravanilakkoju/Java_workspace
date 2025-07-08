package task2;

import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

/*
 * Write a Java program to store a list of unique student names using Set.
 * Ensure that duplicate entries are not allowed
 */
public class Set1Task {
    public static void main(String[] args) {
        Set<String> studentNames = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        String name;

        System.out.println("enter names you want to add:");
        System.out.println("type exit to stop..");
        while (true) {
            System.out.println("Name: ");
            name = scanner.nextLine();
            name = name.toUpperCase();

            if (name.equals("EXIT")) {
                break;
            }

            if (studentNames.add(name)) {
                System.out.println("Student added..");
            } else {
                System.out.println("duplicate entry");
            }

        }

        System.out.println("All the students in list: ");
        for (String student : studentNames) {
            System.out.println(" >> " + student);
        }

        scanner.close();
    }
}
