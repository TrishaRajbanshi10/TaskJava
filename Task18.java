// Write a method to generate the first n terms of the Fibonacci series
 
import java.util.Scanner;
 
public class Task18 {
    public static void fibo(int n) {
        int a=0,b=1,c;

        for(int i=1;i<=n;i++){
            System.out.print(a+" ");
            c=a+b;
            a=b;
            b=c;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a n terms of the Fibonacci series");
        int num=sc.nextInt();
        fibo(num);
        sc.close();
    }
    
}