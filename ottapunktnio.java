import java.util.Scanner;
public class ottapunktnio {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        String Text = kb.nextLine();

       String trimmedtext = Text.replaceAll("\\s", "");

        System.out.println(trimmedtext);

    }
}
