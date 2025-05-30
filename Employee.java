//4. Write a Java program to create a class called "Employee" with a name, job title, and salary attributes, 
//and methods to calculate and update salary.

public class Employee {
    private String name;
    private String jobTitle;
    private int salary;

    public Employee(String name,String jobTitle,int salary){
        this.name=name;
        this.jobTitle=jobTitle;
        this.salary=salary;
    }
    //getter and setter
    public void setName(String name){
        this.name=name;
    }
    public void setJobTitle(String jobTitle){
        this.jobTitle=jobTitle;
    }
    public void setSalary(int salary){
        this.salary=salary;
    }

    //method to calculate 
    public int calculateAnnualSalary(){
        return salary*12;
    }

    //update salary
    public void updateSalary(int newSalary){
        if (newSalary>0){
            this.salary=newSalary;
        }else{
            System.out.println("Salary must be greater than 0");
        }
    }
    void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Monthly Salary: " + salary);
        System.out.println("Annual Salary: " + calculateAnnualSalary());
    }
    public static void main(String[] args) {
        Employee emp = new Employee("John", "Manager", 4000);

        emp.printInfo(); // Show original details

        emp.updateSalary(50000); 

        System.out.println("\nAfter Salary Increase:");
        emp.printInfo(); // Show updated details

    }
}
