package ch.noseryoung.blj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Aquarium {


    private boolean isSaltwater;
    private int[][] aquarium;
    ArrayList<Fish> fish = new ArrayList<Fish>();

    public Aquarium() {
    }

    public Aquarium(int width, int length, boolean isSaltwater) {
        this.aquarium = new int[width][length];
        this.isSaltwater = isSaltwater;
    }


    public void printAquarium() {
        for (int i = 0; i < aquarium.length; i++) {
            System.out.print("▓▓");
        }
        System.out.println("▓");
        String aquariumAsString = Arrays.deepToString(aquarium);
        aquariumAsString = aquariumAsString.replace("[[", "▓").replace("], [", "▓\n▓").replace(", ", " ").replace("]]", "▓").replace("0", "~").replace("1", "☺");
        System.out.println(aquariumAsString);

        for (int i = 0; i < aquarium.length; i++) {
            System.out.print("▓▓");
        }
        System.out.println("▓");
    }


    void editAqua() {
        Scanner in = new Scanner(System.in);
        int waterChoice = in.nextInt();
        System.out.println("With what kind off water should the aquarium be filled with?");
        System.out.println("Enter 1 for saltwater\nEnter 2 for freshwater");

        if (waterChoice == 1) {
            System.out.println("Saltwater aquarium");
        } else if (waterChoice == 2) {
            System.out.println("Freshwater aquarium");
        } else {
            System.err.println("ERROR enter a valid number");
        }

    }


}
