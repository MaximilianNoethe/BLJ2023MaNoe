import java.util.ArrayList;

public class Tracker {
    public ArrayList<Transaction> expenses = new ArrayList<Transaction>();
    public ArrayList<Transaction> incomes = new ArrayList<Transaction>();
    public double balance = 500;

    public Tracker() {

    }

    public void addExpense(String name, double expense) {
        Transaction transaction = new Transaction(name, expense);
        expenses.add(transaction);
        balance -= expense;
    }

    public void addIncome(String name, double income) {
        Transaction transaction = new Transaction(name, income);
        incomes.add(transaction);
        balance += income;
    }

    public double getBalance() {
        return balance;
    }

    public ArrayList<Transaction> getDetailedExpenses() {
        return expenses;
    }

    public ArrayList<Transaction> getDetailedIncomes() {
        return incomes;
    }

    public double getTotalIncomesOrExpenses(ArrayList<Transaction> list) {
        if (list == null){
            throw new IllegalArgumentException("List cannot be null.");
        }

        double sum = 0;

        for (Transaction transaction : list) {
            sum += transaction.getValue();
        }
        return sum;
    }
}
