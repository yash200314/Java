class nooutofrangeException extends Exception{
    nooutofrangeException()
    {
        System.out.println("sorry wrong input");
    }
}
public class slip27a {

    static int i,n;
    public static void main(String[] args) {
        try {
            n=Integer.parseInt(args[0]);
            if(n>1000)
            {
                throw new nooutofrangeException();
            }
            else{
                System.out.println("Factor are :"+n);
                for(i=1;i<=n;i++)
                {
                    if(n%i==0)
                    {
                        System.out.println("\t"+i);
                    }
                }
            }
        } 
        catch (nooutofrangeException e) {
            System.out.println("Error in number");
            
        }
    }
    
}
