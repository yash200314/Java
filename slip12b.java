/* Write a java program to display each String in reverse order from a String array.  */

public class slip12b {
    public static void main(String[] args) {
        String[] stringArray ={"hello","yash"};
        System.out.println("original array");

        displayAndReverseStringArray(stringArray);
    }
    private static void
    displayAndReverseStringArray(String [] array)
    {
        System.out.println("original Array");
        for(String str:array)
        {
            System.out.println(str);
        }
        System.out.println("reversed array");
        for(String str:array)
        {
            StringBuilder reversed = new StringBuilder(str).reverse();
            System.out.println(reversed);
        }
        
    }
    
}
