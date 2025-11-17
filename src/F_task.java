import java.util.Scanner;

public class F_task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (c == '.' || c == ',' || c == ';' || c == ':' || c == '!' || c == '?') {
                count++;
            }
        }

        System.out.println(count);
    }
}
