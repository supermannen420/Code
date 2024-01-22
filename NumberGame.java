import java.util.Scanner;
import java.util.Random;
public class NumberGame {
    public static void main(String[] args)
    {System.out.println("gissa nummer mellan 0 och 10");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        Random random = new Random();
        int answer = random.nextInt(10);
        if (num == answer){
            System.out.println("rätt");}
        else {
            System.out.println("fel");}
    }
}