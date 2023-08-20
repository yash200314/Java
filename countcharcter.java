public class countcharcter {
    public static void main(String[]args)
    {
        String string = "yash is good person";
        int count = 0;

        //count each character except space
        for(int i = 0;i<string.length();i++)
        {
            if(string.charAt(i)!=' ')
            count++;
        }
        System.out.println("Total:"+ count);
    }
}
