import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class slip10a extends JFrame implements ActionListener {
    JLabel[] labels = {new JLabel("Principal:"), new JLabel("Rate:"), new JLabel("Years:"), new JLabel("Total:"), new JLabel("Interest:")};
    JTextField[] fields = {new JTextField(10), new JTextField(10), new JTextField(10), new JTextField(10), new JTextField(10)};
    JButton calculate = new JButton("Calculate"), clear = new JButton("Clear"), close = new JButton("Close");

    slip10a() {
        setLayout(new GridLayout(6, 2));
        for (JLabel label : labels) add(label);
        for (JTextField field : fields) add(field);

        add(calculate); add(clear); add(close);

        calculate.addActionListener(this);
        clear.addActionListener(this);
        close.addActionListener(this);

        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Compound Interest Calculator");
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == calculate) {
            double p = Double.parseDouble(fields[0].getText());
            double r = Double.parseDouble(fields[1].getText());
            double n = Double.parseDouble(fields[2].getText());

            double total = p * Math.pow(1 + r / 100, n);
            fields[3].setText(String.format("%.2f", total));
            fields[4].setText(String.format("%.2f", total - p));
        } else if (e.getSource() == clear) {
            for (JTextField field : fields) field.setText("");
        } else if (e.getSource() == close) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new slip10a();
    }
}