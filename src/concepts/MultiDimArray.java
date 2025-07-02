package concepts;

public class MultiDimArray {

    public static void main(String[] args) {
        int[][] myNumbers = { { 1, 2, 3 }, { 4, 5, 6 } };
        // access elements...
        System.out.println("the element you accessed is : " + myNumbers[1][2]);

        // Array indexes start with 0: [0] is the first element.
        // [1] is the second element, etc.

        // Loop through multi-dimentional array..
        System.out.println("printing elements using loop in multi-dim array");
        for (int i = 0; i < myNumbers.length; i++) {
            for (int j = 0; j < myNumbers[i].length; j++) {
                System.out.println(myNumbers[i][j]);
            }
        }

        // For - each loop of the array..
        System.out.println("printing ele using for-each loop in multi-dim array");
        for (int[] row : myNumbers) {
            for (int i : row) {
                System.out.println(i);
            }
        }
    }
}
