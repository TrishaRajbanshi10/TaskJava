// Create a method to calculate the cube of a given number
import java.util.Scanner;
public class Task11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to calculate its cube: ");
        int number = input.nextInt();
        input.close();
        System.out.println("Cube of " + number + " is: " + calculateCube(number));
    }

    // Method to calculate the cube of a given number
    public static int calculateCube(int num) {
        return num * num * num;
    }
}
