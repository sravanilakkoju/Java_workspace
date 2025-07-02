package oopsConcepts;

public class Attributes1 {
    int x = 5;
    final int y = 3;// Another term for class attributes is fields.
    String fname = "John";
    String lname = "Doe";
    int age = 24;

    public static void main(String[] args) {

        // Accessing Attributes
        Attributes1 atObj = new Attributes1();
        System.out.println("X : " + atObj.x);

        // Modify Attributes
        atObj.x = 56;// override
        System.out.println("now x is : " + atObj.x);
        System.out.println("y : " + atObj.y);
        // atObj.y = 5;//error as we use final

        // Multiple Objects
        Attributes1 myObj1 = new Attributes1(); // Object 1
        Attributes1 myObj2 = new Attributes1(); // Object 2
        myObj2.x = 25;
        System.out.println(myObj1.x); // Outputs 5
        System.out.println(myObj2.x); // Outputs 25

        // Multiple Attributes
        Attributes1 myObj = new Attributes1();
        System.out.println("Name: " + myObj.fname + " " + myObj.lname);
        System.out.println("Age: " + myObj.age);
    }
}
