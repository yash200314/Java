import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class slip19a extends Applet {
    TextField t1;

    public void init() {
        t1 = new TextField(35);
        Font f = new Font("Arial", Font.BOLD, 30);
        add(t1);
        t1.setFont(f);
        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                t1.setText("X Position" + e.getX() + "Y Position" + e.getY());
            }
        });
        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseMoved(MouseEvent e) {
                t1.setText("X Position" + e.getX() + "Y Position" + e.getY());
            }
        });
    }
}
/*
    <html>
    <applet code = slip19a height =300,width=300>
    </applet>
    </html>    
*/
