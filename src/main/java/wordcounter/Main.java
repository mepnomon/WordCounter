package wordcounter;

import java.util.Map;

/**
 * Main method.
 * Prints word and count
 * @author D. Dressler
 */
public class Main {

    public static void main(String[] args){

        FileTextExtractor fileTextExtractor = new FileTextExtractor();
        WordCounter wordCounter = new WordCounter();
        String text = fileTextExtractor.extractTextFromFile();
        Map<String, Integer> wordCount = wordCounter.countWords(text);
        System.out.println(wordCount);
    }
}
