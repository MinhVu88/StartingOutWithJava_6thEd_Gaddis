package CodeListings.Chapter6AFirstLookAtClasses;
import java.util.Random;

/* 
- the class's functions: 

	+ store the players' names 

	+ guess whether the total dice values are even or odd  

	+ add new points earned to players' current points
*/

public class Player {
	private String names, guesses;
	private int currentPoints;
	
	/**
	 * @param names
	 * @param guesses
	 * @param currentPoints
	 */
	public Player(String names) {
		this.names = names;
		this.guesses = "";
		this.currentPoints = 0;
	}

	/**
	 * @return the names
	 */
	public String getNames() {
		return names;
	}

	/**
	 * @return the guesses
	 */
	public String getGuesses() {
		return guesses;
	}

	/**
	 * @return the currentPoints
	 */
	public int getCurrentPoints() {
		return currentPoints;
	}

	public void makeGuesses() {
		Random randomGuessNo = new Random();
		
		if(randomGuessNo.nextInt(2) == 0) {
			guesses = "even(cho)";
		}else {
			guesses = "odd(han)";
		}
	}
	
	public void addPoints(int newPoints) {
		currentPoints += newPoints;
	}
}
