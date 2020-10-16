package CodeListings.Chapter3DecisionStructures;

import java.util.Scanner;

public class Seasons {
    public static void main(String[] args) {
        String input;
        Scanner kb = new Scanner(System.in);
        System.out.print("pick 1 of the 4 seasons & it'll be translated into German: ");
        input = kb.nextLine();

        switch (input) {
            case "winter":
                System.out.println("winter");
                break;
            case "spring":
                System.out.println("fruhling");
                break;
            case "fall":
            case "autumn":
                System.out.println("herbst");
                break;
            case "summer":
                System.out.println("sommer");
                break;
            default:
                System.out.println("invalid input");
        }
        
        kb.close();
    }
}
