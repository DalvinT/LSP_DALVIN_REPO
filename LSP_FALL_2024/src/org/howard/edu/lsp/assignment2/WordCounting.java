package org.howard.edu.lsp.assignment2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordCounting {

    public static void main(String[] args) {
        // Make sure the file path is correctly set according to your file location
        String filename = "src/org/howard/edu/lsp/assignment2/WordCounting.java"; // Update the file path as necessary
        countWords(filename);
    }

    public static void countWords(String filename) {
        // Map to store the word counts
        Map<String, Integer> wordCount = new HashMap<>();
        
        // Pattern to find words consisting only of alphabetic characters
        Pattern pattern = Pattern.compile("\\b[a-zA-Z]+\\b");

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Convert each line to lowercase to ensure case insensitivity
                line = line.toLowerCase();
                
                // Find all words in the line
                Matcher matcher = pattern.matcher(line);
                while (matcher.find()) {
                    String word = matcher.group();
                    // Only consider words longer than 3 characters
                    if (word.length() > 3) {
                        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            // Print an error message if the file reading fails
            System.err.println("Error reading the file: " + e.getMessage());
        }

        // Use TreeMap to sort the words alphabetically
        TreeMap<String, Integer> sortedWordCount = new TreeMap<>(wordCount);

        // Print the sorted words and their counts
        sortedWordCount.forEach((word, count) -> System.out.println(word + "\t" + count));
    }
}
