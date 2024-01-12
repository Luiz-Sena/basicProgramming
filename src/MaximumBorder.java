import java.util.Scanner;

public class MaximumBorder {

    public static void execute(String text) {
        Scanner s = new Scanner(System.in);
        int t = Integer.valueOf(s.nextLine());

        for (int i = 0; i < t; i++) {
            int countMaxBlack = 0;
            int countLine = 0;

            String nm[] = s.nextLine().split(" ");
            int n = Integer.valueOf(nm[0]);
            int m = Integer.valueOf(nm[1]);

            while (countLine < n) {
                int countBlack = 0;
                String line = s.nextLine();

                for (int x = 0; x < m; x++) {
                    if (line.charAt(x) == '#') {
                        countBlack++;
                    }
                }
                if (countBlack > countMaxBlack) {
                    countMaxBlack = countBlack;
                }
                countLine++;
            }

            System.out.println(countMaxBlack);
        }
    }
}
