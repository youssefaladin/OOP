import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please specify the filename as a command-line argument.");
            return;
        }

        String filename = args[0];
        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;

            while ((line = reader.readLine()) != null) {
                lineCount++;
                charCount += line.length();
                String[] words = line.trim().split("\\s+");
                wordCount += words.length;
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return;
        }

        System.out.println("The file " + filename + " contains:");
        System.out.println("  " + charCount + " characters");
        System.out.println("  " + wordCount + " words");
        System.out.println("  " + lineCount + " lines");
    }
}
