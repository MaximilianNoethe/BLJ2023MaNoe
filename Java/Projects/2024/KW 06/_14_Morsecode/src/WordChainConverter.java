import java.util.*;

public class WordChainConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        String wordChain = convertToWordChain(input);

        System.out.println("Word Chain:");
        System.out.println(wordChain);

        scanner.close();
    }

    public static String convertToWordChain(String input) {
        StringBuilder wordChain = new StringBuilder();
        String[] words = input.split("\\s+");

        for (int i = 0; i < words.length - 1; i++) {
            String word1 = words[i];
            String word2 = words[i + 1];
            if (word1.charAt(word1.length() - 1) != word2.charAt(0)) {
                // If the last character of word1 is different from the first character of word2
                // append word2 to the word chain
                wordChain.append(word1);
            }
        }

        // Add the last word of the input string to the word chain
        wordChain.append(words[words.length - 1]);

        return wordChain.toString();
    }
}
