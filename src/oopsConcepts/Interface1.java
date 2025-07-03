package oopsConcepts;

//Creating an interface  
interface Speech {
    void speak();
}

// Creating a class that implements Printable
class Person implements Speech {
    public void speak() {
        System.out.println("Hello Everyone im the person to speek");
    }
}

// Creating an interface
interface Drawable {
    void draw();
}

// Implementation of Interface
class Rectangle implements Drawable {
    public void draw() {
        System.out.println("drawing rectangle");
    }
}

class Circle implements Drawable {
    public void draw() {
        System.out.println("drawing circle");
    }
}
// Using interface

// Creating a class that creates objects and call methods
public class Interface1 {
    public static void main(String args[]) {
        Speech p = new Person();
        p.speak();

        Drawable d = new Circle();
        // In real scenario, object is provided by
        // method e.g. getDrawable()
        d.draw();
    }
}
