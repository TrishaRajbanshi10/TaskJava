// Write a method to count the number of words in a given string
public class Task4 {
    public static void main(String[] args) {
        String str = "Hello! good morning ."; 
        System.out.println("Number of words: " + countWords(str));
    }
    public static int countWords(String str) {
        if (str == null || str.isEmpty()) { 
            return 0;
        }
        return str.trim().split("\\s+").length; //trim() removes extra spaces at the start and end , split("\\s+") splits the string by one or more spaces
    }
}
