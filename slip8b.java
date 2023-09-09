/*Define an Interface Shape with abstract method area(). Write a java program to calculate 
an area of Circle and Sphere.(use final keyword)*/

interface Shape {

    final double PI = 3.14;

    double area();
}

class Circle implements Shape {
    private final int rad;

    public Circle(int rad) {
        this.rad = rad;
    }

    @Override
    public double area() {
        return PI * rad * rad;
    }
}

class Sphere implements Shape {
    private final int rad;

    public Sphere(int rad) {
        this.rad = rad;
    }

    @Override
    public double area() {
        return 4 * PI * rad * rad;
    }
}

public class slip8b {

    public static void main(String[] args) {
        Circle cr = new Circle(3);
        Sphere sp = new Sphere(4);

        System.out.println("Area of circle is:" + cr.area());
        System.out.println("Surface area of sphere is:"+sp.area());
    }
}