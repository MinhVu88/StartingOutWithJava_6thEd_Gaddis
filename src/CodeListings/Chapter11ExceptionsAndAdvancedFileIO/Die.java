package CodeListings.Chapter11ExceptionsAndAdvancedFileIO;

/*
- In Java, there are 2 categories of exceptions: unchecked & checked 

- Unchecked exceptions are those that inherit from the Error class or the RuntimeException class

- You should NOT handle unchecked exceptions

- Those that do not inherit from Error or RuntimeException are checked exceptions 

- These are the exceptions that you SHOULD handle in your program 

- If the code in a method can potentially throw a checked exception, then that method must meet 1 of the following requirements:

	• It must handle the exception

	• It must have a throws clause listed in the method header (If there is more than 1 exception type, separate them with commas)
	
- The throws clause informs the compiler of the exceptions that could get thrown from a method
*/

/*
- use the throw statement to throw an exception manually 

- The general format of the throw statement:	throw new ExceptionType(MessageString);

	+ ExceptionType: an exception class name
	
	+ MessageString: an optional String argument passed to the exception object’s constructor

- The throw statement causes an exception object to be created and thrown 

- The MessageString argument contains a custom error message that can be retrieved from the exception object’s getMessage method 

- If you do not pass a message to the constructor, the exception will have a null message
*/

/*
- Note: Don’t confuse the throw statement with the throws clause 

- The throw statement causes an exception to be thrown 

- The throws clause informs the compiler that a method throws one or more exceptions
*/

import java.util.Random;

public class Die {
	private final int MIN_SIDES = 4;
	
	private int sides, value;

	/**
	 * @return the sides
	 */
	public int getSides() {
		return sides;
	}

	/**
	 * @param sides the sides to set
	 */
	public void setSides(int sides) {
		this.sides = sides;
	}

	/**
	 * @return the values
	 */
	public int getValue() {
		return value;
	}

	/**
	 * @param values the values to set
	 */
	public void setValue(int value) {
		this.value = value;
	}
	
	public Die() {}

	/**
	 * @param sides
	 */
	public Die(int sides) {
		
		/*
		- In the constructor, sides is tested to determine whether it is less than MIN_SIDES
		
		- If so, an IllegalArgumentException instance is thrown & 
			the message "The die must have at least 4 sides" is passed to the exception object’s constructor
			
		- When we catch this exception, we can retrieve the message by calling the object’s getMessage method
		
		- The IllegalArgumentException class was chosen for this error condition because it seems like the most appropriate exception to throw 
			in response to an illegal argument being passed to the constructor
		*/
		
		/*
		- NOTE: Because the IllegalArgumentException class inherits from the RuntimeException class, it is unchecked 
		
		- If we had chosen a checked exception class, we would have to put a throws clause in the constructor’s header
		*/
		if(sides < MIN_SIDES) {
			throw new IllegalArgumentException("\n\nThe die must have at least " + MIN_SIDES + " sides\n\n");
		}
		
		this.sides = sides;
		
		roll();
	}
	
	public void roll() {
		this.value = new Random().nextInt(this.sides) + 1;
	}
	
	
}
