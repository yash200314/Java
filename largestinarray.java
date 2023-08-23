
//half done code
import java.util.Scanner;

public class largestinarray {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Create an array to store the numbers
        int[] array = new int[n];

        // Populate the array with user input
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Find the largest number in the array
        int largest = array[0];
        for (int i = 1; i < n; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
        }

        // Display the largest number
        System.out.println("The largest number in the array is: " + largest);

        scanner.close();
    }
}
