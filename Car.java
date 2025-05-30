public class Car {
    // Private instance variables
    private final String make;         // Can be set only once via constructor
    private final String model;        // Can be set only once via constructor
    private double rentalPricePerDay;
    private boolean isAvailable;

    // Constructor - sets make, model, rental price, and availability
    public Car(String make, String model, double rentalPricePerDay) {
        this.make = make;
        this.model = model;
        this.rentalPricePerDay = rentalPricePerDay;
        this.isAvailable = true;  // By default, car is available
    }

    // Getter methods
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public double getRentalPricePerDay() {
        return rentalPricePerDay;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    // Setter method for rental price (make and model can't be changed after creation)
    public void setRentalPricePerDay(double rentalPricePerDay) {
        if (rentalPricePerDay >= 0) {
            this.rentalPricePerDay = rentalPricePerDay;
        } else {
            System.out.println("Rental price cannot be negative.");
        }
    }

    // Method to rent the car - sets availability to false if available
    public void rentCar() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Car rented successfully.");
        } else {
            System.out.println("Sorry, the car is already rented.");
        }
    }

    // Method to return the car - sets availability to true
    public void returnCar() {
        isAvailable = true;
        System.out.println("Car returned successfully.");
    }

    // Main method for testing
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla", 50.0);

        System.out.println("Make: " + car.getMake());
        System.out.println("Model: " + car.getModel());
        System.out.println("Rental Price Per Day: $" + car.getRentalPricePerDay());
        System.out.println("Available: " + car.isAvailable());

        car.rentCar();
        System.out.println("Available after renting: " + car.isAvailable());

        car.rentCar();  // Trying to rent again

        car.returnCar();
        System.out.println("Available after returning: " + car.isAvailable());
    }
}
