package concepts;

public class Operaters {
    public static void main(String[] args) {
        // Operators----
        /*
         * Java divides the operators into the following groups:
         * 
         * Arithmetic operators - +,-;/;%;++;--
         * Assignment operators - =
         * Comparison operators - >,<,==,!=,<=,>= - returns bool value
         * Logical operators -
         * Bitwise operators
         * 
         */

        int x = 10;
        int y = 5;
        int add = x + y;
        int sub = x - y;
        int mul = x * y;
        int div = x / y;
        int mod = x % y;
        int inc = x++;
        int dec = y--;
        System.out.println(add);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);
        System.out.println(mod);
        System.out.println(inc);
        System.out.println(dec);

        // Comparison
        System.out.println(x != y);
        System.out.println(x == y);
        System.out.println(x >= y);
        System.out.println(x <= y);
        System.out.println(x < y);
        System.out.println(x > y);

        // Logical operators
        System.out.println("---logical---");
        int a = 8;
        int b = 6;
        double c = 5.6;
        double d = 6.3;

        System.out.println(a < b && c < d);
        System.out.println(a > b || c > d);
        System.out.println(!(a > b || c > d));

    }
}
