import java.util.Arrays;
import java.util.Scanner;

public class slip16a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of employees");
        int n = sc.nextInt();

        String[] employee = new String[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the name of employee");
            employee[i]= sc.next();
        }
        Arrays.sort(employee);

        System.out.println("sorted employee name");
        for(String employees: employee)
        {
            System.out.println(employees);
        }
        sc.close();
    }
    
}
