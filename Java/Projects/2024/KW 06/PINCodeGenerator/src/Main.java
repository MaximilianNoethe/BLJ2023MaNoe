public class Main {
    public static void main(String[] args) {
        
        for (int pin = 0; pin <= 9999; pin++)

            if (pin < 10) {
                System.out.println("000" + pin);
            } else if (pin < 100) {
                System.out.println("00" + pin);
            } else if (pin < 1000) {
                System.out.println("0" + pin);
            } else if (pin < 10000) {
                System.out.println(pin);
            }

    }
}