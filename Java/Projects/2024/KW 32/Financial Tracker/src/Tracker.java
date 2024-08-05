import java.util.ArrayList;

public class Tracker {
    public ArrayList<Double> expenses;
    public ArrayList<Double> incomes;
    public double balance;

    public Tracker(ArrayList<Double> expenses, ArrayList<Double> incomes, double balance) {
        this.expenses = expenses;
        this.incomes = incomes;
        this.balance = 0;
    }

    public void addExpense(double expense) {
        expenses.add(expense);
        balance -= expense;
    }

    public void addIncome(double income) {
        incomes.add(income);
        balance += income;
    }

    public double getBalance() {
        return balance;
    }

    public ArrayList<Double> getExpenses(){
        return expenses;
    }
    public ArrayList<Double> getIncomes(){
        return incomes;
    }
}
