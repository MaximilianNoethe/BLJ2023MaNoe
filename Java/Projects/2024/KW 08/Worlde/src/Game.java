
import java.util.Scanner;

public class Game {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";


    Scanner input = new Scanner(System.in);
    private Word word = new Word();
    String wordToGuess;
    String[] solutionParts;

    public void startGame() {
        word.readFile("src\\wordlist.txt");
        wordToGuess = word.getRandomWord();
        solutionParts = wordToGuess.split("");
    }


    public void userWord() {
        int tries = 6;

        while (true) {

            System.out.println("Enter your word: ");
            String word = input.next();
            tries--;

            String[] guess = word.split("");

            if (word.equals(wordToGuess)) {
                System.out.println(ANSI_GREEN + word + ANSI_RESET);
                System.out.println("Amazing! You Win!");
                break;
            } else if (guess.length != 5) {
                System.out.println("Your guess must be exactly 5 letters long");

            } else if (tries == 0) {
                System.out.println("You're out of tries, the today's wordle was: " + ANSI_GREEN + wordToGuess);
                break;
            } else {
                compareLetter(guess, solutionParts);
            }
        }

    }


    private void compareLetter(String[] guess, String[] solutionParts) {
        for (int i = 0; i < guess.length; i++) {
            if (guess[i].equals(solutionParts[i])) {
                System.out.print(ANSI_GREEN + guess[i] + ANSI_RESET);
            } else if (wordToGuess.contains(guess[i])) {
                System.out.print(ANSI_YELLOW + guess[i] + ANSI_RESET);

            } else {
                System.out.print(ANSI_RED + guess[i] + ANSI_RESET);
            }
        }
        System.out.println();
        System.out.println();
    }

}
