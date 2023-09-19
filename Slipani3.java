/* Write a program to display the Employee(Empid, Empname, Emp Designation, Empsal) information using
toString()*/

public class Slipani3 {
    int id, salary;
    String name;
    String design;

    Slipani3(int id, String name, int salary, String design) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.design = design;
    }
    public String toString() // override toString() method
    {
        return id+" "+name+" "+salary+" "+design;
    }
    public static void main(String[] args) {
        Slipani3 E1 = new Slipani3(111, "yash", 100000, "pune");
        Slipani3 E2 = new Slipani3(2, "xyz", 12000, "latur");
        System.out.println(E1);
        System.out.println(E2);
    }
}
