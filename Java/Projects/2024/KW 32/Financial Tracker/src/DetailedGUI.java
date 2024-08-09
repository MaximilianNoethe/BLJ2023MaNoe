import javax.swing.*;
import java.awt.*;

public class DetailedGUI {
    private JFrame frame = new JFrame("Finance Tracker");

    DetailedGUI(Tracker t) {
        DefaultListModel<String> incomeListModel = new DefaultListModel<>();
        for (Transaction transaction : t.getDetailedIncomes()) {
            incomeListModel.addElement(transaction.toString());
        }
        JList<String> incomeList = new JList<>(incomeListModel);
        incomeList.setBorder(BorderFactory.createTitledBorder("INCOMES"));


        DefaultListModel<String> expenseListModel = new DefaultListModel<>();
        for (Transaction transaction : t.getDetailedExpenses()) {
            expenseListModel.addElement(transaction.toString());
        }
        JList<String> expenseList = new JList<>(expenseListModel);
        expenseList.setBorder(BorderFactory.createTitledBorder("EXPENSES"));

        frame.add(new JScrollPane(incomeList));
        frame.add(new JScrollPane(expenseList));

        frame.setLayout(new GridLayout(2, 1));
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setSize(850, 800);
        frame.setVisible(true);
    }
}
