//Write a java program to display following pattern: 

/*5 
4 5 
3 4 5 
2 3 4 5 
1 2 3 4 5     
 */
public class slip5b {
    
    public static void main(String args[])
    {
        for(int i=5;i>1;i--)
        {
            for(int j=1;j<i;j++){
                System.out.println(" ");
                for(int k=5;k>=i;k--)
                    System.out.println(k);
            }
        }
    }
}
