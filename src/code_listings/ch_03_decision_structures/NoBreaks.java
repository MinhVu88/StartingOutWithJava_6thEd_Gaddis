package code_listings.ch_03_decision_structures;
import java.util.Scanner;

public class NoBreaks {
    public static void main(String[] args) {
        int number;
        Scanner kb = new Scanner(System.in);
        System.out.print("enter some numbers (1, 2 or 3): ");
        number = kb.nextInt();

        switch (number) {
            case 1:
                System.out.println("you enter 1");
            case 2:
                System.out.println("you enter 2");
            case 3:
                System.out.println("you enter 3");
            default:
                System.out.println("invalid number");
        }
        
        kb.close();
    }
}
