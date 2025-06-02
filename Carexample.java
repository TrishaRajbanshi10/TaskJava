// 1. Write a Java program to create a class called Vehicle with a method called drive().
// Create a subclass called Car with method display() method to print details of the Car.
//INHERITENCE


class Vechile {
    public void drive(){
        System.out.println("Vechile is being driven.");
    }
}
class Car extends Vechile{
    public void display(){
        System.out.println("Car: Toyota Corolla, 2022, Automatic");
    }

}
public class Carexample{
    public static void main(String[]args){
        Car mycar=new Car();
        mycar.drive();
        mycar.display();
    }
}
