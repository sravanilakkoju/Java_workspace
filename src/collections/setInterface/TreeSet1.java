package collections.setInterface;

import java.util.Comparator;
import java.util.TreeSet;

/*
 * 🌲 1. What is TreeSet in Java?
        TreeSet is a NavigableSet that uses a Red-Black 
        Tree (self-balancing BST) to store elements in 
        sorted order.

        Belongs to the java.util package.

        Implements Set, SortedSet, and NavigableSet.
 *  ⚙️ 2. Key Features
            Feature	            Description
            Order	            Sorted (natural or custom)
            Duplicates	        Not allowed
            Nulls	            Not allowed (throws NullPointerException)
            Thread Safety	    Not synchronized
            Performance	        O(log n) for add, remove, search
            Internal Structure	Red-Black Tree
 */
public class TreeSet1 {
    public static void main(String[] args) {
        // 📦 3. Creating a TreeSet

        // 🔹 Natural Ordering
        TreeSet<Integer> set = new TreeSet<>();
        set.add(100);
        set.add(56);
        set.add(756);
        set.add(566);
        set.add(956);
        set.add(1);
        set.add(2);
        set.add(5);
        set.add(0);
        // set.add(null);
        System.out.println(set);

        // 🔹 Custom Comparator
        TreeSet<String> set1 = new TreeSet<>((a, b) -> b.compareTo(a)); // descending order
        set1.add("Apple");
        set1.add("Banana");
        set1.add("cool cake");
        set1.add("app");
        set1.add("eagle");

        System.out.println(set1); // [eagle, cool cake, app, Banana, Apple]

        Integer x = 5;
        // 🧰 4. Useful Methods

        set.add(x); // Add element
        System.out.println("Add element " + set);

        set.remove(x); // Remove element
        System.out.println("Remove element " + set);

        // Check presence
        System.out.println("Check presence " + set.contains(x));

        set.add(x); // Add element
        System.out.println("Add " + set);

        // Get smallest
        System.out.println("Get smallest " + set.first());

        // Get largest
        System.out.println("Get largest " + set.last());

        // Smallest >= x
        System.out.println("Smallest >= x " + set.ceiling(x));

        // Largest <= x
        System.out.println("Largest <= x " + set.floor(x));

        // Largest < x
        System.out.println("Largest < x " + set.lower(x));

        // Smallest > x
        System.out.println("Smallest > x " + set.higher(x));

        System.out.println(" Remove and return first " + set.pollFirst()); // Remove and return first
        System.out.println(set);

        System.out.println("Remove and return last " + set.pollLast()); // Remove and return last
        System.out.println(set);
        // 💥 6. TreeSet with Custom Class

        // To use custom objects, override compareTo() or use a custom Comparator.
        // ✅ Using Comparable

        System.out.println("Using Comparable");
        class Person implements Comparable<Person> {
            int id;
            String name;

            public Person(int id, String name) {
                this.id = id;
                this.name = name;
            }

            public int compareTo(Person p) {
                return Integer.compare(this.id, p.id);
            }
        }
        TreeSet<Person> people = new TreeSet<>();
        people.add(new Person(2, "Ram"));
        people.add(new Person(1, "Shyam"));
        people.add(new Person(3, "Aadhi"));

        for (Person p : people) {
            System.out.println(p.id + " " + p.name);
        }
        // ✅ Using Comparator
        System.out.println("Using Comparator");
        TreeSet<Person> people1 = new TreeSet<>(Comparator.comparing(p -> p.name));
        people1.add(new Person(2, "Ram"));
        people1.add(new Person(1, "Shyam"));
        people1.add(new Person(3, "Aadhi"));

        for (Person p : people1) {
            System.out.println(p.id + " " + p.name);
        }
    }
}
