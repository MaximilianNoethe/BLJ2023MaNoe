public class Century {
    private int century;

    private int value;

    private int centuryNumber;

    public Century(int century, int value, int centuryNumber) {
        this.century = century;
        this.value = value;
        this.centuryNumber = centuryNumber;
    }

    public int getCentury() {
        return century;
    }

    public void setCentury(int century) {
        this.century = century;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getCenturyNumber() {
        return centuryNumber;
    }

    public void setCenturyNumber(int centuryNumber) {
        this.centuryNumber = centuryNumber;
    }
}
