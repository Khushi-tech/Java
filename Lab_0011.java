package programs;
import java.util.Scanner;
public class Lab_0011 {
	public static boolean isPalindrome(String str) {
	        // Step 1: Remove non-alphanumeric characters & convert to lowercase
	        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

	        // Step 2: Check palindrome using two pointers
	        int left = 0;
	        int right = cleaned.length() - 1;

	        while (left < right) {
	            if (cleaned.charAt(left) != cleaned.charAt(right)) {
	                return false;
	            }
	            left++;
	            right--;
	        }
	        return true;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();

	        if (isPalindrome(input)) {
	            System.out.println("It is a palindrome");
	        } else {
	            System.out.println("Not a palindrome");
	        }

	        scanner.close();
	    }
	}


