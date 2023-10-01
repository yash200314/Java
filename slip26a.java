/* Write a java program to display ASCII values of the characters from a file */

import java.io.FileReader;

public class slip26a {
    public static void main(String[] args) throws Exception{
        String fname=args[0];
        FileReader fr = new FileReader(fname);
        int data =0;
        while(data !=-1)
        {
            data=fr.read();
            if(data!=-1)
            {
                System.out.println(" "+data);
            }
            fr.close();
        }
    }
}
