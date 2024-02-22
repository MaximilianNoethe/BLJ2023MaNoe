import java.util.Scanner;

public class Game {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";


    Scanner input = new Scanner(System.in);
    private Word word = new Word();
    String wordToGuess;
    String[] resultParts;
    int tries = 6;

    String startOrHelp;

    public void introductionGame() {
        System.out.println(ANSI_PURPLE + "-------------------------WORDLE-------------------------" + ANSI_RESET);
        System.out.println("Welcome to my WORDLE, if you need any help type in \\help.");
        System.out.println();
        System.out.println("To start the game please type in \\start");
        String startOrHelp = input.next();

        if (startOrHelp.equals("\\start")) {
            gameStart();
        } else if (startOrHelp.equals("\\help")) {
            gameHelp();
        } else {
            System.err.println("Enter a valid command!");
        }
        System.out.println();

    }

    public void gameStart() {

        word.readFile("src\\wordlist.txt");
        wordToGuess = word.getRandomWord();
        resultParts = wordToGuess.split("");
        userWord();
    }

    public void gameHelp() {
        System.out.println("----------------------------------------");
        System.out.println("|                                      |");
        System.out.println("|   " + ANSI_CYAN + "***WELCOME TO THE HELPCENTER***" + ANSI_RESET + "    |");

        System.out.println("|   " + ANSI_GREEN + "Green" + ANSI_RESET + " -> Your letter is the word   |");
        System.out.println("|       and in the correct spot.       |");
        System.out.println("|   " + ANSI_YELLOW + "Yellow" + ANSI_RESET + " -> Your letter is in the    |");
        System.out.println("|     word but in the wrong spot.      |");
        System.out.println("|   " + ANSI_RED + "Red" + ANSI_RESET + " -> Your letter is not in the   |");
        System.out.println("|          word in any spot.           |");
        System.out.println("|                                      |");
        System.out.println("----------------------------------------");

        System.out.println();
        System.out.println();
        System.out.println();

        introductionGame();
    }


    public void userWord() {

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
                compareLetter(guess, resultParts);
            }
        }

    }


    private void compareLetter(String[] guess, String[] resultParts) {
        for (int i = 0; i < guess.length; i++) {
            if (guess[i].equals(resultParts[i])) {
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
