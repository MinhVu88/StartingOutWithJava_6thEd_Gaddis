package code_listings.ch_06_a_1st_look_at_classes;

public class DieArgument {
	public static void main(String[] args) {
		final int SIX_SIDED_DIE = 6, TWENTY_SIDED_DIE = 20;
		
		// create 2 instances of the Die class
		Die sixSidedDie = new Die(SIX_SIDED_DIE);
		Die twentySidedDie = new Die(TWENTY_SIDED_DIE);
		
		rollDie(sixSidedDie);
		rollDie(twentySidedDie);
	}
	
	/* create a method that takes a Die class's instance, die, as its parameter variable
	 * thus, the parameter variable now references the object & the method has access to the object
	 * this method simulates rolling a die & displays the die's number of sides & value
	 */
	public static void rollDie(Die die) {
		System.out.println("\nrolling a " + die.getSides() + "-sided die:");
				
		die.roll(); // roll the die
				
		System.out.println("\n\t\t\tthe die's value: " + die.getValue()); // get & display the die's value
	}
}
