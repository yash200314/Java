import java.util.Scanner;
public class slip9b{ 
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number:");
        int n=sc.nextInt();
        System.out.println("Fibo series of "+n+"numbers:");
        for (int i=0;i<n;i++)
        {
            System.out.println(fib(i)+" ");
        }
        sc.close();
    }

    public static int fib(int n)
    {
        if(n<=1)
            return n;
        else
            return fib(n-1)+fib(n-2);
    }
}