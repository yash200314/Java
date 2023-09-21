// slip3a 
abstract class shape{
    abstract double area();
    abstract double vol();

}
class cone extends shape{
    private double radius,height;
    public cone (double radius,double height)
    {
        this.radius=radius;
        this.height=height;
    }
    public double area()
    {
         return Math.PI * radius * (radius + Math.sqrt(radius * radius + height * height));
    }
    public double vol()
    {
         return (Math.PI * radius * radius * height) / 3;
    }
}

class cylinder extends shape
{
    private double radius,height;

    public cylinder(double radius,double height)
    {
        this.radius=radius;
        this.height=height;
    }
    double area()
    {
        return 2 * Math.PI * radius * (radius + height);
    }
    double vol()
    {
        return Math.PI * radius * radius * height;
    }
}

public class slip3a
{
    public static void main(String []args)
    {
        cone Cone=new cone(4.5,7.2);
        System.out.println("Cone Area: " + Cone.area());
        System.out.println("Cone Volume: " + Cone.vol());
        cylinder Cylinder = new cylinder(2.8, 5.1);
        System.out.println("Cylinder Area: " + Cylinder.area());
        System.out.println("Cylinder Volume: " + Cylinder.vol());
    }
}