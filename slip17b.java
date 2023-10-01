/* Write a java Program to accept ‘n’ no’s through command line and store only armstrong no’s into the array
and display that array. 		 */
public class slip17b {
    public static void main(String[] args) {
        int n=0,j=0,i=0,r=0,temp=n,s=0;

        int armstrong[] = new int [args.length];
        for(i=0;i<args.length;i++)
        {
            s=0;
            n=Integer.parseInt(args[i]);
            temp=n;
            while(n!=0)
            {
                r=n%10;
                s=s+(r*r*r);
                n=n/10;
            }
            if(temp==s)
            {
                armstrong[j]=temp;
                j++;
            }
        }
        System.out.println("Printing  the armstrong array");
        for(i=0;i<j;i++)
        {
            System.out.println("\t"+armstrong[i]);
        }
    }
    
}
