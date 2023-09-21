import java.awt.*;
import java.awt.event.*;

public class slip14a {
    private Frame mainFrame;
    private TextField enoField, enameField, salField;
    private Button submitButton;

    public slip14a() {
        mainFrame = new Frame("Employee Details");
        enoField = new TextField(20);
        enameField = new TextField(20);
        salField = new TextField(20);
        submitButton = new Button("Submit");

        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String eno = enoField.getText();
                String ename = enameField.getText();
                String sal = salField.getText();

                showDisplayFrame(eno, ename, sal);
            }
        });

        mainFrame.setLayout(new GridLayout(4, 2));
        mainFrame.add(new Label("Employee No:"));
        mainFrame.add(enoField);
        mainFrame.add(new Label("Employee Name:"));
        mainFrame.add(enameField);
        mainFrame.add(new Label("Salary:"));
        mainFrame.add(salField);
        mainFrame.add(submitButton);

        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        mainFrame.setSize(300, 200);
        mainFrame.setVisible(true);
    }

    private void showDisplayFrame(String eno, String ename, String sal) {
        Frame displayFrame = new Frame("Employee Display");
        displayFrame.setLayout(new FlowLayout());
        displayFrame.add(new Label("Employee Details:"));
        displayFrame.add(new Label("Employee No: " + eno));
        displayFrame.add(new Label("Employee Name: " + ename));
        displayFrame.add(new Label("Salary: " + sal));
        displayFrame.setSize(300, 150);
        displayFrame.setVisible(true);
    }

    public static void main(String[] args) {
        new slip14a();
    }
}
