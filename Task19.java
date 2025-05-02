// Create a method that accepts a character and returns its ASCII value
public class Task19 {
 
    public static int getAsciiValue(char character) {
        return (int) character;
    }

    public static void main(String[] args) {
        System.out.println(getAsciiValue('A')); 
        System.out.println(getAsciiValue('1')); 
    }
}