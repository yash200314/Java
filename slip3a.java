// Define an abstract class Shape with abstract methods area () and volume (). 
//Derive abstract class Shape into two classes Cone and Cylinder. Write a java Program 
//to calculate area and volume of Cone and Cylinder.(Use Super Keyword.) */

abstract class shape {
    abstract double area();

    abstract double volume();
}

class Cone extends shape {
    private double radius, height;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }
    public double area()
    {
       return Math.PI * radius * (radius + Math.sqrt(radius * radius * radius + height * height));
    }
    public double volume()
    {
        return (Math.PI * radius * radius * height) / 3;
    }
}
class Cylinder extends shape{
    private double radius ,height;
    public Cylinder(double radius,double height)
    {
        this.radius = radius;
        this.height = height;
    }
    public double area()
    {
        return 2 * Math.PI * radius * (radius + height);
    }
    public double volume()
    {
        return Math.PI * radius * radius * height;
    }
}
public class slip3a{
    public static void main(String[] args) {
        Cone c = new Cone(3.3,3.7);
        System.out.println("Cone area"+c.area());
        System.out.println("cone volume"+c.volume());
        Cylinder cy = new Cylinder(6.6, 12.4);
        System.out.println("Cylinder area:" + cy.area());
        System.out.println("cylinder volume" + cy.volume());
    }
}

