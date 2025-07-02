package collections.setInterface;

import java.util.HashSet;
import java.util.Iterator;

/*
 * 🔰 1. What is the Set Interface?
            ✅ Definition
            A collection that cannot contain duplicate elements.

            Models the mathematical set abstraction.

            Part of the java.util package.

            ✅ Key Implementations
            HashSet – Unordered, backed by a hash table.

            LinkedHashSet – Maintains insertion order.

            TreeSet – Sorted set using red-black tree.
 * 
 */
public class HashSet1 {
    /*
     * 🧱 2. What is a HashSet?
     * ✅ Features
     * Implements Set using a hash table.
     * No duplicates allowed.
     * No guaranteed order.
     * Allows null (only one).
     * Not synchronized.
     */
    public static void main(String[] args) {
        // ✅ Declaration
        HashSet<String> set1 = new HashSet<>();

        // 🔄 3. Basic Operations
        // ➕ Add Elements

        set1.add("Apple");
        set1.add("Berrys");
        set1.add("fruit");
        set1.add("grapes");
        set1.add("Banana");
        set1.add("Apple"); // Ignored as duplicate
        System.out.print("the original set: " + set1);

        // ❌ Remove Elements
        set1.remove("Apple");
        System.out.print("\nmodified set: " + set1);
        set1.clear(); // Removes all elements
        System.out.print("\nmodified set: " + set1);
        set1.add("Apple");
        set1.add("Berrys");
        set1.add("fruit");
        set1.add("grapes");
        set1.add("Banana");

        // 🔍 Search
        System.out.println();
        System.out.println(set1.contains("Berrys"));
        System.out.println(set1.contains("gr"));

        // 📏 Size & Check
        System.out.println(set1.size());
        System.out.println(set1.isEmpty());

        // 🔁 4. Iteration
        // ✅ Enhanced for loop
        System.out.println("loop using Enhanced for loop");
        for (String item : set1) {
            System.out.println(item);
        }
        // ✅ Iterator
        System.out.println("loop using Iterator");
        Iterator<String> it = set1.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // 🛠️ 7. Important Methods

        HashSet<String> set2 = new HashSet<>();
        set2.add("456");
        set2.add("123");
        set2.add("456");
        // Union
        set2.addAll(set1);
        System.out.println("After Union: " + set2); // Should show elements from both sets

        // Intersection
        set2.retainAll(set1);
        System.out.println("After Intersection: " + set2); // Should show common elements

        // Difference
        set2.removeAll(set1);
        System.out.println("After Difference: " + set2); // Should show remaining elements in set2
        set2.add("456");
        set2.add("123");
        set2.add("456");
        // Iterating through set2
        Iterator<String> it2 = set2.iterator();
        while (it2.hasNext()) {
            System.out.println(it2.next());
        }

    }
}
