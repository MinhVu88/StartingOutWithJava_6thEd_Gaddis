package CodeListings.Chapter6AFirstLookAtClasses;

/* 
- the class's functions: 

	+ roll the dice 

	+ report the dice's values 

	+ report whether the total value is even or odd
*/

public class Dealer {
	private int sixSidedDie_1_value, sixSidedDie_2_value; // fields representing the values of the 2 6-sided dice

	/**
	 * @param sixSidedDie_1_value
	 * @param sixSidedDie_2_value
	 */
	public Dealer() {
		this.sixSidedDie_1_value = 0;
		this.sixSidedDie_2_value = 0;
	}

	/**
	 * @return the sixSidedDie_1_value
	 */
	public int getSixSidedDie_1_value() {
		return sixSidedDie_1_value;
	}

	/**
	 * @return the sixSidedDie_2_value
	 */
	public int getSixSidedDie_2_value() {
		return sixSidedDie_2_value;
	}
	
	public void rollDice() {
		final int DIE_SIDES  = 6;
		
		// create 2 Die objects
		Die die1 = new Die(DIE_SIDES);
		Die die2 = new Die(DIE_SIDES);
		
		// report the dice's values
		sixSidedDie_1_value = die1.getValue();
		sixSidedDie_2_value = die2.getValue();
	}
	
	public String displayEvenOrOdd() {
		String result = "";
		
		int sum = sixSidedDie_1_value + sixSidedDie_2_value;
		
		if(sum % 2 == 0) {
			result = "even(cho)";
		}else {
			result = "odd(han)";
		}
		
		return result;
	}
}
