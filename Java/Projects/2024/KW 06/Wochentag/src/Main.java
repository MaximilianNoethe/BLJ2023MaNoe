import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Month> months = new ArrayList<Month>();
        months.add(new Month("January", 1, 1));
        months.add(new Month("February", 4, 2));
        months.add(new Month("March", 4, 3));
        months.add(new Month("April", 0, 4));
        months.add(new Month("May", 2, 5));
        months.add(new Month("June", 5, 6));
        months.add(new Month("July", 0, 7));
        months.add(new Month("August", 3, 8));
        months.add(new Month("September", 6, 9));
        months.add(new Month("October", 1, 10));
        months.add(new Month("November", 4, 11));
        months.add(new Month("December", 6, 12));


        ArrayList<Century> centuries = new ArrayList<Century>();
        centuries.add(new Century(18, 2, 1));
        centuries.add(new Century(19, 0, 2));
        centuries.add(new Century(20, 6, 3));
        centuries.add(new Century(21, 4, 4));


        System.out.println("Enter your day: ");
        int day = input.nextInt();


        System.out.println("Enter your month WARNING 01 -> FALSE, 1 -> CORRECT: ");
        int month = input.nextInt();


        System.out.println("Enter your year: ");
        int year = input.nextInt();

        int century = year / 100;

        // Step 1.
        int yearDigit = year % 100; // Saves the last two digits of the number into the variable

        int val1 = yearDigit + (yearDigit / 4);

        // Step 2.
        int monthValue = 0;
        for (int i = 0; i < months.size(); i++) {
            if (months.get(i).getMonthNumber() == month) {
                monthValue = months.get(i).getValue();
                break;
            }
        }

        int val2 = val1 + monthValue;

        // Step 3.
        int val3 = val2 + day;

        // Step 4.
        int centuryhValue = 0;
        for (int i = 0; i < centuries.size(); i++) {
            if (centuries.get(i).getCentury() == century) {
                centuryhValue = centuries.get(i).getValue();
                break;
            }
        }
        int val4 = val3 + centuryhValue;

        // Step 5.


    }
}