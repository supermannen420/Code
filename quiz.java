import java.util.Scanner;
public class quiz {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner   (System.in);



        System.out.println("två + två");
        System.out.println("Svara i text");

        String answer = keyboard.nextLine();


        if (answer.contains ("fyra")) {

            System.out.println("rätt");



        }else{
            System.out.println("fel");

        }

        /////////////////////////////////////////
        System.out.println("fem + fem");
        System.out.println("Svara i text");

        String answer2 = keyboard.nextLine();


        if (answer2.contains ("tio")) {

            System.out.println("rätt");



        }else{
            System.out.println("fel");

        }

        /////////////////////////////////////////
        System.out.println("4,5 + 3.2 + 1,3");
        System.out.println("Svara i text");

        String answer3 = keyboard.nextLine();


        if (answer3.contains ("nio")) {

            System.out.println("rätt");



        }else{
            System.out.println("fel");

        }
    }


}