// Write a java program using AWT to create a Frame with title “TYBBACA”, 
// background color RED. If user clicks on close button then frame should close. 

import java.awt.*;
import java.awt.event.*;

public class slip20b {
    public static void main(String[] args) {
        // Create the frame
        Frame frame = new Frame("TYBBACA");

        // Set the background color to RED
        frame.setBackground(Color.RED);

        // Add a WindowListener to handle the close button action
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        // Set the frame size and make it visible
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}

