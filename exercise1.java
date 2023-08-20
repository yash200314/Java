import java.util.Scanner;
public class exercise1 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first marks:");
        float marks1 = sc.nextInt(); 
        System.out.println("Enter the second marks:");
        float marks2= sc.nextInt();
        System.out.println("Enter the third marks:");
        float marks3= sc.nextInt();
        
        System.out.println("Enter the fourth marks:");
        float marks4= sc.nextInt();

        System.out.println("Enter the fifth marks:");
        float marks5= sc.nextInt();

        float percentage = ((marks1 + marks2 + marks3 +marks4 +marks5)/500)*100;
        System.out.println(percentage); 

        sc.close();
    }    
}
