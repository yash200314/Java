// half done code

// import java.util.Scanner;

// // Custom Exception class
// class NumberIsZeroException extends Exception {
//     public NumberIsZeroException() {
//         super("Number Is Zero");
//     }
// }
  
// public class slip6bexcept {
//     // Method to calculate the sum of first and last digit of a number
//     public static int calculateSumOfFirstAndLastDigit(int number) {
//         // Convert the number to a positive value (for handling negative numbers)
//         int positiveNumber = Math.abs(number);
        
//         // Extract the first digit
//         int firstDigit = positiveNumber;
//         while (firstDigit >= 10) {
//             firstDigit /= 10;
//         }
        
//         // Extract the last digit
//         int lastDigit = positiveNumber % 10;
        
//         // Calculate the sum of the first and last digit
//         return firstDigit + lastDigit;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a number: ");
//         int number = sc.nextInt();

//         try {
//             // Check if the number is zero
//             if (number == 0) {
//                 throw new NumberIsZeroException();
//             }

//             // Calculate the sum of first and last digit
//             int sum = calculateSumOfFirstAndLastDigit(number);
//             System.out.println("Sum of first and last digit: " + sum);
//         } catch (NumberIsZeroException e) {
//             System.out.println("Error: " + e.getMessage());
//         }
//     }
// }