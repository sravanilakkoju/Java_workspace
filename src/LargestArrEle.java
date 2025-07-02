/*
 * 4.Define a method to find the largest number in an array.
 */

public class LargestArrEle {
    public static void main(String[] args) {

        // initializing an array..
        int[] a = { 12, 8, 5, 63, 56, 75, 200, 869, 6, 1, 0 };
        int larNum = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] > larNum) {
                larNum = a[i];
            }
        }
        System.out.println("The largest element in the array is: " + larNum);
    }
}
