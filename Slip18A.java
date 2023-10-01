/* Write a java program to copy the data from one file into another file, while copying change the case of characters in target file and replaces all digits by ‘*’ symbol.  */

import java.io.*;

public class Slip18A {
    public static void main(String[] args) {
        String sourceFilePath = "source.txt"; // Replace with the actual source file path
        String targetFilePath = "target.txt"; // Replace with the actual target file path

        try {
            FileReader reader = new FileReader(sourceFilePath);
            FileWriter writer = new FileWriter(targetFilePath);

            int charValue;
            while ((charValue = reader.read()) != -1) {
                char character = (char) charValue;

                if (Character.isLetter(character)) {
                    if (Character.isUpperCase(character)) {
                        character = Character.toLowerCase(character);
                    } else {
                        character = Character.toUpperCase(character);
                    }
                } else if (Character.isDigit(character)) {
                    character = '*';
                }

                writer.write(character);
            }

            reader.close();
            writer.close();

            System.out.println("File copied and modified successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}