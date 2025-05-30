// Create a method to find the sum of the first n natural numbers
import java.util.Scanner;
public class Task9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        System.out.println("Sum of the first " + n + " natural numbers: " + findSum(n));
        input.close();
    }
        
    // Method to find the sum of the first n natural numbers
    public static int findSum(int n) {
        return n * (n + 1) / 2; // Using the formula: Sum = n * (n + 1) / 2
    }
}