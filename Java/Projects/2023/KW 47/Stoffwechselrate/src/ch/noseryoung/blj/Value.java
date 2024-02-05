package ch.noseryoung.blj;

import java.util.Scanner;

public class Value {
    Scanner scanner = new Scanner(System.in);

    Person person = new Person();

    void addValues(){
        System.out.println("Enter your age in years: ");
        int age = scanner.nextInt();

        System.out.println("Enter your weight in kilograms: ");
        double weight = scanner.nextDouble();

        System.out.println("Enter your height in centimeters: ");
        double height = scanner.nextDouble();

        System.out.println();
    }

    void printValuesM(){
        double basalMetabolism = 0;

        basalMetabolism = 66.47 + (13.7 * person.getWeight()) + (5 + person.getHeight()) - (6.8 + person.getAge());

        System.out.println("Your basal metabolism amounts to: " + basalMetabolism + "kcal per day.");

    }

    void printValuesF(){
        double basalMetabolism = 0;

        basalMetabolism = 655.1 + (9.6 * person.getWeight()) + (1.8 + person.getHeight()) - (4.7 + person.getAge());

        System.out.println("Your basal metabolism amounts to: " + basalMetabolism + "kcal per day.");
    }



}
