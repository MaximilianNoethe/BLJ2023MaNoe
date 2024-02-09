import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a year: ");
        int year = input.nextInt();

        int leapYear;

        if (year % 4 == 0 && year % 100 != 0) {
            leapYear = 1;
            System.out.println("True, it's a leapYear");
        } else if (year % 4 == 1) {
            leapYear = 0;
            System.out.println("False, it's not a leapYear");
        }


    }
}
