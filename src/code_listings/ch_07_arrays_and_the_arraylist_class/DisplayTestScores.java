package code_listings.ch_07_arrays_and_the_arraylist_class;
import java.util.Scanner;

public class DisplayTestScores {
	public static void main(String[] args) {
		Scanner kbi = new Scanner(System.in);
		
		int numberOfTests;
		
		System.out.print("\nthe number of tests: ");
		numberOfTests = kbi.nextInt();
		
		int[] scores = new int[numberOfTests];
		
		for(int index = 0; index < scores.length; index++) {
			System.out.print("\n\ttest score #" + (index + 1) + ": ");
			scores[index] = kbi.nextInt();
		}
		
		System.out.println("\nthe scores: ");
		
		for(int index = 0; index < scores.length; index++) {
			System.out.println("\n\t-> " + scores[index]);
		}
		
		kbi.close();
	}
}
