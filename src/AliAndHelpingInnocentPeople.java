import java.util.Scanner;

public class AliAndHelpingInnocentPeople {
    public static void execute(String text) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        if(str.contains("A") ||
                str.contains("E")||
                str.contains("I")||
                str.contains("O")||
                str.contains("U")||
                str.contains("Y")){
            System.out.println("invalid");
            return;
        }
        boolean isValid = false;

        for (int i = 0; i <= str.length() - 2; i++ ){
            char currently = str.charAt(i);
            char next = str.charAt(i+1);
            if(Character.isDigit(currently) && Character.isDigit(next)){
                isValid = ((Integer.valueOf(str.charAt(i)) + Integer.valueOf(str.charAt(i+1))) % 2) == 0;
                if(!isValid){
                    System.out.println("invalid");
                    return;
                }
            }
        }

        if(isValid){
            System.out.println("valid");
        }
    }
}
