package task2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set2Task {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();

        // adding
        System.out.println("Adding Elements into Set..");
        set1.add("Java");
        set1.add("Python");
        set1.add("JavaScript");
        set1.add("C++");
        set1.add("Java");

        System.out.println("HashSet after adding elems: " + set1);

        // Removing
        System.out.println("\nRemoving Elements");
        set1.remove("C++");
        System.out.println("After removing C++: " + set1);

        // Iterate
        System.out.println("\nIterating");

        System.out.println("Method 1: For-each loop");
        for (String ele : set1) {
            System.out.println(" >> " + ele);
        }

        System.out.println("\nMethod 2: Using Iterator");
        Iterator<String> iterator = set1.iterator();

        while (iterator.hasNext()) {
            System.out.println(" >> " + iterator.next());
        }

        // Check if element exists
        System.out.println("\nCheck if element exists..");
        System.out.println(set1.contains("Java"));
        System.out.println(set1.contains("r"));
    }

}
