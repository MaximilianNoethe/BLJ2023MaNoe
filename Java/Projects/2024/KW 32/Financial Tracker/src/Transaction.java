public class Transaction {
    private String name;
    private double value;

    public Transaction(String name, double value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return name + ": " + value + "CHF.";
    }
}
