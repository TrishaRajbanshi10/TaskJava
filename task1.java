//Write a method to print all odd numbers from 1 to a given number n

import java.util.Scanner;
public class Task1{
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num= input.nextInt();
        System.out.print("Odd numbers from 1 to"+num+"are: ");
        for(int i=1; i<=num;i++){
            if (i%2!=0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        input.close();
    }
}

