// Write a method that returns the sum of squares of digits of a number
import java.util.Scanner;
 public class Task14 {
     public static void sqSum(int num){
         int sum=0;
         while(num!=0){
             int dig=num%10;
             sum=sum+(dig*dig);
             num=num/10;
         }
         System.out.println("The sum of square of digit is :"+ sum);
         
     } 
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter a number");
         int num=sc.nextInt();
         sqSum(num);
         sc.close();
     }
 }
