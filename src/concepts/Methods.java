package concepts;

/*A method is a block of code which only runs when it is called.

* You can pass data, known as parameters, into a method.
* Methods are used to perform certain actions, and they are also known as functions.
* Why use methods? To reuse code: define the code once, and use it many times.
*/
public class Methods {

    static void greet() {
        System.out.println("Hii hello Namastee ");
    }

    // Parameters and Arguments

    // single parameter
    // "name" is a parameter
    static void greet1(String name) {
        System.out.println("Hii hello Namastee " + name);
    }

    // Multiple Parameters..
    static void greet2(String name, int age) {
        System.out.println(name + " is " + age + " Years old.");
    }

    // A Method with If...Else
    static void checkAge(int age) {
        if (age < 18) {
            System.out.println("Access denied");
        } else {
            System.out.println("Access granted");
        }
    }

    // Return Values...
    static int powerInt(int x) {
        return x * x * x; // x to the power of 3
    }

    static float sumNums(int x, float y) {
        return x + y;
    }

    public static void main(String[] args) {

        greet();

        greet1("Pinky");// calling a method
        greet1("Liam");// calling a method
        greet1("Anja");// calling a method
        // Liam, Pinky and Anja are arguments.

        // passing multiple arguments..
        greet2("pinky", 22);

        checkAge(32);
        checkAge(12);

        System.out.println(powerInt(2));
        System.out.println(sumNums(3, 6.99f));
        float d = sumNums(9, 8.23f);
        System.out.println("the value stored in d is:" + d);
    }
}
