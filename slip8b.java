// Define an Interface Shape with abstract method area(). 
// Write a java program to calculate an area of Circle and Sphere.(use final keyword) 	

// Define the Shape interface
interface Shape {
    double area();
}

// Define the Circle class
class Circle implements Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

// Define the Sphere class
class Sphere implements Shape {
    private final double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return 4 * Math.PI * radius * radius;
    }
}

public class slip8b {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        Sphere sphere = new Sphere(3.0);

        System.out.println("Area of Circle: " + circle.area());
        System.out.println("Area of Sphere: " + sphere.area());
    }
}
