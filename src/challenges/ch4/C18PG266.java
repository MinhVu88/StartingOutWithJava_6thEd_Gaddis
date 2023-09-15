package challenges.ch4;
import java.util.Random;
import java.util.Scanner;

/*
- Enhance the program that you wrote for pc17pg266 so it keeps a count of the number of guesses that the user makes 

- When the user correctly guesses the random number, the program should display the number of guesses
*/

public class C18PG266 {
	public static void main(String[] args) {
		Scanner kbi = new Scanner(System.in);
		Random randomNumber = new Random();
		
		int randomNo, userGuess, correctGuesses = 0;
		boolean wannaGuess = true;
		String reply;
		
		while(wannaGuess) {
			randomNo = randomNumber.nextInt(6);
			System.out.print("\nPick a random number between 0 & 5: ");
			userGuess = kbi.nextInt();
			
			if(userGuess == randomNo) {
				System.out.println("\n\tCORRECT!");
				correctGuesses++;
				System.out.println("\n\tyour guess: " + userGuess);
				System.out.println("\n\tthe random number: " + randomNo);
				int totalCorrectGuesses =+ correctGuesses;
				System.out.println("\n\t\tthe total correct guesses you've made so far: " + totalCorrectGuesses);
				
				kbi.nextLine(); // consume the remaining newline character
				
				System.out.print("\nwanna keep guessing? (Y/y/N/n): ");
				
				reply = kbi.nextLine();
				
				if(reply.equalsIgnoreCase("Y")) {
					wannaGuess = true;
				}else {
					System.out.println("\nthanks for guessing! the total correct guesses you made: " + totalCorrectGuesses);
					wannaGuess = false;
				}
			}else {
				System.out.println("\n\tWRONG! plz try again");
				System.out.println("\n\tyour guess: " + userGuess);
				System.out.println("\n\tthe random number: " + randomNo);
				wannaGuess = true;
			}
		}
		
		kbi.close();
	}
}
