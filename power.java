import java.util.*;
public class power {
    public static void main(String args[])
    {
        int base,pow,i;
        int ans=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base ");
        base= sc.nextInt();
        System.out.println("Enter the power");
        pow= sc.nextInt();
        for(i=0;i<pow;i++)
        {
            ans = base*ans;
            sc.close();  
        }
        System.out.println("answer is:"+ans);
    }
}