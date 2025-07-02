package collections;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * Java Iterator
        An Iterator is an object that can be used to loop through 
        collections, like ArrayList and HashSet.
        It is called an "iterator" because "iterating" is the technical term for looping.
        To use an Iterator, you must import it from the java.util package.


 */
public class Iterator1 {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        // get the iterator
        Iterator<String> carIt = cars.iterator();
        // Print the first item
        // System.out.println(carIt.next());
        // System.out.println();
        // Looping Through a Collection
        while (carIt.hasNext()) {
            System.out.println(carIt.next());
        }

        // Remove()
        ArrayList<Integer> arrlt = new ArrayList<>();
        arrlt.add(1);
        arrlt.add(12);
        arrlt.add(21);
        arrlt.add(315);
        arrlt.add(51);

        Iterator<Integer> it2 = arrlt.iterator();
        while (it2.hasNext()) {
            Integer i = it2.next();
            if (i < 10) {
                it2.remove();
            }
        }
        System.out.println(arrlt);

        // Note: Trying to remove items using a for loop or a for-each loop would not
        // work correctly because the collection is changing size at the same time that
        // the code is trying to loop.
    }
}
