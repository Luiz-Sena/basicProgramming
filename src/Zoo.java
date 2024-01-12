public class Zoo {
    public static void execute(String text){

        text = text.toUpperCase();
        int countZ = 0;
        int countO = 0;

        if(text.length() >20){
            System.out.print("No");
            return;
        }

        for (int i=0; i< text.length(); i++) {
            char letter = text.charAt(i);

            if(letter == 'Z'){
                if(countO > 0){
                    System.out.print("No");
                    return;
                }

                countZ++;
                continue;
            }

            if (letter == 'O'){
                countO++;
            }
        }

        if(2 * countZ == countO){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }

}
