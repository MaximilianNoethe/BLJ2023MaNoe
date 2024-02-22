import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.ArrayList;
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.Random;

public class Word {

    ArrayList<String> wordlist = new ArrayList<>();
    Random random = new Random();

    public void readFile(String fileName) {

        try {
            File myFile = new File(fileName);
            Scanner s = new Scanner(myFile);


            while (s.hasNextLine()) {
                wordlist.add(s.nextLine());
            }


        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
        }
    }


    public String getRandomWord() {

        if (wordlist.isEmpty()) {
            System.out.println("No words are available.");
            return "";
        } else {
            String randomWord = wordlist.get(random.nextInt(wordlist.size())).toLowerCase();
            // randomWord gets a value from the arraylist (wordList) -> gets the next index (random) -> with a range (size of the array list (wordList))
            // Every word will turn into lower case


            return randomWord;
        }

    }


}