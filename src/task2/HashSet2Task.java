package task2;

import java.util.HashSet;
import java.util.Set;

public class HashSet2Task {
    public static void main(String[] args) {

        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();

        // Add elements to the first HashSet
        setA.add(1);
        setA.add(2);
        setA.add(3);
        setA.add(4);
        setA.add(5);

        // Add elements to the second HashSet
        setB.add(4);
        setB.add(5);
        setB.add(6);
        setB.add(7);
        setB.add(8);

        // Display the original sets
        System.out.println("Set A: " + setA);
        System.out.println("Set B: " + setB);

        // union of setA and setB
        Set<Integer> unionSet = new HashSet<>(setA);
        unionSet.addAll(setB);
        System.out.println("\nUnion of Set A and Set B: " + unionSet);

        // intersection of setA and setB
        Set<Integer> intersectionSet = new HashSet<>(setA);
        intersectionSet.retainAll(setB);
        System.out.println("Intersection of Set A and Set B: " + intersectionSet);
    }
}