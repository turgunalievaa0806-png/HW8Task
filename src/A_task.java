import java.util.Scanner;

public class A_task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int count = 0;
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == 'a') {
                result.append('b');
                count++;
            } else {
                result.append(c);
            }
        }

        System.out.println(result.toString());
        System.out.println(count);
    }
}
