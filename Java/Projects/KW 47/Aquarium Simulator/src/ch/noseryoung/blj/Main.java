package ch.noseryoung.blj;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Aquarium aquarium = new Aquarium();
        

        System.out.println("Enter 1 to edit the aquariums");
        System.out.println("Enter 2 to edit the fishes");
        System.out.println("Enter 3 to view all aquariums");
        int menuChoice = in.nextInt();


        switch (menuChoice) {
            case 1:
                aquarium.editAqua();
                break;

            case 2:
                break;

            case 3:
                break;

        }


        Aquarium aquarium2 = new Aquarium(10, 10, true);
        aquarium.printAquarium();


    }
}