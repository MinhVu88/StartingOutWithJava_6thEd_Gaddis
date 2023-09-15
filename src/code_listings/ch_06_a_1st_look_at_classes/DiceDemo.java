package code_listings.ch_06_a_1st_look_at_classes;


public class DiceDemo {
	public static void main(String[] args) {
		final int DIE1_SIDES = 6, DIE2_SIDES = 12, ROLLS = 5;
		
		// create 2 instances of the Die class
		Die die1 = new Die(DIE1_SIDES);
		Die die2 = new Die(DIE2_SIDES);
		
		System.out.println("\nthis's the simulation of the rolling of a " + DIE1_SIDES + "-sided die & a " + DIE2_SIDES + "-sided die");
		
		System.out.println("\nthe initial values of the 2 dice: " + "[die 1: " + die1.getValue() + " - die 2: " + die2.getValue() + "]");
		
		System.out.println("\n\t\tRoll the dice for " + ROLLS + " times");
		System.out.println("\t      -----------------------------");
		
		for(int roll = 1; roll <= ROLLS; roll++) {
			// roll the dice by calling the roll() method
			die1.roll();
			die2.roll();
			
			System.out.println("\n* roll " + roll + ":");
			System.out.println("\n\t  die 1's value: " + die1.getValue() + " - die 2's value: " + die2.getValue());
		}
	}
}
