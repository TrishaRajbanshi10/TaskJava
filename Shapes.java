//  Create an abstract class called Shape with an abstract method called calculateArea(). 
// Implement two subclasses called Rectangle and Circle that inherit from Shape.
//  Override the calculateArea() method in both subclasses to calculate and return the area of a rectangle and a circle, respectively. 
// Write the Java code to implement this scenario with Scanner Input.


// Parent class
abstract class Shape {
    public abstract void calculateArea();
}

// Subclass: Rectangle
class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void calculateArea() {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}

// Subclass: Circle
class Circle extends Shape {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    public void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

// Main class
public class Shapes {
    public static void main(String[] args) {
        // Hardcoded values
        double length = 5.0;
        double width = 3.0;
        double radius = 4.0;

        System.out.println("Rectangle:");
        Rectangle rectangle = new Rectangle(length, width);
        rectangle.calculateArea();

        System.out.println("\nCircle:");
        Circle circle = new Circle(radius);
        circle.calculateArea();
    }
}

