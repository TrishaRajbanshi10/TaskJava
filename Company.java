// 2. Write a Java program to create a class called Employee with methods called work() and getSalary(). 
// Create a subclass called HRManager that overrides the work() method.


class Employee{
    public void work(){
        System.out.println("Employee is working.");
    }
    public void getSalary(){
        System.out.println("200000");
    }
}
class HRManager extends Employee{
    public void work(){
        System.out.println("HRManager is managing employee");
    }
}
public class Company {
    public static void main(String[]args){
        HRManager hr=new HRManager();

        hr.work();
        hr.getSalary();
    }
}
