import java.math.BigDecimal;
import java.util.Scanner;

public class Palindrome {
    public static void execute(){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        StringBuilder sb = new StringBuilder();

        for(int i = s.length() - 1; i >= 0 ; i--) {
            sb.append(s.charAt(i));

        }
        System.out.println(sb.toString().equals(s) ? "Yes" : "No");

        sc.close();
    }

}
