import java.util.Scanner;

public class PalindromeBinarySearch {
    public static void execute(){
        Scanner sc =new Scanner(System.in);
        String str = sc.nextLine();

        for(int i = 0; i < str.length()/2; i++){

            if(str.charAt(i) == str.charAt(str.length()-1-i)){
                if(i == str.length()/2-1){
                    System.out.println("YES");
                    break;
                }else{
                    continue;
                }
            }else{
                System.out.println("NO");
                break;
            }
        }
        sc.close();
    }

}
