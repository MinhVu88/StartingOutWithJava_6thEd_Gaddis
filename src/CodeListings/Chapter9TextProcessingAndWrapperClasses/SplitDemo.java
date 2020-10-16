package CodeListings.Chapter9TextProcessingAndWrapperClasses;

public class SplitDemo {

	public static void main(String[] args) {
		// the String class's split method tokenizes a string & returns an array of String objects, whose elements are the individual tokens
		System.out.println();
		
		//use a single character as the delimiter
		String str0 = "one, two, three, four, five";
		
		String[] tokens0 = str0.split(","); // the delimiter is the semicolon character
		
		for(String token: tokens0) {
			System.out.print(" " + token);
		}
		
		System.out.println("\n");
		
		// use multi-character delimiters
		String str1 = "six and seven and eight and nine and ten";
		
		String[] tokens1 = str1.split("and"); // the delimiter is a word/string
		
		for(String token : tokens1) {
			System.out.print(" " + token);
		}
		
		System.out.println("\n");
		
		// use the regular expressions as delimiters
		String str2 = "joe@gaddisbooks.com";
		
		String[] tokens2 = str2.split("[@.]"); // the delimiters are the regular expressions @ (the 'at' character) and . (the period)
		
		for(String token : tokens2) {
			System.out.print(" " + token);
		}
		
		System.out.println("\n");
		
		// use trim() to remove leading/trailing whitespace characters in a string entered by user before tokenizing the string
		String str3 = "					eleven;twelve;thirteen;fourteen;fifteen					";
		
		// extract the tokens without removing the leading & trailing whitespace characters
		// those characters will be part of the 1st & last tokens
		String[] tokens3 = str3.split(";");
		
		for(String token : tokens3) {
			System.out.print("|" + token + "|");
		}
		
		System.out.println("\n");
		
		String[] tokens4 = str3.trim().split(";"); // remove the leading & trailing whitespace characters & then split the string
		
		for(String token : tokens4) {
			System.out.print("|" + token + "|");
		}
	}

}
