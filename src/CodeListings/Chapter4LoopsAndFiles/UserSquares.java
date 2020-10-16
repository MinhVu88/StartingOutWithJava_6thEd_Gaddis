package CodeListings.Chapter4LoopsAndFiles;
import java.util.Scanner;

public class UserSquares {
	public static void main(String[] args) {
		int maxValue;
		Scanner kb = new Scanner(System.in);
		
		System.out.println("A table of numbers & their squares is displayed");
		System.out.print("\nwhat's your max value? ");
		maxValue = kb.nextInt();
		
		System.out.println("\nNumbers             Numbers squared");
		System.out.println("--------------------------------");
		
		for(int no = 1; no <= maxValue; no++) {
			System.out.println(no + "                          " + no * no);
		}
		
		kb.close();
	}
}
