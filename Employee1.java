public class Employee1 {
    // Private instance variables
    private String name;
    private String employeeId;
    private double salary;

    // Constructor
    public Employee1(String name, String employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = (salary >= 0) ? salary : 0; // Prevent negative initial salary
    }

    // Getter and Setter for Name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for Employee ID
    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    // Getter for Salary (read-only)
    public double getSalary() {
        return salary;
    }

    // Method to update salary (increase or decrease, no negative result allowed)
    public void updateSalary(double amount) {
        if (salary + amount >= 0) {
            salary += amount;
            System.out.println("Salary updated. New salary: " + salary);
        } else {
            System.out.println("Error: Salary cannot be negative.");
        }
    }

    // Main method to test the class
    public static void main(String[] args) {
        Employee1 emp = new Employee1("John Doe", "E123", 5000);

        System.out.println("Name: " + emp.getName());
        System.out.println("ID: " + emp.getEmployeeId());
        System.out.println("Salary: $" + emp.getSalary());

        emp.updateSalary(1000);   // Increase salary
        emp.updateSalary(-2000);  // Decrease salary
        emp.updateSalary(-5000);  // Invalid operation (would result in negative)
    }
}
