package oopsConcepts;

/*
 * Abstraction in Java
        Abstraction is a process of hiding the implementation 
        details and showing only functionality to the user.

        Another way, it shows only essential things to the 
        user and hides the internal details, for example, 
        sending SMS where we type the text and send the message. We do not know the internal processing about the message delivery.

        Abstraction lets you focus on what the object does instead of how it does it.
    >>Ways to achieve Abstraction
        Using Abstract Class (0 to 100%)
        Using Interface (100%)
*/
//Abstract class: is a restricted class that cannot be used to create objects 
//(to access it, it must be inherited from another class).
abstract class Animal {

    // Abstract method: can only be used in an abstract class, and it does not have
    // a body.The body is provided by the subclass (inherited from).
    public abstract void animalSound();

    public void sleep() {
        System.out.println("Zzz");
    }
}

// Subclass (inherit from Animal)
class Pig extends Animal {
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The pig says: wee wee");
    }
}

public class Abstraction1 {
    public static void main(String[] args) {
        Pig myPig = new Pig();// create a pig object
        myPig.animalSound();
        myPig.sleep();
    }
}
