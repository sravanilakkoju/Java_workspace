package task2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda1Task {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

        // Filter even numbers using a lambda expression
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("Even numbers:");
        evenNumbers.forEach(System.out::println);
    }
}
