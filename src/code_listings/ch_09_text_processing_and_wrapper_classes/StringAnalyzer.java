package code_listings.ch_09_text_processing_and_wrapper_classes;
import javax.swing.JOptionPane;

// This program displays the number of letters, digits and whitespace characters in a string

public class StringAnalyzer {

	public static void main(String[] args) {
		int letters = 0, digits = 0, whiteSpaces = 0;
		
		String input = JOptionPane.showInputDialog("enter a string:");
		
		// the toCharArray method converts an entire string & stores its individual characters as elements in an array 
		char[] array = input.toCharArray();
		
		for(int index = 0; index < array.length; index++) {
			if(Character.isLetter(array[index])) {
				letters++;
			}else if(Character.isDigit(array[index])) {
				digits++;
			}else if(Character.isWhitespace(array[index])) {
				whiteSpaces++;
			}
		}
		
		JOptionPane.showMessageDialog(null, "the string has " + letters + " letters, " + digits + " digits & " + whiteSpaces + " whitespaces");
		
		/* substring(int startingPosition)
		 the argument is the starting position of the substring
		 
		 the method returns a reference to a String object that holds all the characters from the starting position to the end of the string
		 
		 the character at the starting position is part of the substring
		*/
		String name = "Maynard James Keenan";
		
		JOptionPane.showMessageDialog(null, "full name: " + name + " & last name: " + name.substring(14));
		
		/* substring(int startingPosition, int endingPosition)
		 
		 the 1st argument specifies the substring�s starting position & the 2nd specifies the substring�s ending position
		 
		 The character at the starting position is included in the substring but the character at the ending position is not
		*/
		JOptionPane.showMessageDialog(null, "full name: " + name + " & middle name: " + name.substring(8, 13));
		
		/* void getChars(int startingPosition, int endingPosition, char[] array, int index)
		 
		 this method extracts a substring from a string & stores it in an array
		 
		 the 1st 2 arguments specify the substring's starting & ending position in the string
		 
		 The character at startingPosition is included in the substring but the character at endingPosition is not included
		 
		 The last character in the substring ends at endingPosition - 1
		 
		 The characters in the substring are stored as elements in the array whose reference is passed to the array parameter
		 
		 the last argument specifies the starting index within the array where the characters are to be stored
		*/
		char[] nameArray = new char[5];
		
		name.getChars(8, 13, nameArray, 0);
		
		JOptionPane.showMessageDialog(null, "full name: " + name);
		
		System.out.print("\nthe values in the nameArray: ");
		
		for(int index = 0; index < nameArray.length; index++ ) {
			System.out.print(" " + nameArray[index]);
		}
		
		System.exit(0);
	}

}
