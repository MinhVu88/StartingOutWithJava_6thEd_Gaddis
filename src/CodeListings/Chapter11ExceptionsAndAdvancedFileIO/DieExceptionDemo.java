package CodeListings.Chapter11ExceptionsAndAdvancedFileIO;

// This program demonstrates how the Die class throws an exception when an invalid value is passed to the constructor

public class DieExceptionDemo {

	public static void main(String[] args) {
		final int DIE_SIDES = 3;
		
		Die die = new Die(DIE_SIDES);
		
		System.out.println("\n initial value of the die: " + die.getValue());
	}

}
