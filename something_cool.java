import java.util.Scanner;
public class something_cool {

    public static void main(String[] args) {
        System.out.println("kryptera_ord_skriv_1");
        System.out.println("lös_kryptering_skriv_2");

        Scanner kryptera = new Scanner(System.in);
        String answer = kryptera.nextLine();

       int nummber = Integer.parseInt(answer);

        if (nummber == 1){
            System.out.println("kryptera");

            System.out.println("skriv de som ska krypteras");
            Scanner OrdIn = new Scanner(System.in);
            String ord = OrdIn.nextLine();

            

            System.out.println();




        }else if (nummber == 2){
            System.out.println("lös");

            System.out.println("skriv de som ska lösas");
            Scanner OrdIn = new Scanner(System.in);
            String LösOrd = OrdIn.nextLine();

        }else{
           // System.exit(0);
        }



        // om 1 kryptera om 2 lös




















    }
}
