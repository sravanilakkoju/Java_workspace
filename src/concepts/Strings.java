package concepts;

public class Strings {
    public static void main(String[] args) {
        // Strings...
        // sequence of characters
        String name = "pinky";
        System.out.println(name);

        // string length...
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt.length());

        // .........String methods......
        String txt1 = "Hello World";
        System.out.println(txt1.toUpperCase()); // Outputs "HELLO WORLD"
        System.out.println(txt1.toLowerCase()); // Outputs "hello world"

        // Finding a Character in a String...
        String str1 = "Please locate where 'locate' occurs!";
        System.out.println(str1.indexOf("locate"));

        // charAt() - Returns the character at the specified index (position)
        String myStr = "Hello";
        char result = myStr.charAt(0);
        System.out.println(result);

        // Java String compareTo() Method
        // The compareTo() method compares two strings lexicographically
        // The comparison is based on the Unicode value of each character in the strings
        String myStr1 = "Hello";
        String myStr2 = "Hello";
        System.out.println(myStr1.compareTo(myStr2)); // Returns 0 because they are equal

        // concat() - Appends a string at the end of another string.
        String firstName = "John ";
        String lastName = "Doe";
        System.out.println(firstName.concat(lastName));

        // Adding numbers and strings
        // Java uses the + operator for both addition and concatenation.

        // Numbers are added. Strings are concatenated..
        int x = 10;
        int y = 20;
        int z = x + y; // z will be 30 (an integer/number)
        System.out.println(z);

        // Strings - Special Characters
        // The sequence \" inserts a double quote in a string:
        String txxt1 = "We are the so-called \"Vikings\" from the north.";
        System.err.println(txxt1);

        // The sequence \' inserts a single quote in a string:
        String txxt = "It\'s alright.";
        System.out.println(txxt);

        // The sequence \\ inserts a single backslash in a string:
        String txxt2 = "The character \\ is called backslash.";
        System.out.println(txxt2);
    }

}
