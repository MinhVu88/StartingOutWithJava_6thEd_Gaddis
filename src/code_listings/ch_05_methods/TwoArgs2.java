package code_listings.ch_05_methods;

public class TwoArgs2 {
	public static void main(String[] args) {
		int num1 = 47, num2 = 51;
		
		showSum(num1, num2);
	}
	
/**
 * The showSum method displays the sum of 2 numbers
 * @param no1: the 1st number
 * @param no2: the 2nd number
 */
	public static void showSum(double no1, double no2) {
		double sum = no1 + no2;
		System.out.println("\nsum: " + sum);
	}
}
