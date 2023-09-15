package code_listings.ch_04_loops_and_files;
import java.util.Scanner; 
import java.util.Random;

/* description: 

- write a program to simulate several rolls of dice, one after the other

- the program generates 2 random numbers in the range b/w 1 & 6 and display them

- you will write a while loop that simulates one roll of the dice & then asks the user whether another roll should be performed 

- as long as the user answers �y� for yes, the loop will repeat 
*/

/* pseudocode:

-While the user wants to roll the dice:
	
	+ Display a random number in the range of 1 through 6
	
	+ Display another random number in the range of 1 through 6
	
	+ Ask the user if he or she wants to roll the dice again
*/

public class RollDice {
	public static void main(String[] args) {
		
		// create instances of the Scanner & Random classes
		Scanner kb = new Scanner(System.in);
		Random roll1 = new Random();
		Random roll2 = new Random();
		
		boolean wannaRoll = true;
		String reply;
		
		while(wannaRoll) {
			// generate a random number in the range of 0 thru 5 and then add 1 to the range, making it go from 1 to 6
			System.out.println("\nthe random no in the 1st roll: " + (roll1.nextInt(6) + 1));
			
			System.out.println("the random no in the 2nd roll: " + (roll2.nextInt(6) + 1));
			
			System.out.print("\ndo you want another roll? (Y/y/N/n) - ");
			reply = kb.nextLine();
			
			if(reply.equalsIgnoreCase("Y")) {
				wannaRoll = true;
			}else {
				wannaRoll = false;
			}
		}
		
		kb.close();
	}
}
