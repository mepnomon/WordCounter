package wordcounter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Simple application to extract text from a file.
 * @author D. Dressler
 */
public class FileTextExtractor {

    public String extractTextFromFile() {
        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("war_of_the_worlds.txt");
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        List<String> lines = new ArrayList<>();

        try {
            String line = reader.readLine();

            while(line != null){
                lines.add(line);
                line = reader.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                inputStream.close();
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return convertLinesToString(lines);
    }

    private String convertLinesToString(List<String> lines){
        return String.join(" ",lines);
    }
}
