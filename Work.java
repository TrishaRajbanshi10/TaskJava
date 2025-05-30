//Write a Java program to input your full name and print a greeting message.

// import java.util.Scanner;
// public class Work{
//     public static void main(String[]args){
//         Scanner input= new Scanner(System.in);

//         //take a input
//         System.out.print("Enter your full name: ");
//         String name= input.nextLine();

//         // print greating message 
//         System.out.println("Hello,"+name+"! Goodmorning.");

//         input.close();
//     }
// }


// //Take two numbers as input and print their sum, difference, product, and quotient.

// import java.util.Scanner;
// public class Work{
//     public static void main(String[]args){
//         Scanner input=new Scanner(System.in);

//         //take 2 number as a input
//         System.out.print("Enter first number: ");
//         double number= input.nextDouble();

//         System.out.println("Enter second number: ");
//         double num=input.nextDouble();

//         //using operators
//         System.out.println("Sum: "+(number+num));
//         System.out.println("difference: "+(number-num));
//         System.out.println("product: "+(number*num));

//         //for quotient
//         if (num !=0){
//             System.out.println("Quotient: "+(number/num));
//         }else{
//             System.out.println("Cannot divide by zero.");
//         }

//         input.close();

//     }
// }


// Write a program to check whether a given number is positive, negative, or zero using if-else.

// import java.util.Scanner;
// public class  Work{
//     public static void main(String[]args){
//         Scanner input=new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         double num=input.nextDouble();

//         if (num > 0){
//             System.out.println("The number is positive.");
//         }else if(num<0){
//             System.out.println("The number is negative.");
//         }else{
//             System.out.println("The number is zero.");
//         }

//         input.close();
//     }
// }



// Write a program that takes a number and checks if it is divisible by both 5 and 11.

// public class Work{
//     public static void main(String[]args){
//         int a=55;
//         if (a%5==0 && a%11==0){
//             System.out.print(a+" is  divisible by 5 and 11. ");
//         }else {
//             System.out.println(a+" is not divisible by 5 and 11.");
//         }
//     }
// }



// Input three numbers and print the largest using if-else.

// import java.util.Scanner;
// public class Work{
//     public static void main(String[]args){
//         Scanner input=new Scanner(System.in);

//         System.out.print("Enter first number: ");
//         double a=input.nextDouble();
//         System.out.print("Enter second number: ");
//         double b=input.nextDouble();
//         System.out.print("Enter third number: ");
//         double c= input.nextDouble();

//        if(a>=b && a>=3){
//             System.out.println("Its the largest");
//         } else if(b>=a && b>=c){
//             System.out.println("B the largest");
//         }else{
//             System.out.println("C the largest");
//         }
//         input.close();
// }
// }


// Take a number from the user and print whether it is even or odd.

// import java.util.Scanner;
// public class Work{
//     public static void main(String[] args) {
//         Scanner input=new Scanner(System.in);

//         System.out.print("Enter any number: ");
//         int num=input.nextInt();

//         if (num%2==0){
//             System.out.print("Even.");

//         }else{
//             System.out.println("Odd.");
//         }
//         input.close();
//     }
// }


// Input the age of a person and check if they are eligible to vote (18 or older).

// import java.util.Scanner;
// public class Work{
//     public static void main(String[]args){
//         Scanner input=new Scanner(System.in);

//         System.out.print("Enter your age: ");
//         int age=input.nextInt();

//         if (age>=18){
//             System.out.println("You are eligible to vote.");
//         }else{
//             System.out.println("You are not eligible to vote.");
//         }
//     }
// }


// Write a program to input a character and check if it is a vowel or a consonant using if-else.

// import java.util.Scanner;
// public class Work{
//     public static void main(String[]args){
//         Scanner input= new Scanner(System.in);

//         System.out.print("Enter a character: ");
//         char word=input.next().toLowerCase().charAt(0); //convert to lowercase for easy comparison

