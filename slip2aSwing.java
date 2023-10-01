//Design a screen in Java to handle the Mouse Events such as MOUSE_MOVED and MOUSE_CLICK and 
//display the position of the Mouse_Click in a TextField. (Use Swings)

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class slip2aSwing extends JFrame implements MouseListener, MouseMotionListener {
  JTextField t1;

  public slip2aSwing() {
    t1 = new JTextField(25);
    Font f = new Font("Arial", Font.BOLD, 20);
    t1.setFont(f);
    setLayout(new FlowLayout());
    setVisible(true);
    setSize(700, 700);
    add(t1);
    addMouseListener(this);
    addMouseMotionListener(this);
  }

  public void mouseClicked(MouseEvent e) {
    t1.setText("X Position :" + e.getX() + "Y Position :" + e.getY());
  }

  public void mousePressed(MouseEvent e) {
  }

  public void mouseReleased(MouseEvent e) {
  }

  public void mouseEntered(MouseEvent e) {
  }

  public void mouseExited(MouseEvent e) {
  }

  public void mouseMoved(MouseEvent e) {
    t1.setText("X Position :" + e.getX() + "Y Position :" + e.getY());
  }

  public void mouseDragged(MouseEvent e) {
  }

  public static void main(String args[]) {
    slip2aSwing ob = new slip2aSwing();
  }
}