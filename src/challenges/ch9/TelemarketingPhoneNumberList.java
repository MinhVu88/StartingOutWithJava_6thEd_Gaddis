package challenges.ch9;

/*
- Write a program that has 2 parallel arrays of String objects 

- 1 of the arrays should hold people�s names and the other should hold their phone numbers 

- Here are example contents of both arrays:

name Array Example 			Contents phone Array Example Contents
"Harrison, Rose" 			"555-2234"
"James, Jean" 				"555-9098"
"Smith, William" 			"555-1785"
"Smith, Brad" 				"555-9224"

- The program should ask the user to enter a name or the 1st few characters of a name to search for in the array 

- The program should display all of the names that match the user�s input and their corresponding phone numbers 

- For example, if the user enters �Smith�, the program should display the following names and phone numbers from the list:

Smith, William: 555-1785

Smith, Brad: 555-9224
*/

public class TelemarketingPhoneNumberList {
	private String[] names = {"Harrison, Rose", "James, Jean", "Smith, William", "Smith, Brad"};

	public TelemarketingPhoneNumberList() {}
	
	/**
	 * @param names
	 */
	public TelemarketingPhoneNumberList(String[] names) {
		this.names = names;
	}

	/**
	 * @param subStr
	 */
	public TelemarketingPhoneNumberList(String subStr) {
		for(String name : names) {
			if(name.startsWith(subStr) || name.endsWith(subStr)) {
				System.out.println("\n\t" + name + ": 555-2234");
			}else if(name.startsWith(subStr) || name.endsWith(subStr)) {
				System.out.println("\n\t" + name + ": 555-9098");
			}else if(name.startsWith(subStr) || name.endsWith(subStr)) {
				System.out.println("\n\t" + name + ": 555-1785");
			}else if(name.startsWith(subStr) || name.endsWith(subStr)) {
				System.out.println("\n\t" + name + ": 555-9224");
			} 
		}
	}

	/**
	 * @return the names
	 */
	public String[] getNames() {
		return names;
	}

	/**
	 * @param names the names to set
	 */
	public void setNames(String[] names) {
		this.names = names;
	}
		
}
