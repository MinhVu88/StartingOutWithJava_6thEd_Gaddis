package CodeListings.Chapter3DecisionStructures;

// This program displays a variety of floating-point numbers in a column with their decimal points aligned

public class Columns {
	public static void main(String[] args) {
		double no1 = 127.899, no2 = 3465.148, no3 = 3.776, no4 = 264.821, no5 = 88.081, no6 = 1799.999;
		
		System.out.println("\nbefore the formatting:\n");
		System.out.println("\tno1 is " + no1);
		System.out.println("\tno2 is " + no2);
		System.out.println("\tno3 is " + no3);
		System.out.println("\tno4 is " + no4);
		System.out.println("\tno5 is " + no5);
		System.out.println("\tno6 is " + no6);
		
		System.out.println("\nafter the formatting (min field width: 8 spaces - precision: 2 decimal places):\n");
		System.out.printf("\tno1 is%8.2f\n", no1);
		System.out.printf("\tno2 is%8.2f\n", no2);
		System.out.printf("\tno3 is%8.2f\n", no3);
		System.out.printf("\tno4 is%8.2f\n", no4);
		System.out.printf("\tno5 is%8.2f\n", no5);
		System.out.printf("\tno6 is%8.2f\n", no6);
	}
}
