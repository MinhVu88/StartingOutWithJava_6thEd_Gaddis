package challenges.ch10;

import code_listings.ch_10_inheritance.GradedActivity;

/*
- Design Essay.java that extends GradedActivity.java in the packages CodeListings & Chapter10Inheritance 

- This class should determine the grade a student receives for an essay 

- The student�s essay score can be up to 100 & is determined in the following manner:

	Grammar: 30 points
	Spelling: 20 points
	Correct length: 20 points
	Content: 30 points

- Demonstrate the class in a simple program
*/

public class Essay extends GradedActivity {
	private double point;
	
	// a no-arg constructor
	public Essay() {}	

	/**
	 * @param point
	 */
	public Essay(double point) {
		this.point = point;
	}
	

	/**
	 * @return the point
	 */
	public double getPoint() {
		return point;
	}

	/**
	 * @param point the point to set
	 */
	public void setPoint(int essays, double point) {
		final int GRAMMAR = 31, SPELLING = 21, VALID_LENGTH = 21, CONTENT = 31;
		
		for(int i = 1; i <= essays; i++) {
			point = ( (Math.round(Math.random() * GRAMMAR)) + (Math.round(Math.random() * SPELLING)) + 
					(Math.round(Math.random() * VALID_LENGTH)) + (Math.round(Math.random() * CONTENT)) );
			
			this.point = point;
			
			System.out.println("\n\tessay #" + i + ": " + this.point);
			
			super.setScore(this.point);
			
			System.out.println("\n\t\t-> the letter grade of essay #" + i + ": " + super.getGrades());
		}
	}
	
}
