package collections.queueInterface;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueuePriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        // Adding elements to the PriorityQueue
        priorityQueue.add(5);
        priorityQueue.add(1);
        priorityQueue.add(3);
        priorityQueue.add(2);
        priorityQueue.add(4);

        // Displaying the PriorityQueue
        System.out.println("PriorityQueue: " + priorityQueue);

        // Accessing the head of the PriorityQueue
        System.out.println("Head of the queue: " + priorityQueue.peek());

        // Removing elements from the PriorityQueue
        System.out.println("Removed: " + priorityQueue.remove());
        System.out.println("PriorityQueue after removal: " + priorityQueue);

        System.out.println("Removed uding poll: " + priorityQueue.poll());
        System.out.println("PriorityQueue after removal: " + priorityQueue);

        // Accessing the head of the PriorityQueue
        System.out.println("Head of the queue using element(): " + priorityQueue.element());

        // Iterating through the PriorityQueue
        System.out.println("Remaining elements in priority order:");
        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll()); // Retrieves and removes the head
        }

        // Adding elements to the PriorityQueue
        priorityQueue.add(5);
        priorityQueue.add(1);
        priorityQueue.add(3);
        priorityQueue.add(2);
        priorityQueue.add(4);
        System.out.println("elements added");

        // Iterating through the queue elements using iterator
        System.out.println("iterating the queue elements using iterator:");
        Iterator<Integer> itr = priorityQueue.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
