/* Write a java program to display alternate character from a given string.*/
import java.util.*;

public class slip4b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  String");
        String st = sc.nextLine();
        for(int i=0;i<st.length();i=i+2)
        {
            System.out.println("The alternative character :"+st.charAt(i));
        }
        sc.close();
    }
    
}