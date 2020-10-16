package CodeListings.Chapter6AFirstLookAtClasses;
import java.util.Random;

public class Die {
	private int dieSides, dieValue; // fields representing a die's number of sides & its value

	/**
	 * @param sides
	 */
	public Die(int sides) {
		this.dieSides = sides;
		roll(); // invoke the roll() method
	}
	
	public void roll() {
		/* 
		 - a random number is generated for the appropriate range of this particular die's number of sides
		 - if the die's sides are 6, then randomNo.nextInt(dieSides) + 1 will return a random number between 1 & 6
		*/
		Random randomNo = new Random();
	
		dieValue = randomNo.nextInt(dieSides) + 1; 
	}

	/**
	 * @return the sides
	 */
	public int getSides() {
		return dieSides;
	}

	/**
	 * @return the value
	 */
	public int getValue() {
		return dieValue;
	}
	
	
}
