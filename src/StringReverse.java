/*
 * 3.Create a method reverseString(String input) that 
 * returns the reversed version of the input string.
 */

import java.util.Scanner;

public class StringReverse {
    // reversing method
    public static void revStr(String s) {
        String st;
        char[] arr = s.toCharArray();

        for (int i = arr.length - 1; i >= 0; i--)
            System.out.print(arr[i]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // inpuyt
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        // function call
        revStr(str);
        sc.close();
    }
}
