package ProgrammingChallenges.Ch6;
import java.util.Random;

public class Die {
	private int sides, values;

	/**
	 * @param sides
	 */
	public Die(int sides) {
		this.sides = sides;
		roll();
	}
	
	public Die() {
		this.sides = 0;
		
		this.values = 0;
	}
	
	public int getSides() {
		return sides;
	}

	public void setSides(int sides) {
		this.sides = sides;
	}

	public int getValues() {
		return values;
	}

	public void setValues(int values) {
		this.values = values;
	}

	public void roll() {
		Random randomValue = new Random();
		
		values = randomValue.nextInt(sides) + 1;
	}
		
}
