// 4. You are building a shape hierarchy for a drawing application. 
// Design an abstract class named "Shape" with the following abstract methods:
// calculateArea(): This method should calculate and return the area of the shape.
// calculatePerimeter(): This method should calculate and return the perimeter of the shape.
// Implement the abstract class and provide concrete implementations for the abstract methods. 
// Create subclasses for different shapes such as "Circle," "Rectangle," and "Triangle." 
// Each subclass should provide specific implementations for calculating the area and perimeter of that shape.
//  Create instances of each shape class and demonstrate how you can calculate their respective areas and perimeters.


// Abstract class Shape
abstract class Shape {
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}

// Subclass: Circle
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Subclass: Rectangle
class Rectangle extends Shape {
    private double length;
    private double width;

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

// Subclass: Triangle (Assuming all sides and height are provided)
class Triangle extends Shape {
    private double a, b, c;  // Sides
    private double height;   // Height corresponding to side 'a'

    public Triangle(double a, double b, double c, double height) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.height = height;
    }

    public double calculateArea() {
        return 0.5 * a * height;
    }

    public double calculatePerimeter() {
        return a + b + c;
    }
}

// Main class
public class ShapeDemo {
    public static void main(String[] args) {
        // Create a Circle
        Circle circle = new Circle(5.0);
        System.out.println("Circle:");
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Perimeter: " + circle.calculatePerimeter());

        // Create a Rectangle
        Rectangle rectangle = new Rectangle(4.0, 6.0);
        System.out.println("\nRectangle:");
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());

        // Create a Triangle
        Triangle triangle = new Triangle(3.0, 4.0, 5.0, 2.5);
        System.out.println("\nTriangle:");
        System.out.println("Area: " + triangle.calculateArea());
        System.out.println("Perimeter: " + triangle.calculatePerimeter());
    }
}

