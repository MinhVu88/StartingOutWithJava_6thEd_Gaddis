package challenges.ch9;

/*
- Write a class with a constructor that accepts a String object as its argument. 

- The class should have a method that returns the number of vowels in the string and 
	another method that returns the number of consonants in the string. 

- Demonstrate the class in a program that performs the following steps:

1. The user is asked to enter a string.

2. The program displays the following menu:

	a. Count the number of vowels in the string

	b. Count the number of consonants in the string

	c. Count both the vowels and consonants in the string

	d. Enter another string

	e. Exit the program

3. The program performs the operation selected by the user and repeats until the user selects e, to exit the program
*/

public class VowelsAndConsonants {
	private String userInput;
	
	public VowelsAndConsonants() {}

	/**
	 * @param userInput
	 */
	public VowelsAndConsonants(String userInput) {
		this.userInput = userInput;
	}

	/**
	 * @return the userInput
	 */
	public String getUserInput() {
		return userInput;
	}

	/**
	 * @param userInput the userInput to set
	 */
	public void setUserInput(String userInput) {
		this.userInput = userInput;
	}
	
	public int vowels() {
		int vowels = 0;
		
		char[] array = this.userInput.toCharArray();
		
		for(int index = 0; index < array.length; index++) {
			if(array[index] == 'a' || array[index] == 'i' || array[index] == 'e' || array[index] == 'o' || array[index] == 'u' ||
				array[index] == 'A' || array[index] == 'I' || array[index] == 'E' || array[index] == 'O' || array[index] == 'U') {
				vowels++;
			}
		}
		
		return vowels;
	}
	
	public int consonants() {
		int consonants = 0;
		
		char[] array = this.userInput.toCharArray();
		
		for(int index = 0; index < array.length; index++) {
			if(!(array[index] == 'a' || array[index] == 'i' || array[index] == 'e' || array[index] == 'o' || array[index] == 'u' ||
				array[index] == 'A' || array[index] == 'I' || array[index] == 'E' || array[index] == 'O' || array[index] == 'U') && 
				!Character.isWhitespace(array[index])) {
				consonants++;
			}
		}
		
		return consonants;
	}
	
	public int vowelsAndConsonants() {
		return vowels() + consonants();
	}
}
