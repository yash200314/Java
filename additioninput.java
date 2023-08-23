import java.util.*;
public class additioninput {
    public static void main(String[] args) 
    {
        int num1,num2 ;
        double result;
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First number:");
        num1 = sc.nextInt();
        System.out.println("Enter the First number:");
        num2 = sc.nextInt();
        result = num1 + num2;

        System.out.println("the addition is:"+result);

        sc.close();
    }
    
}
