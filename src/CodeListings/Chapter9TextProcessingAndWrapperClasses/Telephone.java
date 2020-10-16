package CodeListings.Chapter9TextProcessingAndWrapperClasses;

/*
Telephone numbers in the United States are commonly formatted to appear in the following manner:		(XXX)XXX-XXXX

In the format, X represents a digit 

The 3 digits that appear inside the parentheses are the area code 

The 3 digits following the area code are the prefix & the 4 digits after the hyphen are the line number 

Here is an example:		(919)555-1212

Although the parentheses & the hyphen make the number easier for people to read, those characters are unnecessary for processing by a computer 

In a computer system, a telephone number is commonly stored as an unformatted series of digits, as shown here:	9195551212

A program that works with telephone numbers usually needs to unformat numbers that have been entered by the user 

This means that the parentheses & the hyphen must be removed before the number is stored in a file or processed in some other way

In addition, such a program needs the ability to format the digits so that the number contains the parentheses & the hyphen when it appears on the screen or is printed on paper


the following static methods:

• isFormatted: This method accepts a String argument & returns true if the argument is formatted as (XXX)XXX-XXXX 

	If the argument is not formatted this way, the method returns false

• unformat: This method accepts a String argument 

	If the argument is formatted as (XXX)XXX-XXXX, the method returns an unformatted version of the argument with the parentheses & the hyphen removed 

	Otherwise, the method returns the original argument

• format: This method’s purpose is to format a sequence of digits as (XXX)XXX-XXXX

	The sequence of digits is passed as a String argument 

	If the argument is 10 characters in length, then the method returns the argument with parentheses & a hyphen inserted 

	Otherwise, the method returns the original argument
*/

public class Telephone {
	private final static int FORMATTED_LENGTH = 13;
	
	private final static int UNFORMATTED_LENGTH = 10;
	
	public static boolean isFormatted(String str) {
		if(str.length() == FORMATTED_LENGTH && str.charAt(0) == '(' && str.charAt(4) == ')' && str.charAt(8) == '-') {
			return true;
		}
		
		return false;
	}
	
	public static String unformat(String str) {
		StringBuilder strB = new StringBuilder(str);
		
		if(isFormatted(str)) {
			strB.deleteCharAt(0); // delete '('
			
			strB.deleteCharAt(3); // delete ')', whose index is 3 because of the previous deletion
			
			strB.deleteCharAt(6); // delete '-', whose index is 6 because of the previous deletions
		}
		
		return strB.toString();
	}
	
	public static String format(String str) {
		StringBuilder strB = new StringBuilder(str);
		
		if(str.length() == UNFORMATTED_LENGTH) {
			strB.insert(0, '(');
			
			strB.insert(4, ')');
			
			strB.insert(8, '-');
		}
		
		return strB.toString();
	}
}
