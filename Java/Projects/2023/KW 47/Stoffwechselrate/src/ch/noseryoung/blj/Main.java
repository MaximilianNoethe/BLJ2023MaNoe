package ch.noseryoung.blj;

import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        addValues();
    }
    public static void addValues() {
        System.out.println("Enter your gender (m/f): ");
        String gender = input.next();

        System.out.println("Enter your age in years: ");
        int age = input.nextInt();

        System.out.println("Enter your weight in kilograms: ");
        double weight = input.nextDouble();

        System.out.println("Enter your height in centimeters: ");
        double height = input.nextDouble();

        System.out.println();

        if (gender.equals("m")) {
            double basalMetabolism = 0;

            basalMetabolism = 66.47 + (13.7 * weight) + (5 * height) - (6.8 * age);

            System.out.println("Your basal metabolism amounts to: " + basalMetabolism + "kcal per day.");
        } else {
            double basalMetabolism = 0;

            basalMetabolism = 655.1 + (9.6 * weight) + (1.8 * height) - (4.7 * age);

            System.out.println("Your basal metabolism amounts to: " + basalMetabolism + "kcal per day.");
        }
    }
}