//         // check if the cjharacter is a letter
//         if(word >='a' && word <='z'){
//             //check if it is a vowel
//             if(word=='a' || word=='e' ||word=='i' ||word=='o' ||word=='u'){
//                 System.out.println(word+" is a vowel.");
//             }else{
//                 System.out.println(word+" is a consonant.");
//             }
//         }else{
//             System.out.println("The input is not alphabet character.");
//         }

//         input.close();
//     }
// }



// Take marks of five subjects and calculate the total, percentage, and grade using if-else.

// import java.util.Scanner;
// public class Work{
//     public static void main(String[]args){
//         Scanner input= new Scanner(System.in);

//         System.out.print("Enter marks for subject1: ");
//         int sub1=input.nextInt();
//         System.out.print("Enter marks for subject2: ");
//         int sub2=input.nextInt();
//         System.out.print("Enter marks for subject3: ");
//         int sub3=input.nextInt();
//         System.out.print("Enter marks for subject4: ");
//         int sub4=input.nextInt();
//         System.out.print("Enter marks for subject5: ");
//         int sub5=input.nextInt();

//         // Calculate total and percentage
//         int total=sub1+sub2+sub3+sub4+sub5;
//         double percentage=total/5.0;

//         //Determine grade using if else
        
//         char grade;

//         if (percentage >=90){
//             grade='A';
//         }else if(percentage>=80){
//             grade='B';
//         }else if(percentage>=70){
//            grade='C';
//         }else if(percentage>=60){
//             grade='D';
//         }else if(percentage>=50){
//             grade='E';
//         }else{
//             grade='F';
//         }

//         // print results
//         System.out.println("Total marks="+total);
//         System.out.println("percentage="+percentage);
//         System.out.println("Grade="+ grade);
//         input.close();

// }
// }


// Write a program to take a number from the user and print whether it is a leap year or not.


// public class Work{
//     public static void main(String[]args){
//         int year=2004;
//         if (year%100!=0 || year%400==0){
//             System.out.print(" is a leap year.");
//         }else{
//             System.out.println(" is not leap year.");
//         }
//     }
// }


// Input a number from the user and display whether it is a prime number using a for loop.

// import java.util.Scanner;

// public class Work {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);

//         // Input a number
//         System.out.print("Enter a number: ");
//         int num = input.nextInt();
//         boolean isPrime = true;

//         // Check for prime using a for loop
//         if (num <= 1) {
//             isPrime = false; // 0 and 1 are not prime numbers
//         } else {
//             for (int i = 2; i <= num / 2; i++) {
//                 if (num % i == 0) {
//                     isPrime = false;
//                     break;
//                 }
//             }
//         }

//         // Output result
//         if (isPrime) {
//             System.out.println(num + " is a prime number.");
//         } else {
//             System.out.println(num + " is not a prime number.");
//         }

//         input.close();
//     }
// }


// Write a program to print the multiplication table of a given number using for loop.

// import java.util.Scanner;

// public class Work {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);

//         // Input the number
//         System.out.print("Enter a number: ");
//         int num = input.nextInt();

//         // Print multiplication table using a for loop
//         System.out.println("Multiplication Table of " + num + ":");
//         for (int i = 1; i <= 10; i++) {
//             System.out.println(num + " x " + i + " = " + (num * i));
//         }

//         input.close();
//     }
// }



// Take a number n and print the sum of first n natural numbers using a loop.

// import java.util.Scanner;
// public class Work {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);

//         // Input the value of n
//         System.out.print("Enter a number: ");
//         int n = input.nextInt();

//         int sum = 0;

//         // Calculate the sum using a for loop
//         for (int i = 1; i <= n; i++) {
//             sum += i;
//         }

//         // Print the result
//         System.out.println("The sum of the first " + n + " natural numbers is: " + sum);

//         input.close();
//     }
// }


// Write a program that prints all even numbers from 1 to 100 using for loop.

// public class Work {
//     public static void main(String[] args) {
//         System.out.println("Even numbers from 1 to 100:");

