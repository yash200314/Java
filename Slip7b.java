// Write a java AWT program to display Label with text “Dr. D Y Patil College”,
// background color Red and font size 20 on the frame.

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label; 
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Slip7b{
    public static void main(String[] args) {
        Frame frame = new Frame("Label Example");

        Label label = new Label("Dr.Dy Patil College");

        label.setBackground(Color.RED);
         
        Font font = new Font ("Arial",Font.PLAIN,20);
        label.setFont(font);
        frame.add(label);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        frame.setSize(400,300);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
