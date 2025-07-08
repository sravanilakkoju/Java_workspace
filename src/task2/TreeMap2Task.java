package task2;

import java.util.TreeMap;

public class TreeMap2Task {
    public static void main(String[] args) {
        String sentence = "Cat mat fat rat yard Dog cat cat rat elephant yard";

        TreeMap<String, Integer> wordFrequency = new TreeMap<>();

        // Convert the sentence to lowercase, remove punctuation, and split into words
        String[] words = sentence.toLowerCase().split(" ");

        for (String word : words) {
            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
        }

        System.out.println("Word Frequencies:");
        wordFrequency.forEach((word, count) -> System.out.println(" >> " + word + " : " + count));
    }
}
