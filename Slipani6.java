/* Write a program to define class Person withdata member as Personname,Aadharno, Panno.Accept
information for 5 objects and display appropriate information (use this keyword).
 */

 import java.io.*;
public class Slipani6 {

    int adharno;
    String name;
    int panno;

    Slipani6()
    {
        adharno = 1234;
        name = "yash";
        panno = 123456789;
    }
    Slipani6(int adharno ,String name,int panno)
    {
        this.adharno = adharno;
        this.name = name;
        this.panno = panno;
    }

    void accept() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number:");
        adharno = Integer.parseInt(br.readLine());
        System.out.println("Enter the name:");
        name = br.readLine();
        System.out.println("Enter the panno:");
        panno = Integer.parseInt(br.readLine());
    }
    void display()
    {
        System.out.println("Adharno:"+adharno);
        System.out.println("Name is:"+name);
        System.out.println("pan no is:"+panno);
    }

    public static void main(String[] args)throws Exception {
        Slipani6 sl = new Slipani6();
        sl.accept();
        sl.display();
        
    }
}
