// Create a method to count uppercase and lowercase characters in a string
import java.util.Scanner;
 public class Task15 {
     public static void countCase(String sentence){
         int countLow=0,countUp=0;
         for(int i=0;i<sentence.length();i++){
             char a=sentence.charAt(i);
             if (Character.isLowerCase(a)){
                 countLow+=1;
             }else if(Character.isUpperCase(a)) {
                 countUp+=1;
             }
         }
         System.out.println("uppercase:"+countUp);
         System.out.println("lowercase:"+countLow);
 
 }
     public static void main(String[] args) {
         System.out.println("Enter a sentence to count the frequency upper and lower case letters");
         Scanner sc=new Scanner(System.in);
         String sentence=sc.nextLine();
         sc.close();
         countCase(sentence);
     }
 }
