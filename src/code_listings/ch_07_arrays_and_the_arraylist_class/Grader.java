package code_listings.ch_07_arrays_and_the_arraylist_class;

/*
# Creating an Object That Processes an Array:

- Dr. LaClaire gives a set of exams during the semester in her chemistry class 

- At the end of the semester, she drops each student�s lowest test score before averaging the scores 

- She has asked you to write a program that will read a student�s test scores as input and calculate the average with the lowest score dropped

- The following pseudocode shows the steps for calculating the average of a set of test scores, with the lowest score dropped:

	+ Calculate the total of the scores
	
	+ Find the lowest score
	
	+ Subtract the lowest score from the total => This gives the adjusted total
	
	+ Divide the adjusted total by (number of scores - 1) => This is the average

- You decide to create a class named Grader, with a constructor that accepts a double array of test scores 

- The Grader class will have a method named getLowestScore that returns the lowest score in the array and 
	a method named getAverage that returns the average of the test scores with the lowest score dropped
*/

public class Grader {
	private double[] testScores;

	/**
	 * @param scoreArray
	 */
	public Grader(double[] scoreArray) {
		this.testScores = scoreArray;
	}
	
	public double getLowestScore() {
		double lowest = testScores[0];
		
		for(int index = 1; index < testScores.length; index++) {
			if(testScores[index] < lowest) {
				lowest = testScores[index];
			}
		}
		
		return lowest;
	}
	
	public double getAverage() {
		double total = 0, average, lowest;
		
		// if the testScores array contains less than 2 elements, display an error message & set average to 0
		if(testScores.length < 2) {
			System.out.println("\nERROR! The array must contain more than 2 scores in order to compute the average");
			
			average = 0;
		}else {
			// calculate the total scores by using the enhanced for loop, which adds all the elements in testScores to total 
			for(double score: testScores) {
				total += score;
			}
			
			// subtract the lowest score from the total to get the adjusted total => testScores.length - 1
			lowest = getLowestScore();
			
			total -= lowest;
			
			// calculate the average based on the adjusted total
			average = total / (testScores.length - 1);
		}
		
		return average;
	}
}
