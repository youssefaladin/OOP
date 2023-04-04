import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class Main {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://cs.armstrong.edu/liang/data/Lincoln.txt");
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
            String line = null;
            int wordCount = 0;

            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }

            reader.close();

            System.out.println("The Gettysburg Address contains " + wordCount + " words.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
