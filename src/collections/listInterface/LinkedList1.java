package collections.listInterface;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Iterator;

/*
 * 1. Introduction to LinkedList
        ✅ What is LinkedList?
            A class in java.util package.

            Implements both List and Deque interfaces.

            Can be used as a list, stack, or queue.

            Doubly Linked List implementation.
 */
public class LinkedList1 {

    public static void reversingElements() {
        LinkedList<String> cities = new LinkedList<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Bangalore");

        Iterator<String> desc = cities.descendingIterator();
        while (desc.hasNext()) {
            System.out.println(desc.next());
        }
    }

    public static void stackBehavior() {
        LinkedList<Integer> stack = new LinkedList<>();
        stack.push(10);
        stack.push(20);
        System.out.println(stack.pop()); // 20
        System.out.println(stack); // 20

    }

    public static void queueBehavior() {
        LinkedList<String> queue = new LinkedList<>();
        queue.offer("A");
        queue.offer("B");
        System.out.println(queue.poll()); // A
        System.out.println(queue); // A

    }

    public static void main(String[] args) {
        // ✅ Basic Declaration

        LinkedList<String> listStr = new LinkedList<>();
        LinkedList<Integer> listInt = new LinkedList<>();
        listInt.add(11);
        listInt.add(110);
        listInt.add(101);
        listInt.add(311);
        listInt.add(141);
        listInt.add(921);

        // 🔄 2. Basic Operations

        // ➕ Add Elements
        listStr.add("App");
        listStr.addFirst("Apple");
        listStr.addLast("Web Site");
        listStr.add(1, "Google");
        System.out.println(listStr);

        // ❌ Remove Elements

        listStr.remove(); // remove first
        listStr.remove(2); // remove at index
        listStr.remove("Apple"); // remove by value
        listStr.removeFirst();
        listStr.removeLast();
        System.out.println(listStr);

        listStr.add("App");
        listStr.add("Apple");
        listStr.add("Application");
        listStr.add("Approve");
        listStr.add("process");
        listStr.add("Allow");

        // 🔎 Access Elements
        System.err.println(listStr.get(0)); // get element at index
        System.out.println(listStr.getFirst()); // get first
        System.out.println(listStr.getLast()); // get last

        // 🎯 Check Elements
        System.out.println("contains - Aple ? " + listStr.contains("Aple"));
        System.out.println("indexOf - process = " + listStr.indexOf("process"));
        System.out.println("indexOf - pr = " + listStr.indexOf("pr"));
        System.out.println("size of liststr: " + listStr.size());
        System.out.println("isEmpty ? " + listStr.isEmpty());

        // 🧱 3. Iteration Techniques

        // 1. Enhanced for loop
        System.out.println("Iteration using for each loop");
        for (Integer integer : listInt) {
            System.out.println(integer);
        }
        System.out.println("Iteration using for each loop");
        for (String str : listStr) {
            System.out.println(str);
        }

        // 2. For loop
        System.out.println("iteration using for loop");
        for (int i = 0; i < listInt.size(); i++) {
            System.out.println(listInt.get(i));
        }

        // 3. Iterator
        System.out.println("loop using iterator");
        Iterator<String> it = listStr.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // 4. ListIterator (bi-directional)
        System.out.println("Iteration using ListIterator (bi-directional)");
        ListIterator<Integer> lit = listInt.listIterator();
        while (lit.hasNext()) {
            System.out.println(lit.next());
        }

        // 🧰 6. Important Methods

        System.out.println(listStr.peek()); // view first (null if empty)
        System.out.println(listStr.poll());// remove and return first
        System.out.println(listStr.offer("A")); // add at end
        listStr.push("A"); // add to stack (start)
        System.out.println(listStr);
        System.out.println(listStr.pop()); // remove from stack (start)
        System.out.println(listStr);

        reversingElements();
        stackBehavior();
        queueBehavior();
    }
}
