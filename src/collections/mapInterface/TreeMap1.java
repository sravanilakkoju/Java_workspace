package collections.mapInterface;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/*
 * 🌳 1. What is TreeMap in Java?
            TreeMap is a sorted map implementation.
            It stores key-value pairs in ascending key order by default.
            Part of the java.util package.
            Implements: NavigableMap, SortedMap, Map

            🧱 2. Key Features
                    Feature	                Description
                    Ordering	            ✅ Sorted by key (natural or custom)
                    Allows null key?	    ❌ No (throws NullPointerException)
                    Allows null values?	    ✅ Yes
                    Thread-safe?	        ❌ No
                    Internal structure	    ✅ Red-Black Tree (balanced binary search)
 */
public class TreeMap1 {
    public static void main(String[] args) {
        // 🧪 3. Basic Usage
        TreeMap<Integer, String> trMap = new TreeMap<>();
        trMap.put(1, "Pinky");
        trMap.put(2, "Sreya");
        trMap.put(3, "Tillu");
        trMap.put(4, "Chinku");
        trMap.put(5, "Mad");
        System.out.println(trMap);

        Integer key = 2;
        // 🔄 4. Common Methods
        trMap.put(key, "Two"); // Insert or update
        System.out.println("Get " + trMap.get(key)); // Get value
        trMap.remove(key); // Remove by key
        System.out.println("Containskey: 2 " + trMap.containsKey(key)); // Check if key exists
        System.out.println("Smallest key " + trMap.firstKey()); // Smallest key
        System.out.println("Largest Key " + trMap.lastKey()); // Largest key
        Integer k = 3;
        System.out.println("ceilingKey: 3 " + trMap.ceilingKey(k)); // Least key ≥ k
        System.out.println("floorKey : 3 " + trMap.floorKey(k)); // Greatest key ≤ k
        System.out.println("higherKey:3 " + trMap.higherKey(k)); // Least key > k
        System.out.println("lowerKey : 3 " + trMap.lowerKey(k)); // Greatest key < k

        // 🔁 5. Iterating a TreeMap
        // ✅ Using entrySet()
        for (Map.Entry<Integer, String> entry : trMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        // ➡️ Entries come out in sorted key order.

        // 🧠 6. Custom Sorting with Comparator
        TreeMap<String, Integer> customMap = new TreeMap<>(Comparator.reverseOrder());

        customMap.put("Banana", 1);
        customMap.put("Apple", 2);
        customMap.put("Cherry", 3);

        System.out.println(customMap); // {Cherry=3, Banana=1, Apple=2}
        // ➡️ Sorted by descending key order.

        // 📊 10. Real-world Example: Student Scores
        System.out.println("📊 10. Real-world Example: Student Scores");
        TreeMap<Integer, String> scores = new TreeMap<>();

        scores.put(90, "Alice");
        scores.put(85, "Bob");
        scores.put(92, "Charlie");

        System.out.println("Topper: " + scores.lastEntry()); // 92=Charlie
        System.out.println("Lowest Score: " + scores.firstEntry()); // 85=Bob

        // 🧩 11. Sorted Map of Custom Objects
        class Employee {
            private int employeeId;
            private String name;
            private String department;

            public Employee(int employeeId, String name, String department) {
                this.employeeId = employeeId;
                this.name = name;
                this.department = department;
            }

            public int getEmployeeId() {
                return employeeId;
            }

            @Override
            public String toString() {
                return name + " (ID: " + employeeId + ", Dept: " + department + ")";
            }
        }
        // TreeMap with custom Comparator: sort by employeeId
        TreeMap<Employee, Double> employeeSalaryMap = new TreeMap<>(
                (e1, e2) -> Integer.compare(e1.getEmployeeId(), e2.getEmployeeId()));

        // Adding employee data
        employeeSalaryMap.put(new Employee(102, "Alice", "HR"), 75000.0);
        employeeSalaryMap.put(new Employee(101, "Bob", "IT"), 80000.0);
        employeeSalaryMap.put(new Employee(103, "Charlie", "Finance"), 72000.0);

        // Iterating and displaying entries
        for (Map.Entry<Employee, Double> entry : employeeSalaryMap.entrySet()) {
            System.out.println(entry.getKey() + " → Salary: $" + entry.getValue());
        }
    }
}
