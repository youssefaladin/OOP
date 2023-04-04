import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String filename = "Heba.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
            Random rand = new Random();
            for (int i = 0; i < 100; i++) {
                writer.write(rand.nextInt(1000) + " ");
            }
            writer.newLine();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line = reader.readLine();
            String[] tokens = line.split("\\s+");
            ArrayList<Integer> numbers = new ArrayList<Integer>();
            for (String token : tokens) {
                numbers.add(Integer.parseInt(token));
            }
            Collections.sort(numbers);
            for (int number : numbers) {
                System.out.print(number + " ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
