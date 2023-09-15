package code_listings.ch_11_exceptions_and_advanced_fileio;

// This program forces the parseInt method of the Integer wrapper class to throw an exception

public class ParseIntError {

	public static void main(String[] args) {
		String str = "abcdefg";
		
		int no;
		
		// version 1:
		try {
			no = Integer.parseInt(str);
		} catch (NumberFormatException e) {
			/*
			 * The numeric wrapper classes� �parse� methods all throw an exception of the NumberFormatException type 
			 * 
			 * if the string being converted does not contain a convertible numeric value
			 * */
			System.out.println("\nconversion error: " + e.getMessage());
		}
		
		// version 2:
		try {
			no = Integer.parseInt(str);
		} catch (Exception e) {
			/*
			 * a reference variable of a superclass type can reference subclass objects -> polymorphism 
			 * 
			 * When handling exceptions, you can use a polymorphic reference as a parameter in the catch clause
			 * 
			 * For example, all of the exceptions that we have dealt with inherit from the Exception class
			 * 
			 * So, a catch clause that uses a parameter variable of the Exception type can catch any exception that inherits from the Exception class
			 * 
			 * Although the Integer class�s parseInt method throws a NumberFormatException object
			 * 
			 * this code still works because the NumberFormatException class inherits from the Exception class
			 * */
			System.out.println("\nconversion error: " + e.getMessage());
		}
	}

}
