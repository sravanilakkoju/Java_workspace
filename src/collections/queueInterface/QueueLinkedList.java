package collections.queueInterface;

import java.util.LinkedList;
import java.util.Queue;

/*1. What is the Queue Interface?
    The Queue interface in Java is a part of the Java Collections
    Framework and represents a collection designed for holding
    elements prior to processing. It is typically used to 
    implement data structures that follow the First-In-First-Out
    (FIFO) principle, where elements are added at one end 
    (the tail) and removed from the other end (the head).
 * 
 * Key Characteristics of the Queue Interface
    FIFO Order: Elements are processed in the order they were added.
    Null Elements: Some implementations may allow null elements,
    while others may not.
    Blocking Operations: Some queue implementations support
    blocking operations, which can be useful in concurrent programming.
 */
public class QueueLinkedList {
    public static void main(String[] args) {
        // Create a Queue using LinkedList
        Queue<String> queue = new LinkedList<>();

        // Adding elements to the queue
        queue.add("Task 1");
        queue.add("Task 2");
        queue.add("Task 3");

        // Displaying the queue
        System.out.println("Queue: " + queue);

        // Accessing the head of the queue
        System.out.println("Head of the queue: " + queue.peek());

        // Removing elements from the queue
        System.out.println("Removed: " + queue.remove());
        System.out.println("Queue after removal: " + queue);

        // Iterating through the queue
        System.out.println("Remaining tasks:");
        for (String task : queue) {
            System.out.println(task);
        }

        // ✅ LinkedList as Queue
        // FIFO behavior

        // Supports null

        // Not thread-safe
    }
}
