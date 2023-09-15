package code_listings.ch_10_inheritance;

public class CurvedActivity extends GradedActivity {
	private double unadjustedScore, curvePercentage;

	/**
	 * @return the rawScore
	 */
	public double getRawScore() {
		return unadjustedScore;
	}

	/**
	 * @param rawScore the rawScore to set
	 */
	public void setRawScore(double rawScore) {
		this.unadjustedScore = rawScore;
	}

	/**
	 * @return the percentage
	 */
	public double getPercentage() {
		return curvePercentage;
	}

	/**
	 * @param percentage the percentage to set
	 */
	public void setPercentage(double percentage) {
		this.curvePercentage = percentage;
	}

	/**
	 * @param percentage
	 */
	public CurvedActivity(double percentage) {
		this.curvePercentage = percentage;
		
		this.unadjustedScore = 0.0;
	}
	
	/**
	 * the setScore method here overrides the superclass's setScore method
	 * 
	 * it takes an unadjusted score as an argument which is multiplied by the curve percentage
	 * 
	 * the result of the multiplication is passed as an argument to the superclass's setScore method using the super keyword
	 * 
	 * the super keyword must be used as the superclass's score field is private & the subclass can't access it directly
	 * 
	 * @param numericScore the raw unadjusted score provided by user
	 */
	@ Override
	public void setScore(double numericScore) {
		this.unadjustedScore = numericScore;
		
		super.setScore(this.unadjustedScore * this.curvePercentage);
	}
	
	public void display() {
		System.out.println("\nthe raw unadjusted numeric score: " + this.unadjustedScore);
		
		System.out.println("\nthe curve score :" + this.getScore());
		
		System.out.println("\nthe letter grade: " + this.getGrades());
	}
}
