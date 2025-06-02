//. Implement a class hierarchy for various shapes. Create a base class 'Shape' with a method 'calculateArea()'.
// Derive two classes 'Rectangle' and 'Circle' from 'Shape'.
// Add additional methods 'calculatePerimeter()' in 'Rectangle' and 'calculateCircumference()' in 'Circle'.
// Write a Java program to demonstrate hierarchical inheritance and compute the area and perimeter/circumference for a rectangle and a circle object.

// Base class
class Shape {
    public double calculateArea() {
        return 0; // Default implementation
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

class Circle extends Shape {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
}

public class Shapes {
    public static void main(String[] args) {
        // Create a Rectangle
        Rectangle rectangle = new Rectangle(5.0, 3.0);
        System.out.println("Rectangle:");
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());

        // Create a Circle
        Circle circle = new Circle(4.0);
        System.out.println("\nCircle:");
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Circumference: " + circle.calculateCircumference());
    }
}
