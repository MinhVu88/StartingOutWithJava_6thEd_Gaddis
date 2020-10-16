package CodeListings.Chapter9TextProcessingAndWrapperClasses;

public class indexOf_and_lastIndexOf {

	public static void main(String[] args) {
		// find a character' positions in a string with indexOf & lastIndexOf
		String str = "there's no any explicitly appropriate reason why mankind can't be as cruel as nature";
		
		System.out.println("\nthe character 'r' 1st appears at position " + str.indexOf('r') + " & last appears at position " + str.lastIndexOf('r'));
		
		// find the number of occurrences of a specific character in a string in ascending order
		int position0 = str.indexOf('r');
		
		System.out.print("\nthe positions at which the character 'r' appears in the string in ascending order: ");
		
		while(position0 != -1) {
			System.out.print(" " + position0);
			
			/* int indexOf(Char ch, int firstOccurrence)
			 
			 -> ch: the character to be searched thru out a string
			 
			 -> firstOccurrence: the search begins at the position specified in this argument & reaches the end of the string, 
								 if ch is found, the position of its 1st occurrence is returned
			 */ 
			position0 = str.indexOf('r', position0 + 1);
		}
		
		// find the number of occurrences of a specific character in a string in descending order
		int position1 = str.lastIndexOf('r');
		
		System.out.print("\n\nthe positions at which the character 'r' appears in the string in descending order: ");
		
		while(position1 != -1) {
			System.out.print(" " + position1);
			
			/* int lastIndexOf(Char ch, int lastOccurrence)
			 
			 -> ch: the character to be searched thru out a string
			 
			 -> lastOccurrence: the search begins at the position specified in this argument & reaches the beginning of the string,
								 if ch is found, the position of its last occurrence is returned
			*/
			position1 = str.lastIndexOf('r', position1 - 1);
		}
		
		// find positions of substrings in a string with indexOf & lastIndexOf
		int position2 = str.indexOf("as");
		
		System.out.print("\n\nthe string 'as' appears at the following positions in ascending order: ");
		
		while(position2 != -1) {
			System.out.print(" " + position2);
			
			/* int indexOf(String subStr, int firstOccurrence)
			 
			 -> subStr: the substring to be searched thru out a string
			 
			 -> firstOccurrence: the search begins at the position specified in this argument & reaches the end of the string, 
								 if subStr is found, the position of its 1st occurrence is returned
			 */ 
			position2 = str.indexOf("as", position2 + 1); 
		}
		
		int position3 = str.lastIndexOf("as");
		
		System.out.print("\n\nthe string 'as' appears at the following positions in descending order: ");
		
		while(position3 != -1) {
			System.out.print(" " + position3);
			
			/* int indexOf(String subStr, int lastOccurrence)
			 
			 -> subStr: the substring to be searched thru out a string
			 
			 -> lastOccurrence: the search begins at the position specified in this argument & reaches the beginning of the string, 
								 if subStr is found, the position of its last occurrence is returned
			 */ 
			position3 = str.lastIndexOf("as", position3 - 1); 
		}
	}

}
