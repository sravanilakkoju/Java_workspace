package task2;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TreeMap1Task {
    public static void main(String[] args) {
        TreeMap<String, String> countryCapitalMap = new TreeMap<>();

        countryCapitalMap.put("USA".toUpperCase(), "Washington, D.C.");
        countryCapitalMap.put("France".toUpperCase(), "Paris");
        countryCapitalMap.put("Germany".toUpperCase(), "Berlin");
        countryCapitalMap.put("India".toUpperCase(), "New Delhi");
        countryCapitalMap.put("Japan".toUpperCase(), "Tokyo");
        countryCapitalMap.put("Brazil".toUpperCase(), "Brasília");
        countryCapitalMap.put("Canada".toUpperCase(), "Ottawa");

        System.out.println("Countries available: ");
        for (Map.Entry<String, String> country : countryCapitalMap.entrySet()) {
            System.out.println(">> " + country.getKey());
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter a country name: ");
        String country = scanner.nextLine().toUpperCase().trim();

        String capital = countryCapitalMap.get(country);

        if (capital != null) {
            System.out.println("Capital of " + country + ": " + capital.toUpperCase());
        } else {
            System.out.println("Country not found! Try again.");
        }
        scanner.close();
    }
}
