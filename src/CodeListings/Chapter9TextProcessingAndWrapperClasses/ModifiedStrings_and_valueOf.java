package CodeListings.Chapter9TextProcessingAndWrapperClasses;

public class ModifiedStrings_and_valueOf {

	public static void main(String[] args) {
		// String concat(String str)
		String firstName = "Nikola", lastName = "Tesla";
		
		System.out.println("\nfull name: " + firstName.concat(" " + lastName));
		
		/* String replace(char oldChar, char newChar)
		 
		 - this method returns a copy of a String object, in which all occurrences of the character passed to oldChar
		 	have been replaced by the character passed to newChar
		 
		 - this method doesn't modify the contents of the original String object but returns a reference to a string that's a modified copy of it
		*/
		
		String str0 = "anna always asks august about ancient australian aboriginals";
		
		System.out.println("\nthe modified copy of str0: " + str0.replace('a', 'e'));
		
		/* trim() returns a copy of a String object with all leading & trailing whitespace characters deleted
		 
		 - a leading whitespace character appears at the beginning or left side of a string. Ex: "   hi"
		 
		 - a trailing whitespace character appears at the end or right side of a string, after the non-space characters. Ex: "hi   "
		*/
		String str1 = "     hello     ";
		
		System.out.println("\n|" + str1 + "|");
		
		System.out.println("\nstr1's modified copy after all the leading & trailing whitespace characters have been removed: |" + str1.trim() + "|");
		
		/* the String class's static valueOf method accepts a value of any primitive data type as its argument & returns a string representation of the value
		 
		 - String valueOf(char[] array) returns a String that contains all the elements in a char array passed into the array parameter
		 
		 - String valueOf(char[] array, int startingIndex, int length) returns a String that contains part of the elements in a char array
		 	
		 	+ startingIndex: the element's index position in the array
		 	
		 	+ length/endingIndex: the number of elements returned by valueOf
		*/
		boolean status = true;
		
		char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
		
		double pi = Math.PI;
		
		int no = 369;
		
		System.out.println("\n" + String.valueOf(status));
		
		System.out.println("\n" + String.valueOf(letters));
		
		System.out.println("\n" + String.valueOf(letters, 0, 3));
		
		System.out.println("\n" + String.valueOf(pi));
		
		System.out.println("\n" + String.valueOf(no));
	}

}
