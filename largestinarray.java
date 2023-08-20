//half done code
import java.util.Scanner;
public class largestinarray {
    public static void main(String[]args)
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element:");
        n =sc.nextInt();

        int arr[]= new int [n];
        System.out.println("Enter the array element:");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt(); 
        }
        int large1 = arr[0];
        int large2 = arr[1];
        
        if(large1<large2)
        {
            int temp;
            temp = large1;
            large1 = large2;
            large2 = temp;
        }
        sc.close();
    }
}   
