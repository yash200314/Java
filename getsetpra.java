//create a class cylinder and use getters and setter to set its radius and height
class Mycylinder {
    private int height;
    private int  radius;

    public int getRadius(){
        return radius;
    }
    public void setRadius(int radius){
        this.radius = radius;
    }

    // this one is for height

    public int getHeight(){
        return height;
    }
    public void setHeight(int height){
        this.height = height;
    }

}
public class getsetpra{
    public static void main(String[] args) {
       // cylinder cy = new cylinder();
        //int h = cy.setHeight(12);
      //  int r = cy.setRadius(9);
        
        Mycylinder cy = new Mycylinder();
        cy.setHeight(12);
        cy.setRadius(13);
        System.out.println(cy.getHeight());
        System.out.println(cy.getRadius());
    }
}