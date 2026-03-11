package programs;

public class Lab_009 {

	    public static void main(String[] args) {

	        // Declare and initialize array
	        int[] numbers = {10, 20, 30, 40, 50};

	        // Print array elements using loop
	        System.out.println("Array elements are:");

	        for(int i = 0; i < numbers.length; i++) {
	            System.out.println(numbers[i]);
	        }

	        // Find sum of array elements
	        int sum = 0;

	        for(int num : numbers) {
	            sum = sum + num;
	        }

	        System.out.println("Sum of array elements: " + sum);
	    }
	}

