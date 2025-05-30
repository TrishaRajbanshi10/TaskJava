// Write a method to determine whether a number is a Harshad number or not
public class Task3 {
    public static void main(String[] args) {
        int num = 18;
        if (isHarshadNumber(num)) {      //harshad number is a number that is divisible by the sum of its digits. example: 18 is a Harshad number because 1+8=9 and 18%9=0
            System.out.println(num + " is a Harshad number.");
        } else {
            System.out.println(num + " is not a Harshad number.");
        }
    }
    public static boolean isHarshadNumber(int num) {
        int sum = 0, temp = num;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        return num % sum == 0;
    }
}


