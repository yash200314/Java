import java.util.Scanner;
public class swap{
    public static void main(String args[])
    {
        int a,b,c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        a=scanner.nextInt();
        System.out.println("Enter the second number:");
        b= scanner.nextInt();
        c=a; 
        a=b;
        b=c;
        System.out.println("the first number is :"+a);
        System.out.println("the second number is :"+b);

        scanner.close();
    }
}