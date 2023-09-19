/* Write a java program to display multiplication table of a given number into 
the List box by clicking on button. */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class slip12a {
    private JFrame frame;
    private JPanel panel;
    private JLabel titleLabel;
    private JTextField numberField;
    private JButton generateButton;
    private JList<String> tableList;
    private DefaultListModel<String> listModel;

    public slip12a() {
        frame = new JFrame("Multiplication Table Generator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);

        panel = new JPanel();
        panel.setLayout(new GridLayout(4, 1));

        titleLabel = new JLabel("Enter a number to generate its multiplication table:");
        numberField = new JTextField();
        generateButton = new JButton("Generate Table");
        listModel = new DefaultListModel<>();
        tableList = new JList<>(listModel);

        generateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                generateMultiplicationTable();
            }
        });

        panel.add(titleLabel);
        panel.add(numberField);
        panel.add(generateButton);
        panel.add(new JScrollPane(tableList));

        frame.add(panel);
        frame.setVisible(true);
    }

    private void generateMultiplicationTable() {
        listModel.clear();
        try {
            int number = Integer.parseInt(numberField.getText());
            for (int i = 1; i <= 10; i++) {
                int result = number * i;
                listModel.addElement(number + " x " + i + " = " + result);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame, "Please enter a valid number.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new slip12a();
            }
        });
    }
    
}