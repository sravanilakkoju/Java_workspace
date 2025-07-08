package task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList2Task {
    public static void main(String[] args) {

        List<String> items = new ArrayList<>();
        items.add("Apple");
        items.add("Banana");
        items.add("Cherry");
        items.add("Date");
        items.add("Strawberry");

        System.out.println("Original ArrayList:");
        System.out.println(items);

        // Reverse the ArrayList
        Collections.reverse(items);

        System.out.println("\nReversed ArrayList:");
        System.out.println(items);
    }
}
