package collections.setInterface;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

/*
 * 🔰 1. What is LinkedHashSet?
            A Set implementation that maintains insertion order.
            Internally backed by a LinkedHashMap.
            Introduced in Java 1.4 (java.util package).
            Ensures that no duplicates are stored.
    🧱 2. Key Features
            Feature	                Description
            Ordering	            Maintains insertion order
            No Duplicates	        Like all Set implementations
            Null Allowed	        Yes (only one null)
            Thread-Safe	            ❌ Not synchronized
            Performance	            Similar to HashSet, slightly slower
            Internal Structure	    Hash table + Doubly Linked List
 */
public class LinkedHashSet1 {
    public static void main(String[] args) {

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Apple");
        lhs.add("Banana");
        lhs.add("Cherry");
        lhs.add("Apple"); // Ignored (duplicate)

        System.out.println(lhs); // Output: [Apple, Banana, Cherry]
        // ➡️ Duplicates are removed, order is preserved.

        // 🛠️ 4. Common Methods

        lhs.add("Mango"); // Add
        System.out.println("add : Mango " + lhs);
        lhs.remove("Banana"); // Remove
        System.out.println("remove: Banana " + lhs);
        // Check if present
        System.out.println("contains: Apple " + lhs.contains("Apple"));
        System.out.println("size : " + lhs.size()); // Get number of elements
        lhs.clear(); // Remove all elements
        System.out.println("cleared : " + lhs); // Get number of elements
        lhs.add("Apple");
        lhs.add("Banana");
        lhs.add("Cherry");
        lhs.add("Mango");
        System.out.println("elements added " + lhs);

        // 🔁 5. Iteration
        for (String string : lhs) {
            System.out.println(string);
            // ➡️ Prints elements in the order they were inserted.
        }

        // 🧪 11. Practical Example
        // ✅ Unique words in a sentence (preserving order)
        String sentence = "this is a sentence with repeated words is with repeated";
        String[] words = sentence.split(" ");
        for (String string : words) {
            System.out.print(string + " ");
        }
        System.out.println();
        Set<String> uniueSet = new LinkedHashSet<>(Arrays.asList(words));
        System.out.println(uniueSet);
    }

}
