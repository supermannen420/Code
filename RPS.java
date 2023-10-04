import java.util.Scanner;

public class RPS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int userInput = scanner.nextInt();
        
        if (userInput == 5) {
            System.out.println("Win");
        } else {
            System.out.println("Wrong");
        }
        
        scanner.close();
    }
}
