package ProgrammingChallenges.Ch10;

/*
- In a particular factory, a shift supervisor is a salaried employee who supervises a shift 

- In addition to a salary, the shift supervisor earns a yearly bonus when his or her shift meets production goals 

- Design a ShiftSupervisor class that extends the Employee class 

- The ShiftSupervisor class should have a field that holds the annual salary and 
	a field that holds the annual production bonus that a shift supervisor has earned 

- Write 1 or more constructors and the appropriate accessor and mutator methods for the class 

- Demonstrate the class by writing a program that uses a ShiftSupervisor object
*/

public class ShiftSupervisor extends Employee {
	private double annualSalary, yearlyBonus;
	
	// a no-arg constructor
	public ShiftSupervisor() {}

	/**
	 * @param name
	 * @param number
	 * @param date
	 */
	public ShiftSupervisor(String name, String number, String date, double annualSalary, double yearlyBonus) {
		super(name, number, date);
		
		this.annualSalary = annualSalary;
		
		this.yearlyBonus = yearlyBonus;
	}
	
	// a copy constructor
	public ShiftSupervisor(ShiftSupervisor anotherSupervisor) {
		super(anotherSupervisor.getName(), anotherSupervisor.getNumber(), anotherSupervisor.getDate());
		
		this.annualSalary = anotherSupervisor.annualSalary;
		
		this.yearlyBonus = anotherSupervisor.yearlyBonus;
	}

	/**
	 * @return the annualSalary
	 */
	public double getAnnualSalary() {
		return annualSalary;
	}

	/**
	 * @param annualSalary the annualSalary to set
	 */
	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}

	/**
	 * @return the yearlyBonus
	 */
	public double getYearlyBonus() {
		return yearlyBonus;
	}

	/**
	 * @param yearlyBonus the yearlyBonus to set
	 */
	public void setYearlyBonus(double yearlyBonus) {
		this.yearlyBonus = yearlyBonus;
	}

	@Override
	public String toString() {
		String str = super.toString();
		
		return str + " -> the annual salary: $" + annualSalary + " & the yearly bonus: $" + yearlyBonus;
	}
	
	
}
