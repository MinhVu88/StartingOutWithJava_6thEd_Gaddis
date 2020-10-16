package CodeListings.Chapter9TextProcessingAndWrapperClasses;

public class StringBuilder_Methods {

	public static void main(String[] args) {
		// the append method
		StringBuilder str0 = new StringBuilder();
		
		str0.append("\nwe sold ");
		
		str0.append(25);
		
		str0.append(" cookies for $");
		
		str0.append(17.69);
		
		System.out.println(str0);
		
		/* the insert method
		 
		 - the general form: object.insert(int startingPosition, any data type insertedItem)
		 
		 - startingPosition: the position of the insertion that begins in a string
		 
		 - The value to be inserted may be of any primitive data type, a char array or a String object
		*/
		StringBuilder str1 = new StringBuilder("New City");
		
		str1.insert(4, "York ");
		
		System.out.println("\n" + str1);
		
		char[] array = {'2', '0', ' '};
		
		StringBuilder str2 = new StringBuilder("in July we sold cars");
		
		str2.insert(16, array);
		
		System.out.println("\n" + str2);
		
		/* the replace method replaces a specified substring with a string
		 
		 - the general form: object.replace(int startingPosition, int endingPosition, String str)
		 
		 - startingPosition (included) & endingPosition (excluded): the starting & ending positions of a substring
		 
		  - str: a String object
		*/
		StringBuilder str3 = new StringBuilder("We moved from Chicago to Atlanta");
		
		System.out.println("\nthe original string: " + str3);
		
		str3.replace(14, 21, "New York");
		
		System.out.println("\nthe modified string after the substring 'Chicago' has been replaced by the string 'New York': " + str3);
		
		/*
		 * delete(int startingPosition, int endingPosition): 
		 
		 	- delete a substring from a StringBuilder object
		 	- the 2 parameters specify the starting (included) & ending (excluded) positions of the substring
		 	
		 * deleteCharAt(int charPosition): delete a character from a StringBuiler object
		 
		 * setCharAt(int charPosition, char newCh): change a specified character at charPosition to a value passed into newCh
		*/
		StringBuilder str4 = new StringBuilder("I ate 100 blueberries");
		
		System.out.println("\nthe original string: " + str4);
		
		str4.deleteCharAt(8); // delete the character '0' at position 8 in str4
		
		str4.delete(9, 13); // delete the substring 'blue' in str4
		
		str4.setCharAt(6, '5'); // change the character '1' at position 6 in str4 to the new char '5'
		
		System.out.println("\nthe modified string: " + str4);
		
		// the toString method converts a StringBuilder object to a regular string
		StringBuilder strB = new StringBuilder();
		
		if(strB instanceof StringBuilder) {
			System.out.println("\nstr4 is a StringBuilder instance");
		}else {
			System.out.println("\nstr4's data type is something else");
		}
		
		if(strB.toString() instanceof String) {
			System.out.println("\nstr4 has been converted to be a String object");
		}else {
			System.out.println("\nstr4's data type is something else");
		}
	}

}
