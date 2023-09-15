package challenges.ch11;

import java.util.Random;
import java.util.Scanner;

public class TestScores_Invalid_Tester {

	public static void main(String[] args) {
		Scanner kbi = new Scanner(System.in);
		
		System.out.print("\nthe number of tests: ");
		
		int numberOfTests = kbi.nextInt();
		
		double[] scores = new double[numberOfTests];
		
		for(int i = 0; i < scores.length; i++) {
			scores[i] = new Random().nextInt(201) - 100;
		}
		
		for(int i = 0; i < scores.length; i++) {
			System.out.println("\ntest #" + (i + 1) + ": " + scores[i]);
		}
		
		try {
			TestScores_Invalid tsi = new TestScores_Invalid(scores);
			
		}catch (InvalidTestScore e) {
			System.out.println(e.getMessage());
		}
		
		kbi.close();
	}

}
