/*
 * Problem 1- Take a word as input and count the number of vowels in it.
 */

import java.util.Scanner;
public class CountVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the string: ");
		String str = sc.nextLine();
		
		str = str.toLowerCase();
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
        
            if (str.charAt(i) == 'a'
            	|| str.charAt(i) == 'e'
                || str.charAt(i) == 'i'
                || str.charAt(i) == 'o'
                || str.charAt(i) == 'u') {
                count++;
            }
        }

        System.out.println(
            "Total no of vowels in string are: " + count);
        
		sc.close();

	}

}
