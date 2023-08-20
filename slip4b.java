import java.util.*;
public class slip4b{

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        for(int i=0;i<input.length();i=i+2)
        {
            System.out.println("The alternative character in a  string are:"+input.charAt(i));
        }
        sc.close();
    }
}