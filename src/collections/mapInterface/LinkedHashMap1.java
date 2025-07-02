package collections.mapInterface;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/*
 * 🔰 1. What is LinkedHashMap?
            LinkedHashMap is a Map implementation that 
            maintains insertion order or access order.
            It extends HashMap and uses a doubly-linked list to keep order.
            Part of java.util.

            🧱 2. Key Features
                    Feature	                    Description
                    Key uniqueness	            ✅ Keys must be unique
                    Value duplication	        ✅ Values can be duplicated
                    Null allowed	            ✅ One null key, many null values
                    Order	                    ✅ Maintains insertion or access order
                    Thread-safe	                ❌ Not synchronized
                    Backed by	                Hash table + doubly-linked list
 */
public class LinkedHashMap1 {
    public static void main(String[] args) {
        // ⚙️ 3. Basic Usage
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        map.put(1, "Apple");
        map.put(3, "Cherry");
        map.put(2, "Banana");

        System.out.println(map); // Output: {1=Apple, 3=Cherry, 2=Banana}
        // ➡️ Maintains insertion order.

        // 🔁 4. Iteration Order
        System.out.println("Iteration using Enhanced For Loop:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // Iterator
        System.out.println("Iteration using Iterator:");
        Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // ✅ Output will be in the order items were added.

        // keySet(): Returns a set view of the keys contained in the map.
        Set<Integer> keys = map.keySet();
        System.out.println("KeySet of map: " + keys);

        // values(): Returns a collection view of the values contained in the map.
        Collection<String> values = map.values();
        System.out.println("Values of map: " + values);

        // entrySet(): Returns a set view of the mappings contained in the map.
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        System.out.println(entries);

    }
}