//         // Use for loop to print even numbers
//         for (int i = 1; i <= 100; i++) {
//             if (i % 2 == 0) {
//                 System.out.print(i + " ");
//             }
//         }
//     }
// }


// Input a number and display the factorial of that number using a for loop.

// import java.util.Scanner;

// public class Work {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);

//         // Input a number
//         System.out.print("Enter a number: ");
//         int num = input.nextInt();

//         long factorial = 1;

//         // Calculate factorial using for loop
//         for (int i = 1; i <= num; i++) {
//             factorial *= i;
//         }

//         // Display the result
//         System.out.println("Factorial of " + num + " is: " + factorial);

//         input.close();
//     }
// }



// Take two numbers and an operator (+, -, *, /) and perform the operation using switch.

// import java.util.Scanner;

// public class Work {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);

//         // Input two numbers
//         System.out.print("Enter first number: ");
//         double num1 = input.nextDouble();

//         System.out.print("Enter second number: ");
//         double num2 = input.nextDouble();

//         // Input operator
//         System.out.print("Enter an operator (+, -, *, /): ");
//         char operator = input.next().charAt(0);

//         double result;

//         // Perform operation using switch
//         switch (operator) {
//             case '+':
//                 result = num1 + num2;
//                 System.out.println("Result: " + result);
//                 break;
//             case '-':
//                 result = num1 - num2;
//                 System.out.println("Result: " + result);
//                 break;
//             case '*':
//                 result = num1 * num2;
//                 System.out.println("Result: " + result);
//                 break;
//             case '/':
//                 if (num2 != 0) {
//                     result = num1 / num2;
//                     System.out.println("Result: " + result);
//                 } else {
//                     System.out.println("Error: Division by zero is not allowed.");
//                 }
//                 break;
//             default:
//                 System.out.println("Invalid operator.");
//         }

//         input.close();
//     }
// }



// Write a program to input a number from 1 to 7 and display the day of the week using switch.


// import java.util.Scanner;

// public class Work {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);

//         // Input a number from 1 to 7
//         System.out.print("Enter a number (1 to 7): ");
//         int dayNumber = input.nextInt();

//         // Display the corresponding day using switch
//         switch (dayNumber) {
//             case 1:
//                 System.out.println("Monday");
//                 break;
//             case 2:
//                 System.out.println("Tuesday");
//                 break;
//             case 3:
//                 System.out.println("Wednesday");
//                 break;
//             case 4:
//                 System.out.println("Thursday");
//                 break;
//             case 5:
//                 System.out.println("Friday");
//                 break;
//             case 6:
//                 System.out.println("Saturday");
//                 break;
//             case 7:
//                 System.out.println("Sunday");
//                 break;
//             default:
//                 System.out.println("Invalid input! Please enter a number from 1 to 7.");
//         }

//         input.close();
//     }
// }


// Input a month number (1–12) and print the number of days in that month using switch.

// import java.util.Scanner;

// public class Work {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);

//         // Input month number
//         System.out.print("Enter month number (1-12): ");
//         int month = input.nextInt();

//         // Display number of days using switch
//         switch (month) {
//             case 1:
//             case 3:
//             case 5:
//             case 7:
//             case 8:
//             case 10:
//             case 12:
//                 System.out.println("31 days");
//                 break;
//             case 4:
//             case 6:
//             case 9:
//             case 11:
//                 System.out.println("30 days");
//                 break;
//             case 2:
//                 System.out.println("28 or 29 days (February)");
//                 break;
//             default:
//                 System.out.println("Invalid month number! Please enter a number from 1 to 12.");
//         }

//         input.close();
//     }
// }



// Take a character input and use switch to display if it is a vowel (a, e, i, o, u).

// import java.util.Scanner;

// public class Work {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);

//         // Input a character
//         System.out.print("Enter a character: ");
//         char ch = input.next().toLowerCase().charAt(0); // Convert to lowercase

