import java.util.Scanner;
import java.util.Random;

public class Main {

    public static char[][] createArena(int rows) {
        char[][] arena = new char[rows][rows];
        Random random = new Random();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                if (random.nextDouble() < 0.5) {
                    arena[i][j] = '-';
                } else {
                    arena[i][j] = '#';
                }
            }
        }
        return arena;
    }

    public static void printArena(char[][] arena) {
        for (int i = 0; i < arena.length; i++) {
            for (int j = 0; j < arena[i].length; j++) {
                System.out.print(arena[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie die Anzahl der Reihen ein: ");
        int rows = scanner.nextInt();

        char[][] arena = createArena(rows);
        printArena(arena);

        scanner.close();
    }
}
