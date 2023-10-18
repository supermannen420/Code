import java.util.Scanner;


public class TrePunktEtt {

    public static void main(String[] args) {


        System.out.println("skriv radie");

        Scanner KBD = new Scanner(System.in);


        double radius = KBD.nextDouble();
        double area = 4*Math.PI*radius*radius;
        double volume = 4*Math.PI*Math.pow(radius,3)/3;

        System.out.println("radius: " + radius);
        System.out.println("area: " + area);
        System.out.println("volume: " + volume);





    }
}
