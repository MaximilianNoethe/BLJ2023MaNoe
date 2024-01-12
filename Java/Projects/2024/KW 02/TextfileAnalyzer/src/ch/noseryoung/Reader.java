package ch.noseryoung;


import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Reader {


    public static void readScript() throws IOException {
        String path = "C:\\Projects\\Tescht\\BLJ2023MaNoe\\Java\\Projects\\2024\\KW 02\\TextfileAnalyzer\\src\\ch\\noseryoung\\script.txt";

        List<String> lines = Files.readAllLines(Paths.get(path));

        Map<String, Integer> wordCount = new HashMap<>();

        for (String line : lines) {
            String[] words = line.split(" ");

            for (String word : words) {

                word = word.replaceAll("[^a-zA-Z]", "");

                word = word.toLowerCase();

                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);


            }
        }

       // Horizontal -> System.out.println(wordCount);


        int totalWordCount = 0;
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {


            // Einzelne Anzahl jedes Wortes
            String word = entry.getKey();
            int count = entry.getValue();
            System.out.println(word + ": " + count);

            // Totale Anzahl an Wörtern
            totalWordCount += entry.getValue();
        }
        System.out.println("Total Word Count: " + totalWordCount);

/*
        if (myScript.exists()) {

            System.out.println("The file: " + myScript.getName() + " exists!");
            System.out.println("Readable: " + myScript.canRead());


        } else {
            System.out.println("The file: " + myScript.getName() + " does not exist!");
        }
        */
    }


}



