// Write a method to calculate the compound interest given principal, rate, and time

public class Task5 {
    public static void main(String[] args) {
        double principal = 1000; // Principal amount
        double rate = 5; // Annual interest rate in percentage
        int time = 2; // Time in years

        double compoundInterest = calculateCompoundInterest(principal, rate, time);
        System.out.println("Compound Interest: " + compoundInterest);
    }
    public static double calculateCompoundInterest(double principal, double rate, int time) {
        double amount = principal;
        for (int i = 0; i < time; i++) {
            amount += amount * (rate / 100);
        }
        return amount - principal;
    }
}
