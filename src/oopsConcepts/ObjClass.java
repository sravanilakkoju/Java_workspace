package oopsConcepts;

/*
 * --->> Object-Oriented Programming is about creating
 *  objects that contain both data and methods
 * Classes and objects are the two main aspects of object-oriented programming
 *  a class is a template for objects, and an object is an instance of a class.
 * When the individual objects are created, they inherit all the variables and methods from the class.
 */

//Using Multiple Classes

public class ObjClass {
    int i = 10; // objClass variable.

    public static void main(String[] args) {
        ObjClass obj1 = new ObjClass();
        System.out.println(obj1.i);

        // second class method calling
        ObjClass2.objmethod();
        // Multiple Objects
        ObjClass obj2 = new ObjClass();// Object 2
        System.out.println(obj2.i);

    }

    // Using Multiple Classes
    public class ObjClass2 {
        public static void objmethod() {
            ObjClass obj3 = new ObjClass();
            obj3.i = 23; // this doesnot change the value globally
            System.out.println(obj3.i);
        }

    }
}
