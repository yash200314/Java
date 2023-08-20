//Define an abstract class Shape with abstract methods area ()
//and volume (). Derive abstract class Shape into two classes Cone and Cylinder. 
//Write a java Program to calculate area and volume of Cone and Cylinder.(Use Super Keyword.) 		

abstract class Shape{
    abstract double area();
    abstract double volume();
}
class Cone extends Shape{
    private double radius;
    private double height;

    public Cone(double radius,double height){
        this.radius = radius;
        this.height = height;
    }
    double area(){
        double slantHeight = Math.sqrt(radius*radius+height*height);
        return Math.PI *radius*(radius+slantHeight);
    }
    double volume(){
        return (1.0/3.0)*Math.PI*radius*radius*height;
    }

}
class Cylinder extends Shape{
    private double radius;
    private double height;

    public Cylinder(double radius,double height){
        this.radius = radius;
        this.height = height;
    }
    double area(){
        return 2* Math.PI * radius * (radius + height);
    }
    double volume(){
        return Math.PI * radius * radius *height;
    }
}

public class slip3a {
    
    public static void main(String[] args){
        double coneRadius = 3.0;
        double coneHeigt = 5.0;
        Cone cone = new Cone(coneRadius,coneHeigt);
        System.out.println("Cone Area is:"+cone.area());
        cone.volume();
        
        double cylinderRadius = 2.5;
        double cylinderHeight = 8.0;
        Cylinder cylinder = new Cylinder(cylinderRadius, cylinderHeight);
        System.out.println("Cylinder Area: " + cylinder.area());
        System.out.println("Cylinder Volume: " + cylinder.volume());
   
    }
    
}
