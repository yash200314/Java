import java.util.Scanner;

class underage extends Exception {
    public underage(String message) {
        super(message);
    }
}

public class slip29b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try 
        {
            System.out.println("enter candidates age:");
            int age = sc.nextInt();
            check(age);
            System.out.println("candidate is eligible for voting");
        }
         catch (underage e) 
        {
            System.out.println("underage:" + e.getMessage());
        } 
        finally
        {
            System.out.println("~~~~");
            System.out.println("All working properly");
        }
        sc.close();
    }

    static void check(int age) throws underage {
        if (age < 18 || age < 0) {
            throw new underage("candidate is underage and not eligible for voting");
        }
    }
}
