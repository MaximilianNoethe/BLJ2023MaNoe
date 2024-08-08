import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TrackerGUI {
    JFrame frame = new JFrame("Finance Tracker");
    Tracker t = new Tracker();
    JTextField tf1, tf2, tf3, tf4;
    JLabel lb1, lb2, lb3;
    JButton button1, button2, button3;

    public TrackerGUI() {
        lb1 = new JLabel("Balance: " + t.getBalance());
        lb2 = new JLabel("Total Income: " + t.getTotalTransaction(t.incomes));
        lb3 = new JLabel("Total Expense: " + t.getTotalTransaction(t.expenses));


        // todo... Label for name and amount of transaction
        tf1 = new JTextField();
        tf1.setText("Income name");
        tf1.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (tf1.getText().equals("Income name")) {
                    tf1.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (tf1.getText().equals("")) {
                    tf1.setText("Income name");
                }
            }
        });


        tf2 = new JTextField();
        tf2.setText("Income value");
        tf2.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (tf2.getText().equals("Income value")) {
                    tf2.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (tf2.getText().equals("")) {
                    tf2.setText("Income value");
                }
            }
        });

        tf3 = new JTextField();
        tf3.setText("Expense name");
        tf3.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (tf3.getText().equals("Expense name")) {
                    tf3.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (tf3.getText().equals("")) {
                    tf3.setText("Expense name");
                }
            }
        });

        tf4 = new JTextField();
        tf4.setText("Expense value");
        tf4.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (tf4.getText().equals("Expense value")) {
                    tf4.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (tf4.getText().equals("")) {
                    tf4.setText("Expense value");
                }
            }
        });


        button1 = new JButton("Add income");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = tf1.getText();
                String valueText = tf2.getText();
                try {
                    double value = Double.parseDouble(valueText);
                    t.addIncome(name, value);

                    lb1.setText("Balance: " + t.getBalance());
                    lb2.setText("Total Income: " + t.getTotalTransaction(t.incomes));

                    JOptionPane.showMessageDialog(frame, "Successfully added your income. New Balance: " + t.getBalance());

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter a valid number for the value.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        button2 = new JButton("Add expense");
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = tf3.getText();
                String valueText = tf4.getText();
                try {
                    double value = Double.parseDouble(valueText);
                    t.addExpense(name, value);

                    lb1.setText("Balance: " + t.getBalance());
                    lb3.setText("Total Expense: " + t.getTotalTransaction(t.expenses));


                    JOptionPane.showMessageDialog(frame, "Successfully added your expense. New Balance: " + t.getBalance());

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter a valid number for the value.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        button3 = new JButton("Details");
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == button3) {
                    DetailedGUI detailedWindow = new DetailedGUI();
                }
            }
        });


        frame.add(lb2);
        frame.add(lb3);
        frame.add(lb1);
        frame.add(button1);
        frame.add(tf1);
        frame.add(tf2);
        frame.add(button2);
        frame.add(tf3);
        frame.add(tf4);
        frame.add(button3);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450, 400);
        frame.setLayout(new GridLayout(0, 3));
        frame.setVisible(true);

       /* int a = JOptionPane.showConfirmDialog(frame, "You are now closing this window.");

        if (a == JOptionPane.YES_OPTION){
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }*/
    }
/*
    public void windowClosing(WindowEvent e){

        int a = JOptionPane.showConfirmDialog(frame, "You are now closing this window.");

        if (a == JOptionPane.YES_OPTION){
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }

    }*/
}