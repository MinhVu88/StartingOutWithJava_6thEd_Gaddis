package code_listings.ch_03_decision_structures;

// This program displays a variety of floating-point numbers with leading zeros in a field of 9 spaces, rounded to 2 decimal places

public class LeadingZeros {
	public static void main(String[] args) {
		double no1 = 1.234, no2 = 12.345, no3 = 123.456;
		
		System.out.println("\nbefore formatting:\n");
		System.out.println("\tno1: " + no1);
		System.out.println("\tno2: " + no2);
		System.out.println("\tno3: " + no3);
		
		System.out.println("\nafter formatting (flag: 0 - field width: 9 - precision: 2):\n");
		System.out.printf("\tno1:\t%09.2f\n",no1);
		System.out.printf("\tno2:\t%09.2f\n",no2);
		System.out.printf("\tno3:\t%09.2f\n",no3);
	}
}
