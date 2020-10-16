package CodeListings.Chapter7ArraysAndTheArrayListClass;
import java.util.Scanner;

// this program gets a set of test scores, store those scores in an array & use the Grader class instance to calculate the average & the lowest score

public class CalcAverage {
	public static void main(String[] args) {
		Scanner kbi = new Scanner(System.in);
		
		System.out.print("\nthe number of test scores: ");
		int numberOfScores = kbi.nextInt();
		
		double[] scores = new double[numberOfScores];
		
		// get the scores & store them in the scores array
		for(int index = 0; index < scores.length; index++) {
			System.out.print("\nscore #" + (index + 1) + ": ");
			
			scores[index] = kbi.nextDouble();
		}
		
		Grader grade = new Grader(scores);
		
		// calculate the average scores
		System.out.println("\n\t=> the adjusted average score: " + grade.getAverage());
		
		// calculate the lowest score
		System.out.println("\n\t=> the lowest score: " + grade.getLowestScore());
		
		kbi.close();
	}
}
