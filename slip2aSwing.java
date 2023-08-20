//Design a screen in Java to handle the Mouse Events such as MOUSE_MOVED and MOUSE_CLICK and 
//display the position of the Mouse_Click in a TextField. (Use Swings)

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class slip2aSwing extends JFrame implements MouseListener, MouseMotionListener {
    private JTextField positionTextField;

    public slip2aSwing() {
        setTitle("Mouse Events Demo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        positionTextField = new JTextField(15);
        positionTextField.setEditable(false);

        addMouseListener(this);
        addMouseMotionListener(this);

        JPanel panel = new JPanel();
        panel.add(new JLabel("Mouse Position: "));
        panel.add(positionTextField);

        add(panel, BorderLayout.NORTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new slip2aSwing());
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        positionTextField.setText("(" + x + ", " + y + ")");
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        positionTextField.setText("(" + x + ", " + y + ")");
    }

    // Other MouseListener and MouseMotionListener methods
    @Override
    public void mousePressed(MouseEvent e) { }

    @Override
    public void mouseReleased(MouseEvent e) { }

    @Override
    public void mouseEntered(MouseEvent e) { }

    @Override
    public void mouseExited(MouseEvent e) { }

    @Override
    public void mouseDragged(MouseEvent e) { }
}
