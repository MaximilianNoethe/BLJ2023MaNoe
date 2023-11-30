package ch.noseryoung.blj;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static void printMainMenu() {
        System.out.println("Would you like to add a new aquarium, edit fish or view all aquariums?" +
                "\n1 = Add or remove Aquariums\n2 = Edit Fishes\n3 = View aquariums\n4 = Exit program");


    }

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        ArrayList<Fish> fish = new ArrayList<Fish>();
        ArrayList<Aquarium> aquariums = new ArrayList<>();
        int menuChoice;


        do {

            printMainMenu();
            menuChoice = in.nextInt();
            in.nextLine();

            switch (menuChoice) {
                case 1:
                    System.out.println("Enter 1 to add an aquarium\nEnter 2 remove an aquarium");
                    int editChoice = in.nextInt();


                    if (editChoice == 1) {
                        System.out.println("With what kind off water should the aquarium be filled with?");
                        System.out.println("Enter 1 for saltwater\nEnter 2 for freshwater");
                        int waterChoice = in.nextInt();


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

                        } else if (waterChoice == 2) {


                            System.out.println("Enter width of aquarium: ");
                            int width = in.nextInt();
                            in.nextLine();

                            System.out.println("Enter length of aquarium");
                            int length = in.nextInt();
                            in.nextLine();

                            System.out.println("Enter name of aquarium");
                            Scanner Str = new Scanner(System.in);
                            String nameA = Str.nextLine();
                            aquariums.add(new Aquarium(width, length, false, nameA));

                        } else {
                            System.err.println("ERROR enter a valid number");
                        }
                    } else if (editChoice == 2) {

                        System.out.println("Enter an Index to remove an aquarium:\n");
                        int removeAqua = in.nextInt();
                        in.nextLine();
                        if (removeAqua >= 0 && removeAqua < aquariums.size()) {
                            System.out.println("The aquarium has been succesfully removed\n");
                            aquariums.remove(removeAqua);
                        } else {
                            System.err.println("ERROR Enter a valid Index");
                        }


                    } else {
                        System.err.println("ERROR enter a valid number");
                    }

                    break;

                case 2:
                    printAllAquarium(aquariums);
                    System.out.println("In which aquarium should the fish be added to?");
                    System.out.println("Enter an Index: ");
                    int aquaIndex = in.nextInt();

                    System.out.println("Enter 1 to add a fish\nEnter 2 to remove a fish");
                    int editFishChoice = in.nextInt();
                    if (editFishChoice == 1) {
                        System.out.println("Do you want to add a saltwater fish or a freshwater fish?");
                        System.out.println("Enter 1 for a saltwater fish\nEnter 2 for a freshwater fish");
                        int waterFishChoice = in.nextInt();

                        while (a)



                        System.out.println("Enter a name for the fish: ");
                        String name = in.nextLine();

                        System.out.println("Enter the fish type: ");
                        String type = in.nextLine();

                        System.out.println("Enter the x positioning: ");
                        int xPos = in.nextInt();

                        System.out.println("Enter the y positioning: ");
                        int yPos = in.nextInt();
                    }


                    break;

                case 3:
                    printAllAquarium(aquariums);
                    break;
                case 4:
                    System.out.println("Goodbye!");
            }
        } while (menuChoice != 0);

    }

    public static void printAllAquarium(ArrayList<Aquarium> aquariums){
        if (!aquariums.isEmpty()) {
            int count = 0;
            for (Aquarium aquarium : aquariums) {
                System.out.println("This aquarium is: " + aquarium.getName());
                System.out.println("This aquarium's index is: " + count);
                aquarium.printAquarium();
                System.out.println();
                count++;
            }
        } else {
            System.out.println("No Aquarium Exists");
            System.out.println("Please create an aquarium first.");
            printMainMenu();
        }
    }
}