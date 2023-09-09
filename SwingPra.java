//this is an example of swing java not a question from slip
import javax.swing.*;
import java.awt.*;

public class SwingPra {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setBounds(100,200,300,50);
        Container c = jf.getContentPane();
        c.setLayout(null);


        ImageIcon ic = new ImageIcon("jaguar.jpg");
        JButton btn = new JButton(ic);
        btn.setSize(100,20);
        btn.setLocation(100,100);
        c.add(btn);


        Font font = new Font("Arial",Font.BOLD,20);
        btn.setFont(font);

        btn.setText("My life");
        btn.setForeground(Color.RED);
        btn.setBackground(Color.BLACK);
        
        // creating a cursor

        Cursor cr = new Cursor(Cursor.HAND_CURSOR);  
        btn.setCursor(cr);
        
        // this one is for enabling the button 

        btn.setEnabled(false);

        //when don't want to show the button
        btn.setVisible(false);
        


        jf.setVisible(true);

    }    
}
