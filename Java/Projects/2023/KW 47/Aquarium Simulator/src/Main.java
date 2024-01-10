import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static final Scanner in = new Scanner(System.in);

    static void printMainMenu() {
        System.out.println("Would you like to add a new aquarium, edit fish or view all aquariums?" + "\n1 = Add or remove Aquariums\n2 = Edit Fishes\n3 = View aquariums\n0 = Exit program");


    }

    public static void main(String[] args) {


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


                        if (waterChoice != 1 && waterChoice != 2) {
                            System.err.println("ERROR enter a valid number");
                        } else {


                            System.out.println("Enter width of aquarium: ");
                            int width = in.nextInt();
                            in.nextLine();


                            System.out.println("Enter length of aquarium");
                            int length = in.nextInt();
                            in.nextLine();


                            System.out.println("Enter name of aquarium");
                            String nameA = in.nextLine();


                            aquariums.add(new Aquarium(width, length, (waterChoice == 1), nameA));
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

                    if (aquariums.isEmpty()) {
                        break;
                    }

                    System.out.println();

                    System.out.println("In which aquarium should the fish be added?");
                    System.out.println("Enter an index:");
                    int aquaIndex = in.nextInt();

                    System.out.println("Enter 1 to add an fish\nEnter 2 remove an fish");
                    int editFishChoice = in.nextInt();
                    if (editFishChoice == 1) {
                        System.out.println("Do you want to add a saltwater fish or a freshwater fish?");
                        int waterFishChoice = 3;
                        do {
                            System.out.println("Enter 1 for saltwater fish\nEnter 2 for freshwater fish");
                            waterFishChoice = in.nextInt();
                        } while (aquariums.get(aquaIndex).isSaltwater() != (waterFishChoice == 1));
                        in.nextLine();
                        System.out.println("Enter a name for your fish:");
                        String fishName = in.nextLine();


                        System.out.println("Enter an x Position for the fish:");
                        int xPos = in.nextInt();
                        System.out.println("Enter an y Position for the fish:");
                        int yPos = in.nextInt();
                        if (waterFishChoice == 1) {
                            aquariums.get(aquaIndex).addFish(new Fish(fishName, "", xPos, yPos, true));
                        } else {
                            aquariums.get(aquaIndex).addFish(new Fish(fishName, "", xPos, yPos, false));
                        }
                    } else if (editFishChoice == 2) {

                        aquariums.get(aquaIndex).removeFish(askForInt("What Fish do you want to remove? (index)"));

                    }
                    break;

                case 3:
                    printAllAquarium(aquariums);

                    break;
                case 0:
                    System.out.println("Goodbye!");
                    break;
            }
        } while (menuChoice != 0);

    }


    public static void printAllAquarium(ArrayList<Aquarium> aquariums) {
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

        }
    }


    static int askForInt(String askingFor) {
        System.out.println(askingFor);
        int temp;
        while (true) {
            try {
                temp = in.nextInt();
                in.nextLine();
                return temp;
            } catch (Exception e) {
                System.out.println("Enter A nuMBer YOu MORN");
            }
        }
    }

}
