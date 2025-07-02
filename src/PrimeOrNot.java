
/*
 * Write a Java method to check 
 * whether a number is prime or not
 */
import java.util.Scanner;

public class PrimeOrNot {

	// Static method to check if ti is a prime or not..
	public static String checkPrime(int a) {
		if (a <= 1) {
			return "Not a prime number";
		}
		for (int i = 2; i < a; i++) {
			if (a % i == 0)
				return "Not a prime number";
		}
		return "Yes it is a Prime number";
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number");
		int a = sc.nextInt();

		// function calll and print
		System.out.println(checkPrime(a));
		sc.close();

	}

}
