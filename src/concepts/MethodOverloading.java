package concepts;

/*
 * Method Overloading
 * With method overloading, multiple methods 
 * can have the same name with different parameters:
 */
public class MethodOverloading {

    static int plusMethod(int x, int y) {
        return x + y;
    }

    static double plusMethod(double x, double y) {
        return x + y;
    }

    static String plusMethod(String x, String y) {
        return x + y;
    }

    public static void main(String[] args) {

        int myNum1 = plusMethod(8, 5);
        System.out.println("int: " + myNum1);

        double myNum2 = plusMethod(4.3, 6.26);
        System.out.println("double: " + myNum2);

        String myNum3 = plusMethod("Radha", "Krishna");
        System.out.println("String: " + myNum3);

        // SCOPES//

        // ------Method Scope-------
        // Code here CANNOT use dx

        int dx = 100;

        // Code here can use x
        System.out.println(dx);

        // ------Block Scope-------
        // A block of code refers to all of the code between curly braces {}.
        /*
         * // Code here CANNOT use x
         * 
         * { // This is a block
         * 
         * // Code here CANNOT use x
         * 
         * int x = 100;
         * 
         * // Code here CAN use x
         * System.out.println(x);
         * 
         * } // The block ends here
         * 
         * // Code here CANNOT use x
         * 
         */
    }
}
