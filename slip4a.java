// applet calculator
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class slip4a extends Applet implements ActionListener{
    Label l1 ,l2,l3;
    TextField t1,t2,t3;
    Button b1,b2,b3,b4;
    public void init()
    {
        l1 = new Label("Enter the first number :");
        l2 = new Label("Enter the second number :");
        l3 = new Label("Result: ");
        t1 = new TextField(15);
        t2 = new TextField(15);
        t3 = new TextField(15);
        b1 = new Button("Addition");
        b2 = new Button("Substarct");
        b3 = new Button("Multiply");
        b4 = new Button("division");
        add(l1);add(t1);add(b1);b1.addActionListener(this);
        add(l2);add(t2);add(b2);b2.addActionListener(this);
        add(l3);add(t3);add(b3);b3.addActionListener(this);
        add(b4);b4.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            int a=Integer.parseInt(t1.getText());
            int b =Integer.parseInt(t2.getText());
            int c= a+b;
            t3.setText(c+"");
        }
        else if(e.getSource()==b2)
        {
            int a=Integer.parseInt(t1.getText());
            int b =Integer.parseInt(t2.getText());
            int c= a-b;
            t3.setText(c+"");
        }
        else if (e.getSource()==b3)
        {
            int a=Integer.parseInt(t1.getText());
            int b =Integer.parseInt(t2.getText());
            int c= a*b;
            t3.setText(c+"");
        }
        else if(e.getSource()==b4)
        {
            int a=Integer.parseInt(t1.getText());
            int b =Integer.parseInt(t2.getText());
            int c= a/b;
            t3.setText(c+"");
        }
    }
}
/*
<html>
<applet code = slip4a height=300 width=300>
</applet>
</html>
*/


// this applet code is not running