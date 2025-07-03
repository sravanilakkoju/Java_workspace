package oopsConcepts;

interface Printable {
    void print();
}

interface Showable {
    void show();
}

class Computer implements Printable, Showable {
    public void print() {
        System.out.println("This Computer Prints");
    }

    public void show() {
        System.out.println("This is showable computer");
    }
}

public class MultipleInterface1 {
    public static void main(String[] args) {
        Computer cp = new Computer();
        cp.print();
        cp.show();
    }
}
