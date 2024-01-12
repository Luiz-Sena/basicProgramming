public class Fatorial {
    /**
     * Calc fatorial from a number
     * ex.: 5! = 5*4*3*2*1
     * @param number
     * @return Fatorial result
     */
    public static void execute(Long number){

        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //Scanner sc = new Scanner(System.in);
        //Long number = sc.nextLong();

        Long fat = number == 0 ? 1l : number;
        while(number > 1l){
            number--;
            fat *=number;
       }

       System.out.println(fat);



        //  Long fat = number;

        //Using for
//        for (; fat > 1l; fat--) {
  //          fat *= number;
    //    }

        //Using while
        //Long fat = number == 0 ? 1l : number;
        //while(number > 1l){
          //  number--;
            //fat *=number;
        //}

        //Recursive
        //if((number == 1l) || (number == 0l)) {
          //  return 1l;
        //}else{
          //  return execute(number - 1) * number;
        //}

        //System.out.println("Fatorial = " + fat);
    }

}
