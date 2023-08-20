import java.util.*;
public class armstrong {
    static int n;
    public static void main(String args[])
    {
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        armstrong.n=sc.nextInt();   
        System.out.println("Enter the number:"+n);
        int sum =0,rem=0,temp=n;
        while(armstrong.n!=0)
        {
            rem = armstrong.n%10;
            sum = sum+(rem*rem*rem);
            armstrong.n=armstrong.n/10;
        }
        System.out.println("the sum of cub of each digit is:"+sum);
        if(temp == sum) 
        {
            System.out.println("\t number is on armstrong number:");
        } 
        else
        {
            System.out.println("\t number is not an armstrong number:");
        }
        sc.close();
    } 
}
