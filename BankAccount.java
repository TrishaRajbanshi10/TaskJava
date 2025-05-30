//You are building a banking application that has a BankAccount class. 
//Implement the BankAccount class with encapsulation principles in mind.
// Include private instance variables for the account number, account holder name, and account balance. 
//Provide public methods to allow clients to deposit and withdraw funds, as well as access the account balance. 
//Ensure that the account balance cannot be accessed or modified directly

//encapsulation

public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private Double accountBalance;

    // Constructor
    public BankAccount(String accountNumber, String accountHolderName, Double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        if (accountBalance >= 0) {
            this.accountBalance = accountBalance;
        } else {
            this.accountBalance = 0.0;
            System.out.println("Your balance is empty.");
        }
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            accountBalance += amount;
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money
    public void withdraw(Double amount) {
        if (amount > 0 && amount <= accountBalance) {
            accountBalance -= amount;
        } else {
            System.out.println("Invalid withdraw amount or insufficient balance.");
        }
    }

    // Method to get current balance
    public Double getBalance() {
        return accountBalance;
    }

    // Getters
    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public Double getAccountBalance() {
        return accountBalance;
    }
}

