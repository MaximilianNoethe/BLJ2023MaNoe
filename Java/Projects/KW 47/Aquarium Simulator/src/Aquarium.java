import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Aquarium {

    Scanner in = new Scanner(System.in);

    private boolean isSaltwater;
    private int[][] aquarium;
    private String name;

    ArrayList<Fish> fishes = new ArrayList<Fish>();


    public Aquarium(int width, int length, boolean isSaltwater, String name) {
        this.aquarium = new int[width][length];
        this.isSaltwater = isSaltwater;
        this.name = name;
    }

    public void addFish(Fish fish) {
        this.fishes.add(fish);
        aquarium[fish.getyPos()][fish.getxPos()] = 1;
        System.out.println("Fish " + fish.getName() + "has been added..\n");
    }

    public void removeFish(int index) {
        Fish fish  = this.fishes.get(index);
        aquarium[fish.getyPos()][fish.getxPos()] = 0;

        this.fishes.remove(index);
        System.out.println("Fish " + fish.getName() + " has been removed..\n");

    }

    public String getName() {
        return name;
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

    public boolean isSaltwater() {
        return isSaltwater;
    }
}