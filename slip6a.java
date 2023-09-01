//Write a java program to display transpose of a given matrix
public class slip6a {
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int transpose[][] = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                transpose[i][j] = arr[j][i];
            }
        }
        System.out.println("Before matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(arr[i][j]);
            }
            System.out.println();
        }
        System.out.println("After Matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(transpose[i][j] + "");
            }
            System.out.println();
        }
    }
}