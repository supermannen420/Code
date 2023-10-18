import java.util.Scanner;
public class multiplikator {


    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);
        System.out.println("skriv vilket tal som ska multipliceras");

        int Siffra = Keyboard.nextInt();

        //går att ändra 11 så att tabellen blir längre
        for (int i = 0; i < 11; i++) {
            System.out.println(i +  "*" + Siffra +  "=" + (Siffra * i) );
        }
    }
}
