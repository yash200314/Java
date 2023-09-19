//this is a pratice set of code with harry pratice set 10 not a slip question

class circle{
    public int radius;

    circle(int r){
        System.out.println("i am parameteried constructor");
        this.radius = r;

    }
    public double area1()
    {
        return Math.PI*this.radius*this.radius;
    }
}

class cylinder extends circle{
   
    cylinder(int r,int h)
    {
        super(r);
        this.height = h;
    }
    public int height;
    public double volume1()
    {
        return Math.PI*this.radius*this.radius*this.height;

    }

}
public class cwhcirclepraset {
    public static void main(String[] args) {
        // create a class circle and use inheritance to create another class cylinder from it
        circle obj = new circle(12);
        cylinder obj2 = new cylinder(12, 24);

        obj.area1();
        obj2.volume1();
        
    }
}
