// Imagine that you are building a geometry calculator program. 
// You need to implement the calculation of areas for different shapes, including rectangles, squares, and circles.
//  To achieve this, you decide to use a multilevel inheritance hierarchy.


// Base class
class Shape {
    public void display() {
        System.out.println("Calculating area of a shape:");
    }
}

// Intermediate class in the hierarchy
class TwoDShape extends Shape {
    // Common methods or properties for 2D shapes could go here
}

// Rectangle class inherits from TwoDShape
class Rectangle extends TwoDShape {
    private double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }
}

// Square class inherits from Rectangle (multilevel)
class Square extends Rectangle {
    public Square(double side) {
        super(side, side); // Square is a special case of Rectangle
    }
}

// Circle class inherits from TwoDShape
class Circle extends TwoDShape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Main class to test the hierarchy
public class GeometryCalculator {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(4, 5);
        Square square = new Square(6);
        Circle circle = new Circle(3.5);

        System.out.println("Rectangle Area: " + rect.calculateArea());
        System.out.println("Square Area: " + square.calculateArea());
    }
}

