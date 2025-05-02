// Write a method to determine if a number is a Duck number

import java.util.Scanner;
public class Task12 {
     public static void Duck(int num){
         boolean ans=false;
         String snum=String.valueOf(num);
         for(int i=0;i<snum.length();i++){
             char a=snum.charAt(i);
             if (a=='0'){
                 ans=true;
                 break;
         }}
       
         if (ans==true){
             System.out.println(num+" is duck number as it has a zero");
         }else{
             System.out.println("Not a duck number");
         }
 }
     public static void main(String[] args) {
         System.out.println("Enter a number to find if it is duck");
         Scanner sc=new Scanner(System.in);
         int num=sc.nextInt();
         sc.close();
         Duck(num);
     }
 }
