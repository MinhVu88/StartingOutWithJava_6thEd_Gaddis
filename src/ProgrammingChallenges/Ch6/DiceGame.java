package ProgrammingChallenges.Ch6;

import java.util.Scanner;

/*
- Write a program that uses the Die class that was presented in this chapter to play a simple dice game between the computer and the user 

- The program should create 2 instances of the Die class (each a 6-sided die) 

- One Die object is the computer’s die and the other Die object is the user’s die

- The program should have a loop that iterates 10 times 

- Each time the loop iterates, it should roll both dice 

- The die with the highest value wins (In case of a tie, there is no winner for that particular roll of the dice)

- As the loop iterates, the program should keep count of the number of times the computer wins and the number of times that the user wins 

- After the loop performs all of its iterations, the program should display who was the grand winner, the computer or the user
*/

public class DiceGame {
	public static void main(String[] args) {
		final int ROUNDS = 10, DIE_SIZE = 6;
		
		int totalCompWins = 0, totalCompScores = 0, totalHumanWins = 0, totalHumanScores = 0;
		
		boolean wannaPlay;
		
		String reply;
		
		Scanner kbi = new Scanner(System.in);
		
		Die computer = new Die(DIE_SIZE);
		
		Die human = new Die(DIE_SIZE);
		
		do {
			for(int round = 1; round <= ROUNDS; round++) {
				System.out.println("\nround #" + round + ": ");
				
				computer.roll();
				
				human.roll();
				
				if(computer.getValues() > human.getValues()) {
					System.out.println("\n\tcomputer wins: " + computer.getValues());
					
					System.out.println("\n\thuman: " + human.getValues());
					
					totalCompScores += computer.getValues();
					
					totalCompWins++;
				}else if(computer.getValues() < human.getValues()) {
					System.out.println("\n\thuman wins: " + human.getValues());
					
					System.out.println("\n\tcomputer: " + computer.getValues());
					
					totalHumanScores += human.getValues();
					
					totalHumanWins++;
				}else {
					System.out.print("\n\tthis is a tie. Keep playing? (Y/y/N/n): ");
					
					reply = kbi.nextLine();
					
					if(reply.equalsIgnoreCase("Y")) {
						wannaPlay = true;
					}else {
						wannaPlay = false;
						
						break;
					}
				}
			}
			
			if(totalCompWins > totalHumanWins) {
				System.out.println("\n* computer is the grand winner");
			}else if(totalCompWins < totalHumanWins) {
				System.out.println("\n* human is the grand winner");
			}else {
				System.out.println("\n* noboby wins");
			}
			
			System.out.print("\n=> play again? (Y/y/N/n): ");
			
			reply = kbi.nextLine();
			
			if(reply.equalsIgnoreCase("Y")) {
				wannaPlay = true;
			}else {
				wannaPlay = false;
			}
		}while(wannaPlay);
		
		if(totalCompWins > totalHumanWins) {
			System.out.println("\n\t[ computer is the grand winner -> wins: " + totalCompWins + " - scores: " + totalCompScores + " ]");
		}else {
			System.out.println("\n\t[ human is the grand winner -> wins: " + totalHumanWins + " - scores: " + totalHumanScores + " ]");
		}
		
		System.out.println("\n\t\tThank you for playing the game");
		
		kbi.close();
	}
	
}
