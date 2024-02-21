import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Game game = new Game();
        Word word = new Word();

        game.startGame();
        System.out.println("Enter your word: ");
        String wordInput = input.next();

        if (wordInput.equals(word.randomWord())){
            System.out.println("Amazing! You Win!");
        }

    }
}