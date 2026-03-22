package programs;

public class Lab_0012 {

	    // Method with 2 parameters
	    public static int add(int a, int b) {
	        return a + b;
	    }

	    // Method with 3 parameters
	    public static int add(int a, int b, int c) {
	        return a + b + c;
	    }

	    // Method with double parameters
	    public static double add(double a, double b) {
	        return a + b;
	    }

	    public static void main(String[] args) {

	        // Calling overloaded methods
	        System.out.println("Sum of 2 numbers: " + add(20, 20));

	        System.out.println("Sum of 3 numbers: " + add(10, 20, 30));

	        System.out.println("Sum of double values: " + add(10.5, 20.5));
	    }
	}

