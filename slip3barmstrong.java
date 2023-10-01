// //Write a java program to check whether given number is Armstrong or not. 
// (Use static keyword) 

import java.util.Scanner;

public class slip3barmstrong {
    static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        n = sc.nextInt();
        int sum = 0, rem, temp = n;
        while (n != 0) {
            rem = n % 10;
            sum = sum + (rem * rem * rem);
            n = n / 10;
        }
        if (temp == sum) {
            System.out.println("The number is armstrong :" + sum);
        } else {
            System.out.println("The number is not armstrong :" + sum);
        }
        sc.close();
    }

}