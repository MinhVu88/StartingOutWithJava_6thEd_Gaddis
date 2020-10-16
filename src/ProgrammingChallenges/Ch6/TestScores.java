package ProgrammingChallenges.Ch6;

/*
- Design a TestScores class that has fields to hold 3 test scores 

- The class should have a constructor, accessor and mutator methods for the test score fields and a method that returns the average of the test scores 

- Demonstrate the class by writing a separate program that creates an instance of the class 

- The program should ask the user to enter 3 test scores, which are stored in the TestScores object 

- Then the program should display the average of the scores, as reported by the TestScores object
*/

public class TestScores {
	private double score1, score2, score3;

	/**
	 * 
	 */
	public TestScores() {
		this.score1 = 0.0;
		this.score2 = 0.0;
		this.score3 = 0.0;
	}

	/**
	 * @param score1 the score1 to set
	 */
	public void setScore1(double score1) {
		this.score1 = score1;
	}

	/**
	 * @param score2 the score2 to set
	 */
	public void setScore2(double score2) {
		this.score2 = score2;
	}

	/**
	 * @param score3 the score3 to set
	 */
	public void setScore3(double score3) {
		this.score3 = score3;
	}

	public double average() {
		return Math.round((score1 + score2 + score3) / 3);
	}
}