//         // Check for vowel using switch
//         switch (ch) {
//             case 'a':
//             case 'e':
//             case 'i':
//             case 'o':
//             case 'u':
//                 System.out.println(ch + " is a vowel.");
//                 break;
//             default:
//                 System.out.println(ch + " is not a vowel.");
//         }

//         input.close();
//     }
// }


// Input a number and check if it is a perfect square using for loop.

// import java.util.Scanner;

// public class Work {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);

//         // Input a number
//         System.out.print("Enter a number: ");
//         int num = input.nextInt();
//         boolean isPerfectSquare = false;

//         // Check for perfect square using for loop
//         for (int i = 1; i * i <= num; i++) {
//             if (i * i == num) {
//                 isPerfectSquare = true;
//                 break;
//             }
//         }

//         // Output result
//         if (isPerfectSquare) {
//             System.out.println(num + " is a perfect square.");
//         } else {
//             System.out.println(num + " is not a perfect square.");
//         }

//         input.close();
//     }
// }


// Write a program to find the sum of digits of a number using a loop.

// import java.util.Scanner;

// public class Work {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);

//         // Input a number
//         System.out.print("Enter a number: ");
//         int num = input.nextInt();
//         int sum = 0;

//         // Calculate sum of digits using a loop
//         while (num != 0) {
//             sum += num % 10;  // Add the last digit
//             num /= 10;         // Remove the last digit
//         }

//         // Output the result
//         System.out.println("The sum of digits is: " + sum);

//         input.close();
//     }
// }


// Input a number and reverse it using a for loop.


// import java.util.Scanner;

// public class Work {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);

//         // Input a number
//         System.out.print("Enter a number: ");
//         int num = input.nextInt();
//         int reversed = 0;

//         // Reverse the number using a for loop
//         for (; num != 0; num /= 10) {
//             int digit = num % 10;  // Get the last digit
//             reversed = reversed * 10 + digit;  // Append the digit to the reversed number
//         }

//         // Output the reversed number
//         System.out.println("Reversed number is: " + reversed);

//         input.close();
//     }
// }


// Take a number and check whether it is a palindrome or not using if-else and loop.

// import java.util.Scanner;

// public class Work {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);

//         // Input a number
//         System.out.print("Enter a number: ");
//         int num = input.nextInt();

//         int originalNum = num;
//         int reversed = 0;

//         // Reverse the number using a loop
//         while (num != 0) {
//             int digit = num % 10;  // Get the last digit
//             reversed = reversed * 10 + digit;  // Append the digit to the reversed number
//             num /= 10;  // Remove the last digit
//         }

//         // Check if the original number is equal to the reversed number
//         if (originalNum == reversed) {
//             System.out.println(originalNum + " is a palindrome.");
//         } else {
//             System.out.println(originalNum + " is not a palindrome.");
//         }

//         input.close();
//     }
// }


// Input n and print the first n terms of the Fibonacci series.

// import java.util.Scanner;

// public class Work {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);

//         // Input number of terms
//         System.out.print("Enter the number of terms: ");
//         int n = input.nextInt();

//         // Initializing the first two Fibonacci numbers
//         int first = 0, second = 1;

//         // Print the first n terms of the Fibonacci series
//         System.out.print("Fibonacci series: ");
        
//         for (int i = 1; i <= n; i++) {
//             System.out.print(first + " ");
//             // Calculate the next Fibonacci number
//             int next = first + second;
//             first = second;
//             second = next;
//         }

//         input.close();
//     }
// }


// Write a program to count how many digits are in a given number using a loop.

import java.util.Scanner;

public class Work {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int count = 0;

        // Check if the number is 0
        if (num == 0) {
            count = 1;  // 0 has 1 digit
        } else {
            // Count digits using a loop
            while (num != 0) {
                num /= 10;  // Remove the last digit
                count++;    // Increment the count
            }
        }

        // Output the number of digits
        System.out.println("Number of digits: " + count);

        input.close();
    }
}
 

