package CodeListings.Chapter6AFirstLookAtClasses;
import java.util.Scanner;

/*
- Cho-Han is a traditional Japanese gambling game in which a dealer uses a cup to roll 2 six-sided dice 

- The cup is placed upside down on a table so that the value of the dice is concealed 

- Players then wager on whether the sum of the dice values is even (Cho) or odd (Han) 

- The winner or winners take all of the wagers or the house takes them if there are no winners

- We will develop a program that simulates a simplified variation of the game 

- The simulated game will have a dealer and 2 players 

- The players will not wager money but will simply guess whether the sum of the dice values is even (Cho) or odd (Han) 

- 1 point will be awarded to the player or players correctly guessing the outcome 

- The game will play for 5 rounds and the player with the most points is the grand winner

- In the program, we will use the Die class (Die.java) 

- We will create 2 instances of the class to represent 2 six-sided dice 

- In addition to the Die class, we will write the following classes:

• Dealer class: We will create an instance of this class to represent the dealer 

	+ It will have the ability to roll the dice, report the value of the dice and report whether the total dice value is Cho or Han

• Player class: We will create 2 instances of this class to represent the players

	+ Instances of the Player class can store the player’s name, make a guess between Cho and Han and be awarded points
*/

/*
- the class's functions:

	+ generate 5 rounds of the game
	
	+ check players' guesses against dealer's results

	+ display the results between players & dealer of each round

	+ display the final winner between the 2 players

- classes to be used: Dealer.java, Player.java
*/

public class ChoHan {
	public static void main(String[] args) {
		Scanner kbi = new Scanner(System.in);
		
		String player1Name, player2Name;
		final int TOTAL_ROUNDS = 5;
		
		System.out.print("\nplayer 1's name: ");
		player1Name = kbi.nextLine();
		
		System.out.println();
		
		System.out.print("\nplayer 2's name: ");
		player2Name = kbi.nextLine();
		
		System.out.println();
		
		// create a Dealer object
		Dealer dealer = new Dealer();
		
		// create instances of the Player class
		Player player1 = new Player(player1Name);
		Player player2 = new Player(player2Name);
		
		// play 5 rounds
		for(int round = 1; round <= TOTAL_ROUNDS; round++) {
			System.out.println("\n----------------------------------------------------------");
			System.out.println("\n# round " + round + ":");
			
			// dealer rolls the dice
			dealer.rollDice();
			
			// players make guesses
			player1.makeGuesses();
			player2.makeGuesses();
			
			// show the results of this round
			displayResultsPerRound(dealer, player1, player2);
		}
		
		// show the final winner
		System.out.println("\n***********************************************************");
		displayFinalWinner(player1, player2);
		
		kbi.close();
	}
	
	public static void playersGuesses_VS_DealerResults(Player player, Dealer dealer) {
		final int AWARDED_POINTS = 1;
		
		String playerGuesses = player.getGuesses();
		String dealerResults = dealer.displayEvenOrOdd();
		
		System.out.println("\n\t- " + player.getNames() + "'s guess: " + playerGuesses);
		
		// compare players' guesses against dealer results
		if(playerGuesses.equalsIgnoreCase(dealerResults)) {
			player.addPoints(AWARDED_POINTS);
			System.out.println("\n\t- awarding " + AWARDED_POINTS + " to " + player.getNames());
		}
	}
	
	public static void displayResultsPerRound(Dealer dealer, Player player1, Player player2) {
		// show the dice results
		System.out.println("\n\t- the dealer rolled " + dealer.getSixSidedDie_1_value() + " & " + dealer.getSixSidedDie_2_value());
		System.out.println("\n\t- dealer results (even(cho)/odd(han)): " + dealer.displayEvenOrOdd());
		
		// check player guesses & award points
		playersGuesses_VS_DealerResults(player1, dealer);
		playersGuesses_VS_DealerResults(player2, dealer);
	}
	
	public static void displayFinalWinner(Player player1, Player player2) {
		System.out.println("\ngame over! the final results:");
		System.out.println("\n\t" + player1.getNames() + "'s points: " + player1.getCurrentPoints() + " - " + player2.getNames() + "'s points: " + player2.getCurrentPoints());
		
		if(player1.getCurrentPoints() > player2.getCurrentPoints()) {
			System.out.println("\n\t=> " + player1.getNames() + " is the winner");
		}else if (player2.getCurrentPoints() > player1.getCurrentPoints()) {
			System.out.println("\n\t=> " + player2.getNames() + " is the winner");
		}else {
			System.out.println("\n\t=> both players are tied");
		}
	}
}
