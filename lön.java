import java.util.Scanner;
public class lön {

    public static void main(String[] args) {

        Scanner IPtimmar = new Scanner(System.in);
        System.out.println("timmar som är jobbade");

        float timmar = IPtimmar.nextFloat();

        System.out.println("OB1 timmar som är jobbade");
        float OB1timmar = IPtimmar.nextFloat();

        System.out.println("OB2 timmar som är jobbade");
        float OB2timmar = IPtimmar.nextInt();

        System.out.println("dagar jobbade");
        float dagar = IPtimmar.nextInt();

       // System.out.println("Skriv 1,1272");
       // double förmånprocent = IPtimmar.nextDouble();



        //System.out.println("" + timmar);
        //System.out.println("OB1" + OB1timmar);
        //System.out.println("OB2" + OB2timmar);

        //float totalTimmar = timmar - OB1timmar - OB2timmar;
        float totalOB1timmar = OB1timmar - OB2timmar;

        float löntimmar = timmar * 107;
        float lönOB1timmar = totalOB1timmar * 25;
        float lönOB2timmar = OB2timmar * 46;
        float löndagar = dagar * 33;
        float lönavdrag = dagar * 51;


        //System.out.println(löntimmar);
        //System.out.println(lönOB1timmar);
        //System.out.println(lönOB2timmar);
        //System.out.println(löndagar);
        //System.out.println(lönavdrag);




        double lön = löntimmar + lönOB1timmar + lönOB2timmar + löndagar;

        double totallön = lön * 1.1272 - lönavdrag;

        double lönEFS = lön * 0.70;

        System.out.println("lön" + " " + totallön);
        System.out.println("lön efter skatt" + " " + lönEFS);






    }
}
