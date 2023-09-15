package code_listings.ch_10_inheritance;

public class PassFailExam extends PassFailActivity {
	private int numberOfQuestions, questionsMissed;
	
	private double pointsPerQuestion;

	/**
	 * @return the numberOfQuestions
	 */
	public int getNumberOfQuestions() {
		return numberOfQuestions;
	}

	/**
	 * @param numberOfQuestions the numberOfQuestions to set
	 */
	public void setNumberOfQuestions(int numberOfQuestions) {
		this.numberOfQuestions = numberOfQuestions;
	}

	/**
	 * @return the questionsMissed
	 */
	public int getQuestionsMissed() {
		return questionsMissed;
	}

	/**
	 * @param questionsMissed the questionsMissed to set
	 */
	public void setQuestionsMissed(int questionsMissed) {
		this.questionsMissed = questionsMissed;
	}

	/**
	 * @return the pointsPerQuestion
	 */
	public double getPointsPerQuestion() {
		return pointsPerQuestion;
	}

	/**
	 * @param pointsPerQuestion the pointsPerQuestion to set
	 */
	public void setPointsPerQuestion(double pointsPerQuestion) {
		this.pointsPerQuestion = pointsPerQuestion;
	}
	
	// a no-arg constructor
	public PassFailExam() {}

	/**
	 * @param numberOfQuestions
	 * @param questionsMissed
	 * @param minPassingScore
	 */
	public PassFailExam(int numberOfQuestions, int questionsMissed, double minPassingScore) {
		super(minPassingScore); // call PassFailActivity.java's constructor
		
		this.numberOfQuestions = numberOfQuestions;
		
		this.questionsMissed = questionsMissed;
		
		this.pointsPerQuestion = 100.0 / this.numberOfQuestions;
		
		double numericScore = 100.0 - (this.questionsMissed * this.pointsPerQuestion);
		
		setScore(numericScore); // call GradedActivity.java's setScore()
	}
	
	public void display() {
		System.out.println("\n-> points per question: " + this.pointsPerQuestion);
		
		System.out.println("\n-> the score: " + this.getScore());
		
		System.out.println("\n-> the grade: " + this.getGrades());
	}
}
