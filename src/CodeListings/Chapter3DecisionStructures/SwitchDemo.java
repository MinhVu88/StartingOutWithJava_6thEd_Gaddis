package CodeListings.Chapter3DecisionStructures;
import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        int number;
        Scanner kb = new Scanner(System.in);
        System.out.print("enter some numbers (1, 2 or 3): ");
        number = kb.nextInt();

        switch (number) {
            case 1:
                System.out.println("you enter 1");
                break;
            case 2:
                System.out.println("you enter 2");
                break;
            case 3:
                System.out.println("you enter 3");
                break;
            default:
                System.out.println("invalid number");
        }
        
        kb.close();
    }
}
