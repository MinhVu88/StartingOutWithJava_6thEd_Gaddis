package ProgrammingChallenges.Ch10;

import java.util.Scanner;

public class EssayTester {

	public static void main(String[] args) {
		Scanner kbi = new Scanner(System.in);
		
		System.out.print("\nthe number of essays: ");
		
		int essays = kbi.nextInt();
		
		Essay point = new Essay();
		
		point.setPoint(essays, Math.random());
		
		kbi.close();
	}

}
