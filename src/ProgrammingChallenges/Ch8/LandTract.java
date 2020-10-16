package ProgrammingChallenges.Ch8;

/*
- Make a LandTract class that has 2 fields: one for the tract’s length and one for the width

- The class should have a method that returns the tract’s area, as well as an equals method & a toString method 

- Demonstrate the class in a program that asks the user to enter the dimensions for 2 tracts of land 

- The program should display the area of each tract of land & indicate whether the tracts are of equal size
*/

public class LandTract {
	private double length, width;

	public LandTract() {}

	/**
	 * @param length
	 * @param width
	 */
	public LandTract(double length, double width) {
		this.length = length;
		this.width = width;
	}

	/**
	 * @return the length
	 */
	public double getLength() {
		return length;
	}

	/**
	 * @param length the length to set
	 */
	public void setLength(double length) {
		this.length = length;
	}

	/**
	 * @return the width
	 */
	public double getWidth() {
		return width;
	}

	/**
	 * @param width the width to set
	 */
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getArea() {
		return this.width * this.length;
	}
	
	public boolean equals(LandTract anotherLandTractInstance) {
		if(this.getArea() == anotherLandTractInstance.getArea()) {
			return true;
		}
		
		return false;
	}

	@Override
	public String toString() {
		return "\n\t-> Area: " + getArea();
	}
	
	
}
