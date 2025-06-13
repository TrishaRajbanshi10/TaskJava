//  5. You are building a shape hierarchy for a drawing application. 
// Design an abstract class named "Draw" with the following abstract methods:
// calculateVolume(): This method should calculate and return the area of the shape
// calculateArea(): This method should calculate and return the area of the shape.
// calculatePerimeter(): This method should calculate and return the perimeter of the shape.
//  Implement the abstract class and provide concrete implementations for the abstract methods. 
//  Create subclasses for different shapes such as "Cube," "Cuboid," and "Cylinder."
//  Each subclass should provide specific implementations for calculating the volume, area and perimeter of that shape.
//  Create instances of each shape class and demonstrate how you can calculate their respective volume, areas and perimeters.

 // Abstract class Draw
abstract class Draw {
    public abstract double calculateVolume();
    public abstract double calculateArea();      // Surface Area
    public abstract double calculatePerimeter(); // Perimeter of base
}

// Subclass: Cube
class Cube extends Draw {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    public double calculateVolume() {
        return Math.pow(side, 3);
    }

    public double calculateArea() {
        return 6 * Math.pow(side, 2); // Surface Area
    }

    public double calculatePerimeter() {
        return 12 * side; // Sum of edges
    }
}

// Subclass: Cuboid
class Cuboid extends Draw {
    private double length, width, height;

    public Cuboid(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double calculateVolume() {
        return length * width * height;
    }

    public double calculateArea() {
        return 2 * (length * width + width * height + height * length);
    }

    public double calculatePerimeter() {
        return 4 * (length + width + height); // Sum of all edges
    }
}

// Subclass: Cylinder
class Cylinder extends Draw {
    private double radius, height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double calculateVolume() {
        return Math.PI * radius * radius * height;
    }

    public double calculateArea() {
        return 2 * Math.PI * radius * (radius + height); // Surface Area
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius; // Perimeter of circular base
    }
}

// Main class
public class DrawDemo {
    public static void main(String[] args) {
        // Cube
        Cube cube = new Cube(3.0);
        System.out.println("Cube:");
        System.out.println("Volume: " + cube.calculateVolume());
        System.out.println("Surface Area: " + cube.calculateArea());
        System.out.println("Total Edge Length (Perimeter): " + cube.calculatePerimeter());

        // Cuboid
        Cuboid cuboid = new Cuboid(4.0, 3.0, 2.0);
        System.out.println("\nCuboid:");
        System.out.println("Volume: " + cuboid.calculateVolume());
        System.out.println("Surface Area: " + cuboid.calculateArea());
        System.out.println("Total Edge Length (Perimeter): " + cuboid.calculatePerimeter());

        // Cylinder
        Cylinder cylinder = new Cylinder(2.0, 5.0);
        System.out.println("\nCylinder:");
        System.out.println("Volume: " + cylinder.calculateVolume());
        System.out.println("Surface Area: " + cylinder.calculateArea());
        System.out.println("Base Perimeter (Circumference): " + cylinder.calculatePerimeter());
    }
}
