package task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List2Task {
    public static void main(String[] args) {
        // Create
        List<Integer> numbers = new ArrayList<>();
        // Add
        numbers.add(42);
        numbers.add(17);
        numbers.add(23);
        numbers.add(8);
        numbers.add(15);
        numbers.add(4);

        // original list
        System.out.println("Original List: " + numbers);

        // ascending order
        Collections.sort(numbers);
        System.out.println("Sorted in Ascending Order: " + numbers);

        // descending order
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println("Sorted in Descending Order: " + numbers);
    }
}
