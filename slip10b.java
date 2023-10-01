/* Write a java program to count the frequency of each character in a given string. */

import java.util.*;

public class slip10b {
    public static void main(String[] args) {
        System.out.println("Enter the string :");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int freq[] = new int[str.length()];
        int j, i;

        char string[] = str.toCharArray();
        for (i = 0; i < str.length(); i++) {
            freq[i] = 1;
            for (j = i + 1; j < str.length(); j++) {
                if (string[i] == string[j]) {
                    freq[i]++;
                    string[j] = '0';
                }
            }
        }
        for (i = 0; i < freq.length; i++) {
            if (string[i] != '0') {
                System.out.println(string[i] + "----" + freq[i]);
            }
        }
    }
}
