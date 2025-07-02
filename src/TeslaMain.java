/*
* Problem 3- 
* Create an interface Vehicle with method start().
* Create another interface Car that extends Vehicle and adds a method drive().
* Create a class Tesla that implements Car.
* (Hint: Interfaces can extend other interfaces.)
 */

//Create an interface Vehicle with method start().
interface Vehicle {
    public void start();
}

// Create another interface Car that extends
// Vehicle and adds a method drive().
interface Car extends Vehicle {
    public void drive();
}

class Tesla implements Car {
    // methods body is written
    public void start() {
        System.out.println("Start Method inside Tesla class");
    }

    public void drive() {
        System.out.println("Drive Method inside Tesla class");
    }
}

public class TeslaMain {

    public static void main(String[] args) {
        // creating obj for Tesla class
        Tesla Tes = new Tesla();
        Tes.start(); // start() methid call
        Tes.drive(); // drive() method call
    }
}