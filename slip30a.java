
import javax.swing.*;

public class slip30a {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        JLabel label = new JLabel("hello Swing");
        JButton button = new JButton("Click here !!");
        frame.add(label);
        frame.add(button);
        frame.setVisible(true);
    }
    
}
