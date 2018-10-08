import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

class WordCounterTest {

    WordCounter wordCounter;
    Map<String, Integer> words;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        wordCounter = new WordCounter();
        words = new HashMap<>();
        words.put("this", 1);
        words.put("is", 1);
        words.put("a", 1);
        words.put("test", 1);
    }

    @Test
    public void test_simple_sentence_with_uppercase(){
        String text = "This is a test";
        Assertions.assertEquals(words,wordCounter.countWords(text));
    }

    @Test
    public void test_string_with_period(){
        String text = "This is a test.";
        Assertions.assertEquals(words,wordCounter.countWords(text));
    }

    @Test
    public void test_string_with_period_and_comma(){
        String text = "This, is a test.";
        Assertions.assertEquals(words,wordCounter.countWords(text));
    }

    @Test
    public void test_string_with_exclamation_semicolon(){
        String text = "This; is a test!";
        Assertions.assertEquals(words,wordCounter.countWords(text));
    }

    @Test
    public void test_string_with_apostrophe(){
        String text = "This' is a test";
        Assertions.assertEquals(words,wordCounter.countWords(text));
    }

    @Test
    public void test_with_number_at_end_of_sentence(){
        String text = "This is a test 3";
        Assertions.assertEquals(words,wordCounter.countWords(text));
    }

    @Test
    public void test_with_number_inside_sentence(){
        String text = "This 4 is a test 3";
        Assertions.assertEquals(words,wordCounter.countWords(text));
    }

    @Test
    public void test_with_decimal_number(){
        String text = "This 4.21 is a test";
        Assertions.assertEquals(words,wordCounter.countWords(text));
    }

    @Test
    public void test_with_comma_number(){
        String text = "This 4,21 is a test";
        Assertions.assertEquals(words,wordCounter.countWords(text));
    }

    @Test
    public void test_with_hyphenated_word(){
        String text = "This is a-test";
        Assertions.assertEquals(words,wordCounter.countWords(text));
    }
}