import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your hour: ");
        int hour = input.nextInt();

        System.out.println("Enter your minute: ");
        int minute = input.nextInt();


        int hourHand = (int) (0.5 * (60 * hour + minute));

        int minuteHand = 6 * minute;

        System.out.println(hour + ":" + minute + " Uhr");

        System.out.println("Hour hand at: " + hourHand + "°");

        System.out.println("Minute hand at: " + minuteHand + "°");
    }
}