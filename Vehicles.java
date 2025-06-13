// 3. Create an abstract class called Vehicle with abstract methods startEngine() and stopEngine(). 
// Implement two subclasses called Car and Motorcycle that inherit from Vehicle.
//  Implement the startEngine() and stopEngine() methods in both subclasses to start 
// and stop the engines of a car and a motorcycle, respectively.

class Vehicle{
    public void startEngine(){
        System.out.println("Vehicle is started.");
    }
    public void StopEngine(){
        System.out.println("Vehicle is stopped.");
    }
}

//subclass:Car
class Car extends Vehicle{
    public void startEngine(){
        System.out.println("Car starts.");
    }
    public void stopEngine(){
        System.out.println("Car stops.");
    }
}

//subclass:Motorcycle
class Motorcycle{
    public void startEngine(){
        System.out.println("Motorcycle is started.");
    }
    public void stopEngine(){
        System.out.println("Motorcycle is stoped.");
    }
}

//main class
public class Vehicles{
    public static void main(String[]args){
        Car car=new Car();
        Motorcycle motor= new Motorcycle();

        System.out.println("Car");
        car.startEngine();
        car.stopEngine();

        System.out.println("\nMotorcycle");
        motor.startEngine();
        motor.stopEngine();

    }
}
