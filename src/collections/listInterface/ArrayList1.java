package collections.listInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/*
 * An ArrayList is like a resizable array.
 * 
 * It is part of the java.util package and 
 * implements the List interface.
 * ---> The difference between a built-in array and an ArrayList in Java,
 * is that the size of an array cannot be modified 
 * (if you want to add or remove elements to/from an array,
 *  you have to create a new one)..
 * 
 * ---> While elements can be added and removed from an ArrayList whenever you want.
 */
public class ArrayList1 {
    public static void main(String[] args) {
        // creating an empty ArrayList
        ArrayList<String> list1 = new ArrayList<>();

        // adding elements
        list1.add("Pinky");
        // list1.add("madhu", "chinku"); error
        list1.add("apple");
        list1.add("mango");
        list1.add("banana");
        System.out.println(list1);

        // add an element at a specified position
        list1.add(2, "Sravani");
        System.out.println(list1);

        // Access an Element
        System.out.println(list1.get(3));

        // Change an Element
        list1.set(3, "medha");
        System.out.println(list1);

        // Remove an Element
        list1.remove(1); // by index
        list1.remove("banana"); // by element
        System.out.println(list1);

        // remove all the elements in the ArrayList
        list1.clear();
        System.out.println(list1);

        list1.add("Volvo");
        list1.add("BMW");
        list1.add("Ford");
        list1.add("Mazda");
        System.out.println(list1);

        // size of an arraylist
        System.out.println("the size of list1 is : " + list1.size());

        // Loop Through an ArrayList using for loop
        System.out.println("loop using for");
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }

        // loop through an ArrayList with the for-each loop:
        System.out.println("loop using for-each");
        for (String string : list1) {
            System.out.println(string);
        }

        // Iterator:
        System.out.println("loop using iterator:");
        Iterator<String> iterator = list1.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Stream API (Java 8+):
        System.out.println("loop using Stream API (Java 8+):");
        list1.stream().forEach(System.out::println);

        // Create an ArrayList to store numbers (add elements of type Integer):
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(0);
        list2.add(1);
        list2.add(0);
        list2.add(6);
        list2.add(9);
        list2.add(8);
        list2.add(70);
        System.out.println(list2);

        // Sort an ArrayList
        // the sort() method for sorting lists alphabetically or numerically:

        Collections.sort(list2);
        for (Integer integer : list2) {
            System.out.println(integer);
        }

        // contains(Object o): Returns true if the list contains the specified element.
        System.out.println(list2.contains(5));
        System.out.println(list2.contains(70));

        // indexOf(Object o): Returns the index of the first occurrence of the specified
        // element,
        // or -1 if the list does not contain it.
        System.out.println(list2.indexOf(70));
        System.out.println(list2.indexOf(7));
        // isEmpty(): Returns true if the list contains no elements.
        System.out.println(list1.isEmpty());
        list1.clear();
        System.out.println(list1.isEmpty());

        // toArray(): Returns an array containing all elements in the list.
        // Convert ArrayList to Array
        Object[] arrlist2 = list2.toArray();
        // Print the array using Arrays.toString()
        System.out.println(Arrays.toString(arrlist2));

        // Reversing: Use Collections.reverse() to reverse the order of elements.
        Collections.reverse(list2);
        System.out.println(list2);

        // Shuffling: Use Collections.shuffle() to randomize the order of elements.
        Collections.shuffle(list2);
        System.out.println(list2);

        // Finding Maximum/Minimum: Use Collections.max() and
        // Collections.min() to find the maximum and minimum elements.
        Integer max = Collections.max(list2);
        Integer min = Collections.max(list2);
        System.err.println(max);
        System.err.println(min);

        list1.add("Volvo");
        list1.add("BMW");
        list1.add("Ford");
        list1.add("Mazda");
        // list1.add("app");

        String maxstr = Collections.max(list1);
        String minstr = Collections.min(list1);
        System.err.println(maxstr);
        System.err.println(minstr);

        // Sublist: You can create a sublist from an ArrayList.
        List<Integer> subList = list2.subList(1, 4);
        System.out.println(subList);

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.addAll(0, list2); // added all the elements of list2
        list3.add(5689);
        list3.add(568);
        list3.add(56);
        list3.add(5);
        System.out.println(list3);

        // Retaining Elements: Use retainAll() to keep only the elements that are
        // contained in another collection.

        // Retain elements in list3 that are also in list2
        boolean modified = list3.retainAll(list2);
        // Print the result of retainAll
        System.out.println("Was list3 modified? " + modified); // true or false
        System.out.println("Modified list3: " + list3);

        // Removing All Elements: Use removeAll() to remove all elements that are
        // contained in another collection.
        list3.add(5689);
        list3.add(568);
        list3.add(56);
        list3.add(5);

        list3.removeAll(list2);
        System.out.println(list3);

    }

}
