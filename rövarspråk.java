import java.util.Scanner;


public class rövarspråk{

    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);

        String slutsvar = "";

        System.out.println("vad heter du?");
        String answer = keyboard.nextLine();
        
        
    answer = answer.toLowerCase(); // Gör om texten till små bokstäver för att behandla både stora och små bokstäver på samma sätt

for (int i = 0; i < answer.length(); i++) {
    char character = answer.charAt(i);
    if (Character.isLetter(character)) { // Kontrollera om tecknet är en bokstav
        if ("aeiouy".indexOf(character) == -1) {

            slutsvar = slutsvar + character + "o" + character;
        }else{

            slutsvar = slutsvar + character ;


        }
    }


}



    System.out.println(slutsvar);

    }



}