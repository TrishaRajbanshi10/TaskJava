// Write a method to swap two numbers using a temporary variable

public class Task7 {
    public static void main(String[] args) {
        int a = 5, b = 10;
        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swapping logic
        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}