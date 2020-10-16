package CodeListings.Chapter3DecisionStructures;

import java.util.Scanner;

public class PetFood {
    public static void main(String[] args) {
        String input;
        char grade;

        System.out.print("There are 3 grades for pet food: A, B & C. Which grade would you give to the pet food? ");
        Scanner kb = new Scanner(System.in);
        input = kb.nextLine();
        grade = input.charAt(0); // get the 1st letter of user input (A/a, B/b & C/c)

        switch (grade) {
            case 'a': // this case contains no statements, so the program falls thru to the next case which has statements to be executed in it
            case 'A':
                System.out.println("this's a good one");
                break;
            case 'b':
            case 'B':
                System.out.println("this's ok");
                break;
            case 'c':
            case 'C':
                System.out.println("wtf is this shit?");
                break;
            default:
                System.out.println("invalid input");
        }
        
        kb.close();
    }
}
