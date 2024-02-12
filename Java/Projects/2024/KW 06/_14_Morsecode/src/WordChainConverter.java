import java.util.*;

public class WordChainConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine().replaceAll("\\s", ""); // Remove spaces

        String[] wordChain = convertToWordChain(sentence);
        String[] morseCodeChain = convertToMorseCode(wordChain);

        System.out.println("Word Chain: " + String.join(" -> ", wordChain));
        System.out.println("Morse Code Chain: " + String.join(" ", morseCodeChain));

        scanner.close();
    }

    public static String[] convertToWordChain(String sentence) {
        String[] wordChain = new String[sentence.length()];
        wordChain[0] = String.valueOf(sentence.charAt(0)); // Add the first letter

        for (int i = 1; i < sentence.length(); i++) {
            String prevLetter = wordChain[i - 1];
            String currentLetter = String.valueOf(sentence.charAt(i));
            wordChain[i] = currentLetter;
        }

        return wordChain;
    }

    public static String[] convertToMorseCode(String[] wordChain) {
        String[] morseCodeChain = new String[wordChain.length];

        for (int i = 0; i < wordChain.length; i++) {
            StringBuilder morseCodeLetter = new StringBuilder();
            for (char c : wordChain[i].toLowerCase().toCharArray()) {
                morseCodeLetter.append(getMorseCode(c)).append(" ");
            }
            morseCodeChain[i] = morseCodeLetter.toString().trim();
        }

        return morseCodeChain;
    }

    public static String getMorseCode(char c) {
        switch (c) {
            case 'a': return ".-";
            case 'b': return "-...";
            case 'c': return "-.-.";
            case 'd': return "-..";
            case 'e': return ".";
            case 'f': return "..-.";
            case 'g': return "--.";
            case 'h': return "....";
            case 'i': return "..";
            case 'j': return ".---";
            case 'k': return "-.-";
            case 'l': return ".-..";
            case 'm': return "--";
            case 'n': return "-.";
            case 'o': return "---";
            case 'p': return ".--.";
            case 'q': return "--.-";
            case 'r': return ".-.";
            case 's': return "...";
            case 't': return "-";
            case 'u': return "..-";
            case 'v': return "...-";
            case 'w': return ".--";
            case 'x': return "-..-";
            case 'y': return "-.--";
            case 'z': return "--..";
            default: return ""; // For unsupported characters, return empty string
        }
    }
}

