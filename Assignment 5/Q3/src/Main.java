import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        System.out.println("Enter 5 numbers: ");
        for (int i = 0; i < 5; i++) {
            int num = input.nextInt();
            numbers.add(num);
        }

        Collections.sort(numbers);

        System.out.println("The numbers in increasing order are:");
        for (int i = 0; i < 5; i++) {
            System.out.println(numbers.get(i));
        }
    }
}