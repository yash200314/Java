// this is a pratice question
import java.io.*;
//import java.util.Scanner;
public class FileHandlingPra {
    public static void main(String[] args) {

        // this is how to create a file
        /* 
        File myFile = new File("this.txt");
        try
        {
            myFile.createNewFile();
        }
        catch(IOException e)
        {
            System.out.println("unable to create file");
            e.printStackTrace();
        }
        */
        // code to write in a file

        // try
        // {
        //     FileWriter FileWriter = new FileWriter("this.txt");
        //     FileWriter.write("this is first file handling ");
        //     FileWriter.close();
        // } 
        // catch (IOException e) 
        // {
        //     e.printStackTrace();
        // }

        // reading  a file
        /*
        File myFile = new File("this.txt");
        try {
            Scanner sc = new Scanner(myFile);

            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        */
        File myFile = new File("this2.txt");
        if(myFile.delete())
        {
            System.out.println("i have delete file"+myFile.getName());
        }
        else{
            System.out.println("Error occured !!!");
        }
    }
    
}
