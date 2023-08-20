//write a java to check if the string contains vowel
//import java.awt.*;
import java.util.Scanner;
public class vowel {
    public static void  main(String args[])
    {
        Scanner  scanner = new Scanner(System.in);
        System.out.println("enter the string:");
        String input = scanner.nextLine();
        for(int i=0;i<input.length();i++)
        {
            char ch = input.charAt(i);
            if(ch == 'a'||ch =='A'||ch == 'e'||ch =='E'||ch == 'i'||ch =='I'||ch == 'o'||ch =='O'||ch == 'u'||ch =='U')
            {
                System.out.println("vowel="+ch);
            }
            else{
                System.out.println("Consonet");
            }
        }
        scanner.close();
    }
}
