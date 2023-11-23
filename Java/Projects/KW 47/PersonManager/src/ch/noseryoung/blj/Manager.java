package ch.noseryoung.blj;

import java.util.ArrayList;
import java.util.Scanner;

public class Manager {
    Scanner in = new Scanner(System.in);

    ArrayList<Person> peoples = new ArrayList<Person>();

    void addPerson() {
        System.out.println("--CHARACTER CREATION--");
        System.out.println();
            System.out.print("Please enter a name: ");
            String name = in.nextLine();
            System.out.print("Please enter a age: ");
            int age = in.nextInt();
            in.nextLine();
            System.out.print("Please enter a height: ");
            int height = in.nextInt();
            in.nextLine();
            System.out.print("Please enter a weight: ");
            int weight = in.nextInt();
            in.nextLine();
            System.out.print("Please enter a ethnicity: ");
            String ethnicity = in.nextLine();


        peoples.add(new Person(name, age, height, weight, ethnicity));

        System.out.println();

    }

    void printList(){
        for (int i = 0; i < peoples.size(); i++){
            System.out.println("Name: "+ peoples.get(i).getName());
            System.out.println("Age in years: "+ peoples.get(i).getAge());
            System.out.println("Height in cm: "+ peoples.get(i).getHeight());
            System.out.println("Weight in kg: "+ peoples.get(i).getWeight());
            System.out.println("Your ethnicity: "+ peoples.get(i).getEthnicity());
        }

        // System.out.println("v2: \n"+peoples.toString());
    }
}
