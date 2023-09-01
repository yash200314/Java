import java.io.*;
public class slip23brever {
    public static void main(String[] args) throws Exception
    {
        FileReader fr =new FileReader(args[0]);
        int data = 0;
        String  s = new String("");
        char ch;
        
        while(data != -1)
        {
            data = fr.read();
            ch = (char) data;
            if(data != -1)
            {
                s = s+ ch;
            }
        }
        StringBuffer sb = new StringBuffer(s);
        sb = sb.reverse();
        s = new String(sb);
        System.out.println(s);
        fr.close();
    }
    
}
