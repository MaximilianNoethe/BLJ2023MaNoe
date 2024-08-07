import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TrackerGUI {
    Tracker t = new Tracker();
    JTextField tf1, tf2, tf3, tf4;
    JLabel lb, lb1, lb2, lb3, lb4;
    JButton button1, button2, button3;

    public TrackerGUI() {
        JFrame frame = new JFrame("Finance Tracker");



        lb = new JLabel("Balance: " + t.getBalance());
        lb.setBounds(315, 30, 150, 20);

        lb1 = new JLabel("Total Income: " + t.getTotalIncomesOrExpenses(t.incomes));
        lb1.setBounds(15, 30, 200, 20);


        lb2 = new JLabel("Total Expense: " + t.getTotalIncomesOrExpenses(t.expenses));
        lb2.setBounds(165, 30, 200, 20);

// todo... Label for name and amount of transaction
        tf1 = new JTextField();
        tf2 = new JTextField();
        tf1.setBounds(165, 150, 90, 20);
        tf2.setBounds(265, 150, 90, 20);
        button1 = new JButton("Add income");
        button1.setBounds(15, 150, 110, 20);

        tf3 = new JTextField();
        tf4 = new JTextField();
        tf3.setBounds(165, 175, 90, 20);
        tf4.setBounds(265, 175, 90, 20);
        button2 = new JButton("Add expense");
        button2.setBounds(15, 175, 110, 20);


        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = tf1.getText();
                String valueText = tf2.getText();
                try {
                    double value = Double.parseDouble(valueText);
                    t.addIncome(name, value);

                    lb.setText("Balance: " + t.getBalance());
                    lb1.setText("Total Income: " + t.getTotalIncomesOrExpenses(t.incomes));

                    JOptionPane.showMessageDialog(frame, "Successfully added your income. New Balance: " + t.getBalance());

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter a valid number for the value.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = tf3.getText();
                String valueText = tf4.getText();
                try {
                    double value = Double.parseDouble(valueText);
                    t.addExpense(name, value);

                    lb.setText("Balance: " + t.getBalance());
                    lb2.setText("Total Expense: " + t.getTotalIncomesOrExpenses(t.expenses));


                    JOptionPane.showMessageDialog(frame, "Successfully added your expense. New Balance: " + t.getBalance());

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter a valid number for the value.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        /*button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });*/


        frame.add(button1);
        frame.add(button2);
        //frame.add(button3);
        frame.add(lb);
        frame.add(lb1);
        frame.add(lb2);
        frame.add(tf1);
        frame.add(tf2);
        frame.add(tf3);
        frame.add(tf4);

        frame.setSize(450, 400);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}