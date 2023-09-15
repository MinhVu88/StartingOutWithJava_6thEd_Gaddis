package code_listings.ch_10_inheritance;

public class PassFailActivity extends GradedActivity {
	private double minPassingScore; // the minimum score to pass the exam

	/**
	 * @return the minPassingScore
	 */
	public double getMinPassingScore() {
		return minPassingScore;
	}

	/**
	 * @param minPassingScore the minPassingScore to set
	 */
	public void setMinPassingScore(double minPassingScore) {
		this.minPassingScore = minPassingScore;
	}
	
	// a no-arg constructor
	public PassFailActivity() {}

	/**
	 * @param minPassingScore
	 */
	public PassFailActivity(double minPassingScore) {
		this.minPassingScore = minPassingScore;
	}
	
	/**
	 * The method overrides GradedActivity.java's method of the same name. 
	 * 
	 * It returns a grade of 'P' if the numeric score is greater-than or equal-to minPassingScore. 
	 * 
	 * Otherwise, the method returns a grade of 'F'
	 */
	@Override
	public char getGrades() {
		if(super.getScore() >= this.minPassingScore) {
			return 'P'; // pass
		}
		
		return 'F'; // fail
	}
}
