package oopsConcepts;

class OuterClass {
    int x = 10;

    // Static Inner Class
    static class InnerClass {
        int y = 5;
        OuterClass obj = new OuterClass();

        InnerClass() {
            System.out.println("constructor of Innerclass is called..");
            System.out.println("Outer Class x : " + obj.x);
        }
    }
}

class OuterClass2 {
    int x = 10;

    static class InnerClass2 {
        // can access outer class elements
        int y = 5;
    }
}

public class InnerClasses {

    public static void main(String[] args) {

        // Static Inner Class
        OuterClass.InnerClass myInner = new OuterClass.InnerClass();
        System.out.println("InnerClass y : " + myInner.y);

        // default classes
        // Access Outer Class From Inner Class
        OuterClass2.InnerClass2 myInner2 = new OuterClass2.InnerClass2();
        System.out.println("myInner2.y = " + myInner2.y);
    }
}
