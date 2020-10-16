package CodeListings.Chapter10Inheritance;

import java.util.Scanner;

public class CurvedActivityDemo {

	public static void main(String[] args) {
		Scanner kbi = new Scanner(System.in);
		
		System.out.print("\nthe raw unadjusted numeric score: ");
		
		double rawScore = kbi.nextDouble();
		
		System.out.print("\nthe curve percentage: ");
		
		double curvePercent = kbi.nextDouble();
		
		CurvedActivity curveExam = new CurvedActivity(curvePercent);
		
		curveExam.setScore(rawScore);
		
		curveExam.display();
		
		kbi.close();
	}

}
