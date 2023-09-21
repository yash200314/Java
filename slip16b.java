import java.util.Scanner;

public class slip16b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        int sum = calculateSumDigit(num);
        System.out.println("Sum of Digit is:"+sum);
        sc.close();
    }
    public static int calculateSumDigit(int num)
    {
        if(num==0)
        {
            return 0;
        }
        else{
            return num%10+calculateSumDigit(num/10);
        }
    }
}
