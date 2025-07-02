package collections.mapInterface;

import java.util.HashMap;
import java.util.Map;

/*
 * 🔰 1. What is HashMap in Java?
            HashMap is a key-value pair data structure.
            Keys must be unique, but values can be duplicated.
            It's part of the java.util package.
            Not synchronized, so not thread-safe by default.
    🧱 2. Key Features
            Feature	                Details
            Ordering	            ❌ No order (random-like)
            Allows null key?	    ✅ Only one null key
            Allows null value?	    ✅ Any number of null values
            Duplicate keys?	        ❌ Overwrites value
            Underlying structure	Hash table (array + linked list or tree)
            Time complexity	        O(1) avg case (O(n) worst)
 */
public class HashMap1 {

    public static void wordCount() {
        String text = "java is easy java is powerful";
        String[] words = text.split(" ");

        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        System.out.println(wordCount);
        // Output: {java=2, is=2, easy=1, powerful=1}

    }

    public static void main(String[] args) {
        // ⚙️ 3. Basic Operations
        HashMap<String, String> map = new HashMap<>();

        map.put("name", "Alice");
        map.put("city", "Delhi");
        map.put("Age", "56");
        map.put("working", "yes");
        System.out.println(map);

        System.out.println(map.get("name")); // Alice
        map.remove("city"); // removes "Delhi"
        System.out.println("City Removed: " + map);

        System.out.println("containsKey:name " + map.containsKey("name"));// true
        System.out.println("containsValue:Alice " + map.containsValue("Alice")); // true
        System.out.println("size: " + map.size()); // number of entries
        map.clear(); // empties the map
        System.out.println("After clear() " + map);
        map.put("name", "Alice");
        map.put("city", "Delhi");
        map.put("Age", "56");
        map.put("working", "yes");
        // 🔁 4. Iteration Techniques
        // ✅ Using entrySet() (Best)
        System.out.println("Iteration Using entrySet() (Best)");
        for (Map.Entry<String, String> enytry : map.entrySet()) {
            System.out.println(enytry.getKey() + " : " + enytry.getValue());
        }

        // ✅ Using keySet()
        System.out.println("Iteration Using keySet()");

        for (String key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }
        // If two keys hash to the same index → collision → chaining happens.
        // 🔍 6. Example
        HashMap<Integer, String> map1 = new HashMap<>();
        map1.put(101, "Ram");
        map1.put(102, "Shyam");
        map1.put(101, "Ravi"); // Overwrites value

        System.out.println(map1); // {101=Ravi, 102=Shyam}
        // 🧪 7. Null Key and Values
        map1.put(null, "one"); // allowed
        map1.put(null, "two"); // overwrites previous
        map1.put(1, null); // allowed
        // ➡️ Only one null key allowed, many null values allowed.
        System.out.println(map1);

        // Word frequency counter (word → count)
        wordCount();
    }
}
