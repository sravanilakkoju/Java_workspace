public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World");// prints and goes to new line
        // we use // for short comments, and /* */ for longer.

        System.out.print("hii");
        System.out.print("hellooi");// prints continuously doesn't go to new line
        System.out.println(2 + 3);

        // VARIABLES
        int num1 = 1;
        int num2 = 3;
        int result = num1 + num2;
        System.out.println(result);

        // DATA TYPES ----
        // ----Primitive Data Types----
        // BYTE;SHORT;INT;LONG;FLOAT;DOUBLE;CHARACTER;BOOLEAN

        int myNum = 5; // Integer (whole number)
        System.out.println(myNum);

        float myFloatNum = 5.99f; // Floating point number
        System.out.println(myFloatNum);

        double myDouble = 2.7;
        System.out.println(myDouble);

        char myLetter = 'D'; // Character
        System.out.println(myLetter);

        boolean myBool = true; // Boolean
        System.out.println(myBool);

        String myText = "Hello"; // String
        System.out.println(myText);

        // literals
        int num3 = 0b101;
        System.out.println(num3);

        double num4 = 12e10;
        System.out.println(num4);

        char c = 'a';
        c++;
        System.out.println(c);

    }
}
