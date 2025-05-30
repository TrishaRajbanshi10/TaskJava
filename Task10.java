// Write a method to print all factors of a number
import java.util.Scanner;
public class Task10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        System.out.println("Factors of " + number + ":");
        printFactors(number);
        input.close();
    }

    // Method to print all factors of a number
    public static void printFactors(int num) {
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
