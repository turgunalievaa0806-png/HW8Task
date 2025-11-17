import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class D_task {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("input.txt"));

            int sum = 0;
            int count = 0;

            while (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                sum += number;
                count++;
            }

            scanner.close();

            double average = (double) sum / count;

            PrintWriter writer = new PrintWriter("output.txt");
            writer.printf("%.3f", average);
            writer.close();

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден!");
        }
    }
}
