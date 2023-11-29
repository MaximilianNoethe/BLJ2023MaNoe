package ch.noseryoung.blj;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static void printMainMenu() {

        System.out.println("Enter 1 to add or remove an aquarium");
        System.out.println("Enter 2 to edit the fishes");
        System.out.println("Enter 3 to view all aquariums");
        System.out.println("Enter 4 to exit the program");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Aquarium> aquariums = new ArrayList<>();

        int menuChoice;

        do {
            printMainMenu();
            menuChoice = in.nextInt();
            in.nextLine();

            Aquarium aquarium = new Aquarium();


            switch (menuChoice) {
                case 1:

                    System.out.println("Enter 1 to add an aquarium\nEnter 2 remove an aquarium");
                    int editChoice = in.nextInt();
                    in.nextLine();


                    if (editChoice == 1) {
                        System.out.println("With what kind off water should the aquarium be filled with?");
                        System.out.println("Enter 1 for saltwater\nEnter 2 for freshwater");
                        int waterChoice = in.nextInt();
                        in.nextLine();

                        if (waterChoice == 1) {
                            System.out.println("Saltwater aquarium");

                            System.out.println("Enter width of aquarium: ");
                            int width = in.nextInt();
                            in.nextLine();

                            System.out.println("Enter length of aquarium");
                            int length = in.nextInt();
                            in.nextLine();

                            System.out.println("Enter name of aquarium");
                            String nameA = in.nextLine();

                            aquariums.add(new Aquarium(width, length, true, nameA));

                            System.out.println("You've succesfully added a saltwater aquarium\n");


                        } else if (waterChoice == 2) {

                            System.out.println("Freshwater aquarium");

                            System.out.println("Enter width of aquarium: ");
                            int width = in.nextInt();
                            in.nextLine();

                            System.out.println("Enter length of aquarium: ");
                            int length = in.nextInt();
                            in.nextLine();

                            System.out.println("Enter name of aquarium: ");
                            String nameA = in.nextLine();
                            aquariums.add(new Aquarium(width, length, false, nameA));

                            System.out.println("You've succesfully added a fresh aquarium\n");


                        } else {
                            System.err.println("ERROR enter a valid number!");
                        }

                    } else if (editChoice == 2) {
                        System.out.println("Enter an Index to remove an aquarium: ");
                        int removeAqua = in.nextInt();
                        in.nextLine();

                        if (removeAqua >= 0 && removeAqua < aquariums.size()) {
                            System.out.println("The aquarium has been succesfully removed\n");
                            aquariums.remove(removeAqua);

                        } else {
                            System.err.println("ERROR enter a valid Index!");
                        }

                    } else {
                        System.err.println("ERROR enter a valid number!");
                    }
                    break;

                case 2:
                    break;

                case 3:
                    aquarium.printAquarium();
                    break;

                case 4:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.err.println("ERROR enter a valid number!");
                    break;
            }

        } while (menuChoice != 4);


    }


}