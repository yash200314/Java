/* Write a java Program to accept the details of 5 employees (Eno, Ename, Salary) and display it onto the JTable. */

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class slip28b{
    private JFrame frame;
    private DefaultTableModel tableModel;
    private JTable table;
    private JTextField enoField, enameField, salaryField;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                slip28b window = new slip28b();
                window.frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public slip28b() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new BorderLayout(0, 0));

        JPanel inputPanel = createInputPanel();
        frame.getContentPane().add(inputPanel, BorderLayout.NORTH);

        JScrollPane scrollPane = createTablePanel();
        frame.getContentPane().add(scrollPane, BorderLayout.CENTER);
    }

    private JPanel createInputPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.LEFT));

        JLabel lblEno = new JLabel("Employee Number:");
        enoField = new JTextField(10);

        JLabel lblEname = new JLabel("Employee Name:");
        enameField = new JTextField(10);

        JLabel lblSalary = new JLabel("Salary:");
        salaryField = new JTextField(10);

        JButton addButton = new JButton("Add Employee");
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addEmployee();
            }
        });

        panel.add(lblEno);
        panel.add(enoField);
        panel.add(lblEname);
        panel.add(enameField);
        panel.add(lblSalary);
        panel.add(salaryField);
        panel.add(addButton);

        return panel;
    }

    private JScrollPane createTablePanel() {
        tableModel = new DefaultTableModel();
        tableModel.addColumn("Employee Number");
        tableModel.addColumn("Employee Name");
        tableModel.addColumn("Salary");

        table = new JTable(tableModel);
        return new JScrollPane(table);
    }

    private void addEmployee() {
        String eno = enoField.getText();
        String ename = enameField.getText();
        String salary = salaryField.getText();

        if (!eno.isEmpty() && !ename.isEmpty() && !salary.isEmpty()) {
            tableModel.addRow(new String[] { eno, ename, salary });
            enoField.setText("");
            enameField.setText("");
            salaryField.setText("");
        } else {
            JOptionPane.showMessageDialog(frame, "Please fill in all fields.");
        }
    }
    
}