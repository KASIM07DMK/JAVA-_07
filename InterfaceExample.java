interface Shape {
    double calculateArea(); // Method to calculate area
    double calculatePerimeter(); // Method to calculate perimeter
}

// Class representing a Rectangle implementing Shape interface
class Rectangle implements Shape {
    private double length;
    private double width;

    // Constructor
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementation of interface methods
    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

// Class representing a Circle implementing Shape interface
class Circle implements Shape {
    private double radius;
    final double PI = 3.14159;

    // Constructor
    Circle(double radius) {
        this.radius = radius;
    }

    // Implementation of interface methods
    @Override
    public double calculateArea() {
        return PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * PI * radius;
    }
}

// Main class to demonstrate interface implementation
public class InterfaceExample {
    public static void main(String[] args) {
        // Create instances of Rectangle and Circle
        Rectangle rectangle = new Rectangle(5, 10);
        Circle circle = new Circle(7);

        // Calculate and print area and perimeter for Rectangle
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());

        // Calculate and print area and perimeter for Circle
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Circle Perimeter: " + circle.calculatePerimeter());
    }
}
