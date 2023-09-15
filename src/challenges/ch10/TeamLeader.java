package challenges.ch10;

/*
- In a particular factory, a team leader is an hourly paid production worker that leads a small team 

- In addition to hourly pay, team leaders earn a fixed monthly bonus 

- Team leaders are required to attend a minimum number of hours of training per year 

- Design a TeamLeader class that extends the ProductionWorker class

- The TeamLeader class should have fields for the monthly bonus amount, the required number of training hours and 
	the number of training hours that the team leader has attended

- Write 1 or more constructors and the appropriate accessor and mutator methods for the class 

- Demonstrate the class by writing a program that uses a TeamLeader object
*/

public class TeamLeader extends ProductionWorker {
	private double fixedMonthlyBonus;
	
	private int requiredYearlyTrainingHours, trainingHoursAttended;
	
	// a no-arg constructor
	public TeamLeader() {}

	/**
	 * @param name
	 * @param number
	 * @param date
	 * @param shift
	 * @param hourlyPayRate
	 */
	public TeamLeader(String name, String number, String date, int shift, double hourlyPayRate,
					 	double fixedMonthlyBonus, int requiredYearlyTrainingHours, int trainingHoursAttended) {
		super(name, number, date, shift, hourlyPayRate);
		
		this.fixedMonthlyBonus = fixedMonthlyBonus;
		
		this.requiredYearlyTrainingHours = requiredYearlyTrainingHours;
		
		this.trainingHoursAttended = trainingHoursAttended;
	}
	
	// a copy constructor
	public TeamLeader(TeamLeader anotherLeader) {
		super(anotherLeader.getName(), anotherLeader.getNumber(), anotherLeader.getDate(), anotherLeader.getShift(), anotherLeader.getHourlyPayRate());
		
		this.fixedMonthlyBonus = anotherLeader.fixedMonthlyBonus;
		
		this.requiredYearlyTrainingHours = anotherLeader.requiredYearlyTrainingHours;
		
		this.trainingHoursAttended = anotherLeader.trainingHoursAttended;
	}
	
	/**
	 * @return the fixedMonthlyBonus
	 */
	public double getFixedMonthlyBonus() {
		return fixedMonthlyBonus;
	}

	/**
	 * @param fixedMonthlyBonus the fixedMonthlyBonus to set
	 */
	public void setFixedMonthlyBonus(double fixedMonthlyBonus) {
		this.fixedMonthlyBonus = fixedMonthlyBonus;
	}

	/**
	 * @return the requiredYearlyTrainingHours
	 */
	public int getRequiredYearlyTrainingHours() {
		return requiredYearlyTrainingHours;
	}

	/**
	 * @param requiredYearlyTrainingHours the requiredYearlyTrainingHours to set
	 */
	public void setRequiredYearlyTrainingHours(int requiredYearlyTrainingHours) {
		this.requiredYearlyTrainingHours = requiredYearlyTrainingHours;
	}

	/**
	 * @return the trainingHoursAttended
	 */
	public int getTrainingHoursAttended() {
		return trainingHoursAttended;
	}

	/**
	 * @param trainingHoursAttended the trainingHoursAttended to set
	 */
	public void setTrainingHoursAttended(int trainingHoursAttended) {
		this.trainingHoursAttended = trainingHoursAttended;
	}

	@Override
	public String toString() {
		String str = super.toString();
		
		return str + " -> the fixed monthly bonus: $" + fixedMonthlyBonus + ", the required yearly training hours: "
				+ requiredYearlyTrainingHours + " & the training hours attended: " + trainingHoursAttended;
	}
	
	
}
