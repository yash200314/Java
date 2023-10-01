import java.util.*;

public class slip25a{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String val = sc.nextLine();

        if(val.equals(new StringBuilder(val).reverse().toString()))
        {
            System.out.println(val+": The string is a palindrome");
        }
        else{
            System.out.println(val+": The string is not a palindrom");
        }
        sc.close();
    }
}
