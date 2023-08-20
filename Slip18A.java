class Slip18A
{
    void area(int a,int b)
    {
        System.out.println("Area of rectangle: "+(a+b));
    }
    void area(int r)
    {
        System.out.println("Area of Circle: " +(3.14*r*r));
    }
    float area(float l, float h)
    {
        return(l*h)/2;
    }
    public static void main(String [] args)
    {
        Slip18A ob= new Slip18A();
        ob.area(2,3);
        ob.area(4);
        float r= ob.area(4.5f,5.5f);
        System.out.println("Area of triangle: " +r);
    }
}