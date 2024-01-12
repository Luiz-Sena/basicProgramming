import java.math.BigDecimal;
import java.util.Scanner;

public class DivisibilityBy10 {
    public static void execute(){

        Scanner s = new Scanner(System.in);
        int N = 0;
        BigDecimal number;
        N = s.nextInt();
        StringBuilder sb = new StringBuilder();

        Long[] data = new Long[N];
        for(int i=0; i<N; i++){
            data[i] = s.nextLong();
        }

        for(int i=0; i< data.length; i++){
            String numberStr = data[i].toString();
            sb.append(numberStr.charAt(numberStr.length() - 1 ));
        }

        number = new BigDecimal(sb.toString());

        if(number == BigDecimal.ZERO ){
            System.out.println("No");
        }
        boolean ans = number.remainder(BigDecimal.TEN) == BigDecimal.ZERO;

        System.out.println(ans ? "Yes" : "No");
    }

}
