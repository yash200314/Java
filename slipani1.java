
/*Write a program to create parent class College(cno, cname, caddr) and derived class Department(dno, dname) from College.
Write a necessary methods to display College details.*/
import java.io.*;

class college {
    int cno;
    String name;
    String caddr;

    college(int cno, String name, String caddr) {
        this.cno = cno;
        this.name = name;
        this.caddr = caddr;
    }

    public void accept() throws Exception {
        // this is of string buffer
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // the string buffer is to create mutable string
        System.out.println("EnterCollegeNumber,Name,Address");
        cno = Integer.parseInt(br.readLine());
        name = br.readLine();
        caddr = br.readLine();
    }

    public void display() {
        System.out.println("College cno:" + cno);
        System.out.println("College Name:" + name);
        System.out.println("College Address:" + caddr);
    }
}

class department extends college {
    int dno;
    String dnm;

    department(int cno, String name, String caddr, int dno, String dnm) {
        super(cno, name, caddr);
        this.dno = dno;
        this.dnm = dnm;
    }

    public void accept() throws Exception {
        super.accept();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Department number,name");
        dno = Integer.parseInt(br.readLine());
        dnm = br.readLine();
    }

    public void display() {
        super.display();
        System.out.println("Department number:" + dno);
        System.out.println("Department Name:" + dnm);
    }
}

/**
 * slipani1
 */
public class slipani1 {
    public static void main(String g[]) throws Exception {
        department obj = new department(201, "mmcc", "pune", 101, "cs");
        obj.accept();
        obj.display();
    }
}