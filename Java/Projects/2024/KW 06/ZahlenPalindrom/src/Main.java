import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter your number: ");
        int zahl = scanner.nextInt();


        if (istPalindrom(zahl)) {
            System.out.println(zahl + " is a palindrom.");
        } else {
            System.out.println(zahl + " is not a palindrom.");
        }


    }


    // Method to check for a palindrom
    private static boolean istPalindrom(int zahl) {
        int originalZahl = zahl;
        int umgekehrteZahl = 0;

        while (zahl > 0) {
            int letzteZiffer = zahl % 10;
            umgekehrteZahl = umgekehrteZahl * 10 + letzteZiffer;
            zahl /= 10;
        }

        return originalZahl == umgekehrteZahl;
    }
}
