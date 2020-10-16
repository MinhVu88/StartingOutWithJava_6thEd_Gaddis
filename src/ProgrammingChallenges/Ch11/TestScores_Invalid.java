package ProgrammingChallenges.Ch11;

/*
- Write a class named TestScores 

- The class constructor should accept an array of test scores as its argument 

- The class should have a method that returns the average of the test scores

- If any test score in the array is negative or greater than 100, the class should throw an IllegalArgumentException 

- Demonstrate the class in a program
*/

public class TestScores_Invalid {
	private double[] scores;
	
	public TestScores_Invalid() {}
	
	/**
	 * @param scores
	 */
	public TestScores_Invalid(double[] scores) throws InvalidTestScore {
		this.scores = new double[scores.length];
		
		try {
			for(int i = 0; i < scores.length; i++) {
				if(scores[i] < 0 || scores[i] > 100) {
					throw new InvalidTestScore();
				}
			}
		
		}catch (InvalidTestScore e) {
			for(int i = 0; i < scores.length; i++) {
				if(scores[i] < 0 || scores[i] > 100) {
					System.out.println(e.getMessage() + (i + 1));
				}
			}
		
		}finally {
			double total = 0.0;
			
			for(int i = 0; i < scores.length; i++) {
				this.scores[i] = scores[i];
				
				total += this.scores[i];
			}
			
			System.out.println("\n-> the average score: " + (total / this.scores.length));
		}
	}
	
	/**
	 * @return the scores
	 */
	public double[] getScores() {
		return scores;
	}

	/**
	 * @param scores the scores to set
	 */
	public void setScores(double[] scores) {
		this.scores = scores;
	}
	
}
