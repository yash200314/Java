import javax.swing.*;
class myFrame extends JFrame{
    JCheckBox cb;
    JButton btn;

    myFrame()
    {

        cb.setLayout(null);

        btn = new JButton("click here!!!");
        btn.setBounds(100,200,100,50);
        cb.add(btn);
        
    }
}
public class SwingPratice {
     public static void main(String[] args) {
         
        myFrame f = new myFrame();
        f.setTitle("Action Listners");
        f.setSize(500, 500);
        f.setLocation(100, 100);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
     }
}
