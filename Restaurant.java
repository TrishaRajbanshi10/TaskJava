// 7. You are developing a restaurant management system that handles different types of employees, such as chefs and waiters. 
// Design an interface named "Employee" with the following methods:
// work(): This method should define the work responsibilities of the employee.
// getSalary(): This method should return the salary of the employee.

// Interface: Employee
interface Employee {
    void work();           // Defines work responsibilities
    double getSalary();    // Returns salary
}

// Class: Chef implements Employee
class Chef implements Employee {
    private double salary;

    public Chef(double salary) {
        this.salary = salary;
    }

    public void work() {
        System.out.println("Chef is cooking delicious meals.");
    }

    public double getSalary() {
        return salary;
    }
}

// Class: Waiter implements Employee
class Waiter implements Employee {
    private double salary;

    public Waiter(double salary) {
        this.salary = salary;
    }

    public void work() {
        System.out.println("Waiter is serving customers and taking orders.");
    }

    public double getSalary() {
        return salary;
    }
}

// Main class to demonstrate the program
public class Restaurant {
    public static void main(String[] args) {
        Employee chef = new Chef(50000.0);
        Employee waiter = new Waiter(30000.0);

        System.out.println("Chef:");
        chef.work();
        System.out.println("Salary: $" + chef.getSalary());

        System.out.println("\nWaiter:");
        waiter.work();
        System.out.println("Salary: $" + waiter.getSalary());
    }
}

