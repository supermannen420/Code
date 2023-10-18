import javax.swing.*;
import java.util.Scanner;
public class betygssättare {

    public static void main(String[] args) {

       // Scanner Keyboard = new Scanner (System.in);
        //System.out.println("Skriv Poäng!");
        JOptionPane.showMessageDialog(null, "Skriv Poäng!");

        int Poäng = Integer.parseInt( JOptionPane.showInputDialog("Skriv Poäng Från Prov!"));

        //int Poäng = Keyboard.nextInt();

        if (Poäng <= 15){
            //System.out.println("Ej godkänd");
            JOptionPane.showMessageDialog(null, "Ej godkänd");

        }else if (Poäng > 14 && Poäng < 18 ){
           // System.out.println("godkänd på (E) nivå!");
            JOptionPane.showMessageDialog(null, "godkänd på (E) nivå!");
        }else if (Poäng > 17 && Poäng <21){
            //System.out.println("godkänd på (D) nivå!");
            JOptionPane.showMessageDialog(null, "godkänd på (D) nivå!");

        }else if (Poäng > 20 && Poäng < 24){
            //System.out.println("godkänd på (C) nivå!");
            JOptionPane.showMessageDialog(null, "godkänd på (C) nivå!");

        }else if (Poäng > 23 && Poäng < 27){
            //System.out.println("godkänd på (B) nivå!");
            JOptionPane.showMessageDialog(null, "godkänd på (B) nivå!");

        }else if (Poäng > 26 && Poäng < 30){
            //System.out.println("godkänd på (A) nivå!");
            JOptionPane.showMessageDialog(null, "godkänd på (A) nivå!");

        }else if (Poäng > 30 && Poäng < 0){
            JOptionPane.showMessageDialog(null, "fel!!!");

        }
    }
}
