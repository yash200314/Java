/* Write a java program to accept a number from user, If it is greater than 1000 then throw 
user defined exception “Number is out of Range” otherwise display the factors of that number.
(Use static keyword) */

import java.util.*;

class numberException extends Exception {
    numberException(String message) {
        super(message);
    }
}

public class slip26b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        sc.close();
        try {
            if (num > 1000) {
                throw new numberException("number is out range");
            }
            System.out.println("Factors are :");
            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    System.out.println(i);
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }
}