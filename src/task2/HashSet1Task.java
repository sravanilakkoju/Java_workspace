package task2;

import java.util.HashSet;
import java.util.Set;

public class HashSet1Task {

    public static boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9._#%+-]+@gmail\\.com$";

        Boolean check1 = email != null;
        Boolean check2 = email.matches(emailRegex);
        return check1 && check2;
    }

    public static void addEmail(Set<String> emailSet, String email) {
        if (isValidEmail(email)) {
            if (emailSet.add(email)) {
                System.out.println("Added: " + email);
            } else {
                System.out.println("Duplicate: " + email);
            }
        } else {
            System.out.println("Invalid email format: " + email);
        }
    }

    public static void main(String[] args) {
        // Create a HashSet to store email addresses
        Set<String> emailSet = new HashSet<>();

        // Add some email addresses (including duplicates)
        addEmail(emailSet, "riya.d@gmail.com");
        addEmail(emailSet, "jaggruthi.sri@gmail.com");
        addEmail(emailSet, "pinky_12#29@gmail.com"); // Duplicate
        addEmail(emailSet, "ram@gmail.com");
        addEmail(emailSet, "    efrew1131425email"); // Invalid email
        addEmail(emailSet, "_Hari_ram_1_#%@gmail.com");

        System.out.println("\n ## " + emailSet.size() + " Valid Email Addresses:");
        for (String email : emailSet) {
            System.out.println(" >> " + email);
        }
    }

}
