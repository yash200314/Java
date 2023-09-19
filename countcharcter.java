import java.util.*;

public class countcharcter {
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        s = sc.nextLine();
        int count = 0;

        // count each character except space
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                count++;
            }
        }
        System.out.println("Total:" + count);
        sc.close();
    }
}
