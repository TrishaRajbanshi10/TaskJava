// Create a method to check whether a given number is a palindrome prime

public class Task6 {
    public static void main(String[] args) {
        int number = 131; 
        if (isPalindromePrime(number)) {
            System.out.println(number + " is a palindrome prime.");
        } else {
            System.out.println(number + " is not a palindrome prime.");
        }
    }

    // Method to check if a number is a palindrome prime
    public static boolean isPalindromePrime(int num) {
        return isPrime(num) && isPalindrome(num);
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // Method to check if a number is a palindrome
    public static boolean isPalindrome(int num) {
        int original = num, reversed = 0;
        while (num > 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        return original == reversed;
    }
}
