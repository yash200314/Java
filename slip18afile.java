//Write a java program to copy the data from one file into another file,
// while copying change the case of characters in target file and replaces all digits by 
//‘*’ symbol.
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class slip18afile {
    public static void main(String[] args) {
        String  sourceFilePath ="source.txt";
        String targetFilePath ="target.txt";

        try{
            FileReader reader = new FileReader(sourceFilePath);
            FileWriter writer = new FileWriter(targetFilePath);
            int charvalue;
            while((charvalue = reader.read())!=-1){
                char character = (char) charvalue;

                if(Character.isLetter(character))
                {
                    if(Character.isUpperCase(character)){
                        character = Character.toLowerCase(character);
                    }else{
                        character = Character.toUpperCase(character);
                    }
                }else if(Character.isDigit(character)){
                    character ='*';
                }
                writer.write(character);
            }
            reader.close();
            writer.close();
            System.out.println("file copied and modified  successfully");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
