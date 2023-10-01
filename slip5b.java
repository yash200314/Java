//Write a java program to display following pattern: 

/*
5 
4 5 
3 4 5 
2 3 4 5 
1 2 3 4 5     
*/


public class slip5b {
    public static void main(String []args)
    {
        int row=5;
        for(int i=row;i>=1;i--)
        {
            for(int j=i;j<=row;j++)
            {
                System.out.print(j+"  ");
            }
             System.out.println();
        }
    }
}