package oopsConcepts;

/*
 * Static vs. Public
 * 
 * --> we created a static method, which means that it can be accessed 
 *  without creating an object of the class
 * -->public, which can only be accessed by objects:
 */

public class Methods {
    Integer number = 1;

    public static void main(String[] args) {
        myMethod();
        Method2.myStaticMethod();
        Methods mObj = new Methods();
        // creating object for inner class
        Methods.Method2 m2Obj = mObj.new Method2();
        m2Obj.myPublicMethod();
        System.out.println("no: " + mObj.number + " Name : " + m2Obj.name);
    }

    static void myMethod() {
        System.out.println("Hello World!");
    }

    // Inner class
    public class Method2 {
        String name = "siri";

        static void myStaticMethod() {
            System.out.println(
                    "Static methods can be called without creating objects\n this is method inside class Method2");
        }

        public void myPublicMethod() {
            System.out.println(
                    "Public methods must be called by creating objects \n this is public class inside the Method2");
        }
    }
}
