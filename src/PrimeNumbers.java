/*
 * Problem 2 - Write a Java program to find all 
 * prime numbers between 10 and 100 
 * and for each prime number, 
 * check if its reverse is also a prime number.
 */

public class PrimeNumbers {

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to reverse the digits of a number
    public static int reverseNum(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }

    public static void main(String[] args) {
        System.out.println("Prime numbers between 10 and 100 and their reverses:");
        for (int i = 10; i <= 100; i++) {
            Boolean pr = isPrime(i);
            if (pr) {
                int revInt = reverseNum(i);
                boolean rp = isPrime(revInt);
                if (rp) {
                    System.out.println("Prime:" + i + "\nReverse: " + revInt + " - Prime");
                } else {
                    System.out.println("Prime: " + i + "\nReversed: " + revInt + " - Not Prime");
                }
            }
        }
    }
}
