//write a menu driven program
import java.util.*;
class addition
{
    public static void main(String args[])
    {
       int m,n,ch,add,sub,mul,div;
       Scanner scanner= new Scanner(System.in);//created scanner obj
       System.out.println("Enter the first number :");
       m = scanner.nextInt();//taking the input accepting
       System.out.println("Enter the second number :");
       n = scanner.nextInt();
       while(true)
       {
            System.out.println("1.Addition");
            System.out.println("2.Sub");
            System.out.println("3.Multiply");
            System.out.println("4.Division");
            System.out.println("5.Exit");
            System.out.println("Enter the choice:");
            ch = scanner.nextInt();
            switch(ch)
            {
                case 1: 
                    add = m+n;
                    System.out.println("Addition is ="+add);
                    break;
                case 2:
                    sub = m-n;
                    System.out.println("Substract is ="+sub);
                    break;
                case 3:
                    mul = m*n;
                    System.out.println("Multiply is ="+mul);
                    break;
                case 4:
                    div = m/n;
                    System.out.println("division is ="+div);
                    break;
                case 5:
                    System.exit(0);
                    scanner.close();
            }
       }
    }
}