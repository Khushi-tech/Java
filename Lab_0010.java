package programs;


public class Lab_0010 {

    public static void main(String[] args) {

        String name = "Khushi";

        // Print original string
        System.out.println("Original String: " + name);

        // Length of string
        System.out.println("Length: " + name.length());

        // Convert to uppercase
        System.out.println("Uppercase: " + name.toUpperCase());

        // Convert to lowercase
        System.out.println("Lowercase: " + name.toLowerCase());

        // Check if string contains a letter
        System.out.println("Contains 's': " + name.contains("s"));

        // Compare two strings
        String name2 = "Khushi";
        System.out.println("Strings equal: " + name.equals(name2));

        // Get character at index
        System.out.println("Character at index 2: " + name.charAt(2));
    }
}