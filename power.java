import java.util.*;
public class power {
    public static void main(String args[])
    {
        int base,i,pow; 
        int ans =1;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number:");
        base = sc.nextInt();

        System.out.println("Enter the power");
        pow= sc.nextInt();
        for(i=0;i<pow;i++)
        {
            ans = base *ans;
            System.out.println("the answer:"+ans);
            sc.close();
        }
    }
}
