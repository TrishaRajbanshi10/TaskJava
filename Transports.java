

class Vehicle {
    public void startEngine() {
        System.out.println("Engine started.");
    }

    public void stopEngine() {
        System.out.println("Engine stopped.");
    }
}

class Car extends Vehicle {
    public void drive() {
        System.out.println("Car is driving.");
    }
}

class Motorcycle extends Vehicle {
    public void ride() {
        System.out.println("Motorcycle is riding.");
    }
}

public class Transports {
    public static void main(String[] args) {
        Car myCar = new Car();
        System.out.println("Car Actions:");
        myCar.startEngine();
        myCar.stopEngine();
        myCar.drive();

        Motorcycle bike = new Motorcycle();
        System.out.println("Motorcycle Actions:");
        bike.ride();
        bike.stopEngine();
        bike.startEngine();
    }
}



