package concepts;

public class TypeCasting {
    public static void main(String[] args) {
        /*
         * ------Java Type Casting-------
         * Type casting is when you assign a value of one primitive data type to another
         * type.
         * 
         * In Java, there are two types of casting:
         * 
         * ----Widening Casting (automatically) - converting a smaller type to a larger
         * type
         * size
         * byte -> short -> char -> int -> long -> float -> double
         * 
         * ----Narrowing Casting (manually) - converting a larger type to a smaller size
         * type
         * double -> float -> long -> int -> char -> short -> byte
         */

        float f = 5.6f;
        int x = (int) f; // takes out the decimal values and returns int value
        System.out.println(x);

        byte b = 127;// max range of byte
        System.out.println(b);

        int a = b;
        System.out.println(a);

        // type promotion
        byte g = 45;
        byte j = 100;
        int result = g + j;
        System.out.println(result);

    }
}
