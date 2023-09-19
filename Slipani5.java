/*Define a Item class (item_number, item_name,item_price). Define a default and parameterized
constructor. Keep a count of objects created. Create objects using parameterized constructor and display the
object count after each object is created.(Use staticmember and method). Also display the contents of each object. */

import java.io.*;
public class Slipani5 {
    int Itemno;
    String Itemname;
    float Itemprice;
    static int cnt = 0;

    Slipani5()
    {
        Itemno= 1000;
        Itemname ="pen";
        Itemprice =45;
        cnt++;
    }
    Slipani5(int ino,String name,float pr)
    {
        Itemno = ino;
        Itemname = name;
        Itemprice = pr;
        cnt++;
    }
    void display()
    {
        System.out.println();
        System.out.println("Item Details");
        System.out.println("Item number:"+Itemno);
        System.out.println("Item name:"+Itemname);
        System.out.println("Item price:"+Itemprice);
    }
    void countobject()
    {
        System.out.println("Object count:"+cnt);
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the item number:");
        int i = Integer.parseInt(br.readLine());
        System.out.println("Enter the item name:");
        String nm= br.readLine();
        System.out.println("Enter item price:");
        float p =Float.parseFloat(br.readLine());

        Slipani5 obj1 = new Slipani5();
        Slipani5 ob = new Slipani5(i,nm,p);
        ob.display();
        obj1.display();
        obj1.countobject();
    }
    
}
