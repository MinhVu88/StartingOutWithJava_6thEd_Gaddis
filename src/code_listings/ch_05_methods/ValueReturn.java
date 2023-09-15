package code_listings.ch_05_methods;

public class ValueReturn {
	public static void main(String[] args) {
		int num1 = 23, num2 = 51, total = sum(num1, num2); // the sum() method call is assigned to the total variable
		
		System.out.println(num1 + " + " + num2 + " = " + total);
	}
	
	
	/** 
	 * The sum method returns the sum of its 2 parameters
	 * @param n1 the 1st number to be added
	 * @param n2 the 2nd number to be added
	 * @return the sum of n1 and n2
	 */
	
	public static int sum(int n1, int n2) {
		int result = n1 + n2;
		return result; // sum() is a value-returning method & it returns an int value back to where it's called/invoked
	}
}
