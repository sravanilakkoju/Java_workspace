package task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
        return "Employee{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}

public class ArrayList1Task {
    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();

        // Adding employees to the list
        employeeList.add(new Employee(103, "Alice Johnson", "HR"));
        employeeList.add(new Employee(101, "John Smith", "IT"));
        employeeList.add(new Employee(102, "Zack Taylor", "Marketing"));

        // Sort the list by employeeId using a custom Comparator
        Collections.sort(employeeList, (e1, e2) -> Integer.compare(e1.getEmployeeId(), e2.getEmployeeId()));

        System.out.println("Employees sorted by ID:");
        employeeList.forEach(System.out::println);
    }
}
