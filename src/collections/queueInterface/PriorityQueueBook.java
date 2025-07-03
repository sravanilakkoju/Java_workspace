package collections.queueInterface;

import java.util.*;

// To add user-defined objects in PriorityQueue,
// you need to implement Comparable interface
class Book implements Comparable<Book> {
    int id;
    String name, author, publisher;
    int quantity;

    // Constructor to initialize Book object
    public Book(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }

    // compareTo method to compare Books based on 'id'
    public int compareTo(Book book) {
        return Integer.compare(this.id, book.id); // Simplified comparison
    }
}

public class PriorityQueueBook {
    public static void main(String[] args) {
        // Creating a PriorityQueue to store Book objects
        Queue<Book> queue = new PriorityQueue<Book>();

        // Creating Book objects
        Book b1 = new Book(121, "Let us C", "Yashwant Kanetkar", "BPB", 8);
        Book b2 = new Book(233, "Operating System", "Galvin", "Wiley", 6);
        Book b3 = new Book(101, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);

        // Adding Book objects to the queue
        queue.add(b1);
        queue.add(b2);
        queue.add(b3);

        // Displaying the elements of the queue in ascending order
        System.out.println("Books in ascending order based on ID:");
        // Displaying the elements of the queue
        for (Book b : queue) {
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
        }

        // Removing the head of the queue
        queue.remove();
        // Displaying the elements of the queue after removing one element
        System.out.println("After removing one book record:");
        for (Book b : queue) {
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
        }
    }
}
