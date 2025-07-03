package oopsConcepts;

abstract class Bank {
    abstract int getRateOfInterest();
}

class SBI extends Bank {
    int getRateOfInterest() {
        return 7;
    }
}

class PNB extends Bank {
    int getRateOfInterest() {
        return 8;
    }
}

// Abstract Class: Having Constructor, Data Member and Methods
abstract class Bike {
    Bike() {
        System.out.println("bike is created");
    }

    abstract void run();

    void changeGear() {
        System.out.println("gear changed");
    }
}

// Creating a Child class which inherits Abstract class
class Honda extends Bike {
    void run() {
        System.out.println("running safely..");
    }
}

public class Abstraction2 {
    public static void main(String args[]) {
        Bank b;
        b = new SBI();
        System.out.println("Rate of Interest is: " + b.getRateOfInterest() + " %");
        b = new PNB();
        System.out.println("Rate of Interest is: " + b.getRateOfInterest() + " %");

        Bike obj = new Honda();
        obj.run();
        obj.changeGear();
    }
}
