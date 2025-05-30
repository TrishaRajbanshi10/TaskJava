//Create a method to convert a given number of days into years, months, and days

import java.util.Scanner;
public class Task2{
    public static void convertDays(int days){
        int years=days/365;
        int months=(days%365)/30;
        int day=days%365%30;
        System.out.println(days+" days "+years+" years, "+months+" months, and "+ days+" days.");
         
    }
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number of days: ");
        int days=input.nextInt();
        convertDays(days);
        input.close();

    }
}

