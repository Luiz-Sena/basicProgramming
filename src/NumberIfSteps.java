import java.util.Scanner;

public class NumberIfSteps {
    public static void execute(String text){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] a = new long[n];
        long[] b = new long[n];
        long count = 0;
        long minimumA;

        for (int idx = 0; idx < n; idx++) {
            a[idx] = scanner.nextInt();
        }

        for (int idx = 0; idx < n; idx++) {
            b[idx] = scanner.nextInt();
        }

        minimumA = a[0];

        for (long value : a) {
            if (value < minimumA) {
                minimumA = value;
            }
        }

        for (int idx = 0; idx < n; idx++) {
            if (a[idx] >= b[idx]) {
                while (a[idx] > minimumA) {
                    a[idx] -= b[idx];
                    count++;
                }
            }

            if (a[idx] < minimumA) {
                minimumA = a[idx];
                idx = 0;
            }

            if (a[idx] != minimumA) {
                count = -1;
                break;
            }
        }

        System.out.println(count);
    }

}
