import java.util.*;

public class slip15b {
    public static void main(String[] args) {
        String[] names={"Rehan","Priyanka","Rishab","Yash"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name to be searched");
        String searchName = sc.nextLine();
        int index=-1;
        for(int i=0;i<searchName.length();i++)
        {
            if(names[i].equalsIgnoreCase(searchName))
            {
                index =i;
                break;
            }
        }
        if(index!=-1)
        {
            System.out.println("name found at index"+index);
        }
        else{
            System.out.println("Name is not there");
        }
        sc.close();
    }   
}
