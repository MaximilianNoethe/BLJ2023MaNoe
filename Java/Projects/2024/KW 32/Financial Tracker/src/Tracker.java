import java.util.ArrayList;

public class Tracker {
    private ArrayList<Double> expenses;
    private ArrayList<Double> incomes;
    private double balance;

    public Tracker(ArrayList<Double> expenses, ArrayList<Double> incomes, double balance) {
        this.expenses = expenses;
        this.incomes = incomes;
        this.balance = 0;
    }

    private void addExpense(double expense) {
        expenses.add(expense);
        balance -= expense;
    }

    private void addIncome(double income) {
        incomes.add(income);
        balance += income;
    }

    public double getBalance() {
        return balance;
    }

    private void printExpenses() {
        System.out.println("Expenses: ");
        for (double expense : expenses) {
            System.out.println(expense);
        }
    }

    private void printIncomes() {
        System.out.println("Incomes: ");
        for (double income : incomes) {
            System.out.println(income);
        }
    }
}
