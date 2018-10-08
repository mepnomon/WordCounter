import java.util.HashMap;
import java.util.Map;

public class WordCounter implements WordCountService {

    @Override
    public Map<String, Integer> countWords(final String text){
        return countOccurrence(extractWords(text.toLowerCase()));
    }

    private String[] extractWords(String text){
        String[] splitString = text.split("([\\W\\ ^0-9]+)");
        return splitString;
    }

    private Map<String, Integer> countOccurrence(String[] words){
        Map<String, Integer> countedWords = new HashMap<>();

        for(String word : words){
            if(!countedWords.containsKey(word)){
                countedWords.put(word,1);
            } else {
                Integer count = countedWords.get(word);
                countedWords.put(word,count+1);
            }
        }
        return countedWords;
    }
}
