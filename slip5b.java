//Write a java program to display following pattern: 
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
