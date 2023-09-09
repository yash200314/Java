//this is an example of prime number 
import java.util.*;
public class exceptionpra {
    public static void main(String[] args) 
    {
        boolean flag = false;
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter the number:");
        num = sc.nextInt();
        for(int i = 1;i<= num/2;i++){
            if(num%i==0)
            {
                flag= true;
            }
        }
        if(!flag)
            System.out.println(num +"is a prime number");
        else
            System.out.println(num +"is not a prime number");

        sc.close();
    }
}
