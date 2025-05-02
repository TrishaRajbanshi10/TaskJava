// Create a method to reverse an integer number without converting it to a string
import java.util.Scanner;
public class Task17 {
    public static int reverse(int num){
        int rev=0;
        while(num!=0){
            int dig=num%10;
            rev=rev*10+dig;
            num=num/10;
        }
        return rev;
    } 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        System.out.println(reverse(num));
        sc.close();
    }
    
}
