
//ask username and print it in  the uppercase
import java.util.Scanner;

public class slip13a {
    public static void main(String arg[]) {

        System.out.println("Enter your name:");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.toUpperCase();
        System.out.println("hello " + s + " jai shree ram");

        sc.close();
    }

}
