package challenges.ch6;
import java.util.Scanner;

/*
- write a program that lets the user play against the computer in a variation of the popular blackjack card game 

- In this variation of the game, 2 six-sided dice are used instead of cards 

- The dice are rolled & the player tries to beat the computer�s hidden total without going over 21

- Here are some suggestions for the game�s design:

� Each round of the game is performed as an iteration of a loop that repeats as long as the player agrees to roll the dice & the player�s total does not exceed 21

� At the beginning of each round, the program will ask the user whether or not he or she wants to roll the dice to accumulate points

� During each round, the program simulates the rolling of 2 six-sided dice 

	+ It rolls the dice 1st for the computer & then it asks the user whether he or she wants to roll

� The loop keeps a running total of both the computer�s & the user�s points

� The computer�s total should remain hidden until the loop has finished

� After the loop has finished, the computer�s total is revealed & the player with the most points, without going over 21, wins
*/

public class TwentyOne {
	public static void main(String[] args) {
		Scanner kbi = new Scanner(System.in);
		
		final int MAX_POINT = 21;
		int rounds, individualCompPoints = 0, totalCompPoints = 0, individualHumanPoints = 0, totalHumanPoints = 0;
		String reply, playerName;
		boolean wannaPlay = true;
		
		System.out.print("\nplayer's name: ");
		playerName = kbi.nextLine();
		
		TwentyOnePlayers human = new TwentyOnePlayers(playerName);
		TwentyOnePlayers computer = new TwentyOnePlayers();
		
		do {
			System.out.print("\nthe number of rounds: ");
			rounds = kbi.nextInt();
			
			kbi.nextLine();
			
			int roundCounter = 1;
			
			while(roundCounter <= rounds && wannaPlay) {
				System.out.println("\nround #" + roundCounter + ": ");
				
				individualCompPoints = computer.rollDice();
				
				System.out.print("\n- the computer rolled the dice. Do you want to roll them? (Y/y/N/n): ");
				
				totalCompPoints += individualCompPoints;
				
				reply = kbi.nextLine();
				
				if(reply.equalsIgnoreCase("Y")) {
					wannaPlay = true;
					
					individualHumanPoints = human.rollDice();
					
					System.out.println("\n- " + human.getName() + " rolled the dice -> points: " + individualHumanPoints);
					
					totalHumanPoints += individualHumanPoints;
					
					roundCounter++;
				}else {
					wannaPlay = false;
				}
			}
			
			System.out.println("\n* The result: ");
			
			System.out.println("\t\ncomputer's points: " + totalCompPoints + " & " + human.getName() + "'s points: " + totalHumanPoints);
			
			if(totalCompPoints > MAX_POINT && totalHumanPoints > MAX_POINT) {
				System.out.println("\t\n=> both the computer & " + human.getName() + " lose");
				
				System.out.print("\ndo you want to play again? (Y/y/N/n): ");
				
				reply = kbi.nextLine();
				
				if(reply.equalsIgnoreCase("Y")) {
					wannaPlay = true;
				}else {
					wannaPlay = false;
				}
			}else if(totalCompPoints > MAX_POINT || (totalCompPoints < totalHumanPoints && totalHumanPoints < MAX_POINT)) {
				System.out.println("\t\n=> " + human.getName() + " wins");
				
				System.out.print("\ndo you want to play again? (Y/y/N/n): ");
				
				reply = kbi.nextLine();
				
				if(reply.equalsIgnoreCase("Y")) {
					wannaPlay = true;
				}else {
					wannaPlay = false;
				}
			}else if(totalHumanPoints > MAX_POINT || (totalHumanPoints < totalCompPoints && totalCompPoints < MAX_POINT)) {
				System.out.println("\t\n=> the computer wins");
				
				System.out.print("\ndo you want to play again? (Y/y/N/n): ");
				
				reply = kbi.nextLine();
				
				if(reply.equalsIgnoreCase("Y")) {
					wannaPlay = true;
				}else {
					wannaPlay = false;
				}
			}
		} while(wannaPlay);
		
		System.out.println("\nyou chose to stop the game. Thanks for playing!");
		
		kbi.close();
	}
}
