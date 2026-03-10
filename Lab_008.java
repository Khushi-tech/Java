package programs;

public class Lab_008{

    // Method without return value
    public static void greetUser() {
        System.out.println("Hello Khushi, welcome to Java practice!");
    }

    // Method with return value
    public static int addNumbers(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        // Calling method
        greetUser();

        int result = addNumbers(10, 20);
        System.out.println("Addition result: " + result);
    }
}


