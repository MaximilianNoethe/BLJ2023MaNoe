package ch.noseryoung.blj;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Manager manager = new Manager();

        ArrayList<Person> peoples = manager.peoples;




while (true){
    System.out.println("***Welcome to the character creation***");
    System.out.println("Enter 1 to create a character");
    System.out.println("Enter 2 to see all characters");
    System.out.println("Enter 3 to exit the program");
    int input = in.nextInt();
    in.nextLine();

    switch (input){
        case 1:
            manager.addPerson();
            System.out.println("Do you want to add one more? (yes/no)");
            String response = in.nextLine().toLowerCase();
            if (!response.equals("yes")) {

                continue;
            }
            break;

        case 2:
            if (peoples.isEmpty()){
                System.out.println("The list is empty.");
                System.out.println();
            } else {
                manager.printList();
                System.out.println();
            }
            break;

        case 3:
            System.out.println("Good bye!");
            System.exit(0);
        default:
            System.err.println("ERROR please enter a valid number");

    }
}
    }
}
