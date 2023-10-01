/* Write a menu driven java program using command line arguments for the following: 
1. Addition 2. Subtraction 3. Multiplication 4. Division.  */
import java.util.*;

public class slip11b {
    public static void main(String[] args) {

        int ch, add, sub, mul, div;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        while (true) {
            System.out.println("\n 1: Addition");
            System.out.println("\n 2:substract");
            System.out.println("\n 3:Multiply");
            System.out.println("\n 4:divide");

            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    add = a + b;
                    System.out.println("Addition is =" + add);
                    break;
                case 2:
                    sub = a - b;
                    System.out.println("Substract is =" + sub);
                    break;
                case 3:
                    mul = a * b;
                    System.out.println("Multiply is =" + mul);
                    break;
                case 4:
                    div = a / b;
                    System.out.println("division is =" + div);
                    break;
                case 5:
                    System.exit(0);
                    sc.close();
            }
        }

    }
}
