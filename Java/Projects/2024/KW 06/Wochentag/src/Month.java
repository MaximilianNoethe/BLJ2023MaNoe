public class Month {
    private String name;

    private int value;

    private int monthNumber;


    public Month(String name, int value, int monthNumber) {
        this.name = name;
        this.value = value;
        this.monthNumber = monthNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getMonthNumber() {
        return monthNumber;
    }

    public void setMonthNumber(int monthNumber) {
        this.monthNumber = monthNumber;
    }
}
