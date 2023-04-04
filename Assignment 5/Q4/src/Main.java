import java.io.*;

public class Main {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java Main <string_to_remove> <filename>");
            System.exit(1);
        }

        String stringToRemove = args[0];
        String filename = args[1];

        try {
            File inputFile = new File(filename);
            File outputFile = new File("temp.txt");
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
            String line = null;

            while ((line = reader.readLine()) != null) {
                String modifiedLine = line.replaceAll(stringToRemove, "");
                writer.write(modifiedLine + "\n");
            }

            reader.close();
            writer.close();

            inputFile.delete();
            outputFile.renameTo(inputFile);

            System.out.println("All occurrences of \"" + stringToRemove + "\" have been removed from the file.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
