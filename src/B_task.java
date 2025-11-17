import java.util.Scanner;

public class B_task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int countB = 0;
        int countR = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'B') {
                countB++;
            } else {
                countR++;
            }
        }

        int minRemove = input.length();
        int bestBlue = 0;


        for (int i = 0; i <= countB; i++) {

            int blueInFirst = 0;
            int redInFirst = 0;
            for (int j = 0; j < i; j++) {
                if (input.charAt(j) == 'B') {
                    blueInFirst++;
                } else {
                    redInFirst++;
                }
            }

            if (redInFirst > 0) {
                continue;
            }

            int remove = countB - blueInFirst;

            if (remove < minRemove) {
                minRemove = remove;
                bestBlue = i;
            }
        }


        String result = "";
        for (int i = 0; i < bestBlue; i++) {
            result += "B";
        }
        for (int i = 0; i < countR + (countB - bestBlue); i++) {
            result += "R";
        }

        System.out.println(result);
        System.out.println(minRemove);
    }
}
