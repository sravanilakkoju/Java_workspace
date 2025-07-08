package task2;

import java.util.ArrayList;
import java.util.List;

public class List1Task {
    public static void main(String[] args) {
        // Create a list to store books
        List<String> books = new ArrayList<>();

        // 1. Add
        System.out.println("// 1. Add");
        books.add("book 1");
        books.add("book 2");
        books.add("book 3");
        books.add("book 4");
        books.add("book 5");
        books.add("book 6");
        System.out.println("Initial List: " + books);
        System.out.println();

        // 2. Remove
        System.out.println("// 2. Remove");
        books.remove("book 6");
        System.out.println("Updated List: " + books);
        System.out.println();

        // 3. Update
        System.out.println("// 3. Update");
        books.set(3, "book 33");
        System.out.println("Updated List: " + books);
        System.out.println();

        // 4. Search
        System.out.println("// 4. Search");
        System.out.println(books.contains("book 5") ? "book 5 is there!!" : "book 5 is Not there");
        System.out.println(books.contains("book 55") ? "book 55 is there!!" : "book 55 is Not there");
        System.out.println();

        // 5. Iterate
        System.out.println("// 5. Iterate");
        System.out.println("All Books:");
        for (String book : books) {
            System.out.println(" >> " + book);
        }
        System.out.println();
        // 6. Clear all
        System.out.println("// 6. Clear all");
        books.clear();
        System.out.println("Is list empty? " + books.isEmpty());
    }
}