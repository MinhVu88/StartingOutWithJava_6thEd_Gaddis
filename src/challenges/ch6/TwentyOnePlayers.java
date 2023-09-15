package challenges.ch6;

public class TwentyOnePlayers {
	private int die1Value, die2Value;
	private String name;

	/**
	 * 
	 */
	public TwentyOnePlayers() {
		this.die1Value = 0;
		this.die2Value = 0;
	}

	/**
	 * @param name
	 */
	public TwentyOnePlayers(String name) {
		this.name = name;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the die1Value
	 */
	public int getDie1Value() {
		return die1Value;
	}

	/**
	 * @return the die2Value
	 */
	public int getDie2Value() {
		return die2Value;
	}
	
	public int rollDice() {
		final int SIDES_1 = 6, SIDES_2 = 6;
		
		Die die1 = new Die(SIDES_1);
		Die die2 = new Die(SIDES_2);
		
		die1Value = die1.getValues();
		die2Value = die2.getValues();
		
		return die1Value + die2Value;
	}
}
