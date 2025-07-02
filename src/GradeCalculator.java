/*
 * Create a class Student with a method getGrade(int marks) that 
 * returns grade based on marks:
 *	>=90 - A
 *	>=75 - B
 *	>=60 - C
 *	Else - D
 */

import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter marks of three subjects: ");
		int sub1 = sc.nextInt();
		int sub2 = sc.nextInt();
		int sub3 = sc.nextInt();

		int total = sub1 + sub2 + sub3;
		double percent = total / 3.0;
		System.out.printf("Percentage: %.2f", percent);
		System.out.println();
		char grade;

		if (percent >= 90) {
			grade = 'A';
		} else if (percent >= 80) {
			grade = 'B';
		} else if (percent >= 70) {
			grade = 'C';
		} else if (percent >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}

		System.out.println("Grade: " + grade);
		sc.close();

	}

}
