package CodeListings.Chapter10Inheritance;

public class CompSciStudent extends Student {
	private final int MATH_HOURS = 20, COMPSCI_HOURS = 40, GENERAL_EDU_HOURS = 60; // the required hours for all students
	
	private int mathHours, compsciHours, generalEduHours; // the hours taken by students
	
	/**
	 * @return the mathHours
	 */
	public int getMathHours() {
		return mathHours;
	}

	/**
	 * @param mathHours the mathHours to set
	 */
	public void setMathHours(int mathHours) {
		this.mathHours = mathHours;
	}

	/**
	 * @return the compsciHours
	 */
	public int getCompsciHours() {
		return compsciHours;
	}

	/**
	 * @param compsciHours the compsciHours to set
	 */
	public void setCompsciHours(int compsciHours) {
		this.compsciHours = compsciHours;
	}

	/**
	 * @return the generalEduHours
	 */
	public int getGeneralEduHours() {
		return generalEduHours;
	}

	/**
	 * @param generalEduHours the generalEduHours to set
	 */
	public void setGeneralEduHours(int generalEduHours) {
		this.generalEduHours = generalEduHours;
	}

	public CompSciStudent(String name, String id, int yearAdmitted) {
		super(name, id, yearAdmitted);
		
	}

	@Override
	public int getRemainingHours() {
		// Calculate the remaining hours
		return (MATH_HOURS + COMPSCI_HOURS + GENERAL_EDU_HOURS) - (this.mathHours + this.compsciHours + this.generalEduHours);
	}

	@Override
	public String toString() {
		return super.toString() + "\n\nMajor: computer science" + 
				"\n\n\t* math hours taken: " + this.mathHours + 
				"\n\n\t* computer science hours taken: " + this.compsciHours + 
				"\n\n\t* general education hours taken: " + this.generalEduHours;
	}
	
	
	
}
