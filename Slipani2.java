/* Slip 25 )Create a class Student(rollno, name ,class, per), to read student information from the console and
display them (Using BufferedReader class)*/

import java.io.*; 

public class Slipani2 {
    int roll_no;
    String name;
    String Classes;
    float per; 

    Slipani2()
    {
        roll_no =101;
        name = "yash";
        Classes = "ty";
        per = 89;
    } 
    Slipani2(int r,String n,String Cl,float p)
    {
        roll_no = r;
        name = n;
        Classes = Cl;
        per = p;
    }

    void display()
    {
        System.out.println("Student Details are :");
        System.out.println("Roll no:"+roll_no);
        System.out.println("Name:"+name);
        System.out.println("Class:"+Classes);
        System.out.println("Percentage:"+per);
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter roll no of Student:");
        int roll = Integer.parseInt(br.readLine());
        System.out.println("Enter Name of student:");
        String nm = br.readLine();
        System.out.println("Enter the class of Student:");
        String cl = br.readLine();
        System.out.println("Enter the percentage of Student:");
        float pr = Float.parseFloat(br.readLine());

        Slipani2 st = new Slipani2();
        Slipani2 st1 = new Slipani2(roll, nm, cl, pr);
        st.display();
        st1.display();
    }
}
