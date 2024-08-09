import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TrackerGUI {
    private JFrame frame = new JFrame("Finance Tracker");
    private Tracker t = new Tracker();
    private JTextField incomeNameTF, incomeValueTF, expenseNameTF, expenseValueTF;
    private JLabel balanceLB, totIncomeLB, totExpenseLB, placeholder1, placeholder2;
    private JButton addIncomeB, addExpenseB, detailsB;
    private String currency = "CHF";
    private int fontsize = 20;

    public TrackerGUI() {
        placeholder1 = new JLabel();
        placeholder2 = new JLabel();
        balanceLB = new JLabel("Balance: " + t.getBalance() + currency);
        balanceLB.setFont(new Font(null, Font.PLAIN, fontsize));

        totIncomeLB = new JLabel("Total Income: " + t.getTotalTransaction(t.incomes) + currency);
        totIncomeLB.setFont(new Font(null, Font.PLAIN, fontsize));

        totExpenseLB = new JLabel("Total Expense: " + t.getTotalTransaction(t.expenses) + currency);
        totExpenseLB.setFont(new Font(null, Font.PLAIN, fontsize));


        incomeNameTF = new JTextField();
        incomeNameTF.setFont(new Font(null, Font.PLAIN, fontsize));
        incomeNameTF.setText("Income name");
        incomeNameTF.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (incomeNameTF.getText().equals("Income name")) {
                    incomeNameTF.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (incomeNameTF.getText().equals("")) {
                    incomeNameTF.setText("Income name");
                }
            }
        });


        incomeValueTF = new JTextField();
        incomeValueTF.setFont(new Font(null, Font.PLAIN, fontsize));
        incomeValueTF.setText("Income value");
        incomeValueTF.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (incomeValueTF.getText().equals("Income value")) {
                    incomeValueTF.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (incomeValueTF.getText().equals("")) {
                    incomeValueTF.setText("Income value");
                }
            }
        });

        expenseNameTF = new JTextField();
        expenseNameTF.setFont(new Font(null, Font.PLAIN, fontsize));
        expenseNameTF.setText("Expense name");
        expenseNameTF.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (expenseNameTF.getText().equals("Expense name")) {
                    expenseNameTF.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (expenseNameTF.getText().equals("")) {
                    expenseNameTF.setText("Expense name");
                }
            }
        });

        expenseValueTF = new JTextField();
        expenseValueTF.setFont(new Font(null, Font.PLAIN, fontsize));
        expenseValueTF.setText("Expense value");
        expenseValueTF.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (expenseValueTF.getText().equals("Expense value")) {
                    expenseValueTF.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (expenseValueTF.getText().equals("")) {
                    expenseValueTF.setText("Expense value");
                }
            }
        });


        addIncomeB = new JButton("Add income");
        addIncomeB.setFont(new Font(null, Font.PLAIN, fontsize));
        addIncomeB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = incomeNameTF.getText();
                String valueText = incomeValueTF.getText();
                try {
                    double value = Double.parseDouble(valueText);
                    t.addIncome(name, value);

                    balanceLB.setText("Balance: " + t.getBalance());
                    totIncomeLB.setText("Total Income: " + t.getTotalTransaction(t.incomes));

                    JOptionPane.showMessageDialog(frame, "Successfully added your income. New Balance: " + t.getBalance());

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter a valid number for the value.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        addExpenseB = new JButton("Add expense");
        addExpenseB.setFont(new Font(null, Font.PLAIN, fontsize));
        addExpenseB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = expenseNameTF.getText();
                String valueText = expenseValueTF.getText();
                try {
                    double value = Double.parseDouble(valueText);
                    t.addExpense(name, value);

                    balanceLB.setText("Balance: " + t.getBalance());
                    totExpenseLB.setText("Total Expense: " + t.getTotalTransaction(t.expenses));


                    JOptionPane.showMessageDialog(frame, "Successfully added your expense. New Balance: " + t.getBalance());

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter a valid number for the value.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        detailsB = new JButton("Details");
        detailsB.setFont(new Font(null, Font.PLAIN, fontsize));
        detailsB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == detailsB) {
                    new DetailedGUI(t);
                }
            }
        });


        frame.add(totIncomeLB);
        frame.add(totExpenseLB);
        frame.add(balanceLB);
        frame.add(addIncomeB);
        frame.add(incomeNameTF);
        frame.add(incomeValueTF);
        frame.add(addExpenseB);
        frame.add(expenseNameTF);
        frame.add(expenseValueTF);
        frame.add(placeholder1);
        frame.add(detailsB);
        frame.add(placeholder2);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(850, 800);
        frame.setLayout(new GridLayout(0, 3));
        frame.setVisible(true);

    }
}