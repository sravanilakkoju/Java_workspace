package concepts;

//Arrays are used to store multiple values in a single variable,
//instead of declaring separate variables for each value.
//To declare an array, define the variable type with square brackets

public class Arrays {

	// let's create a program that calculates the average of different ages:
	public static void avgAge() {
		int ages[] = { 20, 22, 18, 35, 48, 26, 87, 70 };
		float avg = 0, sum = 0;
		int length = ages.length;
		for (int age : ages) {
			sum += age;
		}

		// calculate the avg
		avg = sum / length;

		// Corrected line using println()
		System.out.println("The average of ages is : " + avg);
	}

	public static void lowestAge() {
		int ages[] = { 20, 22, 18, 35, 48, 26, 87, 70 };
		int length = ages.length;
		int lowestAge = ages[0];

		for (int age : ages) {
			if (lowestAge > age) {
				lowestAge = age;
			}
		}
		System.out.printf("the lowest age is : %s", lowestAge);
	}

	public static void main(String[] args) {
		// declared a variable that holds an array of strings
		String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };

		// To create an array of integers, you could write:
		int[] myNum = { 10, 23, 6, 8, 9 };

		// Access the Elements of an Array
		System.out.println("Accessing thired ellement in cars array: " + cars[2]);

		// Change an Array Element
		cars[0] = "Opel";

		// Array Length
		System.out.println("the length of myNum array is: " + myNum.length);

		// Array Loop
		// For loop
		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}

		// for-each loop
		/*
		 * Syntax
		 * for (type variable : arrayname) {
		 * ...
		 * }
		 */
		for (int i : myNum) {
			System.out.println(i);
		}

		for (String i : cars) {
			System.out.println(i);
		}

		avgAge();
		lowestAge();
	}

}
