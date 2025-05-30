// 1. Write a Java program to create a class called "Circle" with a radius attribute. 
//You can access this attribute using setter and getter method. 
//Calculate the area and circumference of the circle.
public class Circle {
    // Private radius attribute
    private double radius;

    // Setter method
    public void setRadius(double radius) {
        if (radius >= 0) {
            this.radius = radius;
        } else {
            System.out.println("Radius cannot be negative.");
        }
    }

    // Getter method
    public double getRadius() {
        return radius;
    }

    // Method to calculate area
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate circumference
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    // Main method to test
    public static void main(String[] args) {
        Circle c = new Circle();
        c.setRadius(5); // Set radius

        System.out.println("Radius: " + c.getRadius());
        System.out.println("Area: " + c.getArea());
        System.out.println("Circumference: " + c.getCircumference());
    }
}
