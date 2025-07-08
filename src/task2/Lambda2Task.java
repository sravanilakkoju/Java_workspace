package task2;

import java.util.ArrayList;
import java.util.List;

class Student {
    private int id;
    private String name;
    private int marks;

    public Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return ">>> " +
                "id=" + id +
                ", name='" + name + '\'' +
                ", marks=" + marks;
    }
}

public class Lambda2Task {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(101, "Ram", 90));
        students.add(new Student(102, "Sita", 96));
        students.add(new Student(103, "Krishna", 90));
        students.add(new Student(104, "Arjun", 68));
        students.add(new Student(105, "Radha", 95));
        students.add(new Student(107, "Balaram", 80));

        System.out.println("Before sorting:");
        students.forEach(System.out::println);

        students.sort((s1, s2) -> Integer.compare(s2.getMarks(), s1.getMarks()));

        System.out.println("After sorting by markes:");
        students.forEach(System.out::println);

        students.sort((s1, s2) -> Integer.compare(s1.getId(), s2.getId()));
        System.out.println("After sorting by ID:");
        students.forEach(System.out::println);

    }
}
