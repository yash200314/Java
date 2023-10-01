/* Construct a Linked List containing name: CPP, Java, Python and PHP. Then extend your java program to do the following: i. Display the contents of the List using an Iterator ii. Display the contents of the List in reverse order using a ListIterator. 	 */
import java.util.*;

public class slip20a {
    public static void main(String[] args) {
        LinkedList <String> prolang = new LinkedList<>();

        // this is do not understand

        prolang.add("cpp");
        prolang.add("java");
        prolang.add("python");

        System.out.println("Contest of the list using itteration");
        Iterator<String>
        iterator= prolang.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
        System.out.println("in reverse order:");
        ListIterator<String>listIterator = prolang.listIterator(prolang.size());
        while(listIterator.hasPrevious())
        {
            System.out.println(listIterator.previous());
        }
    }
    
}
