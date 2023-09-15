package challenges.ch6;

/*
- Design a Payroll class that has fields for an employee�s name, ID number, hourly pay rate & number of hours worked 

- Write the appropriate accessor & mutator methods & a constructor that accepts the employee�s name & ID number as arguments 

- The class should also have a method that returns the employee�s gross pay, which is calculated as the number of hours worked multiplied by the hourly pay rate 

- Write a program that demonstrates the class by creating a Payroll object, then asking the user to enter the data for an employee 

- The program should display the amount of gross pay earned
*/

public class Payroll {
	private String name;
	private int id, hours;
	private double hourlyPay;
	
	/**
	 * @param name
	 * @param id
	 */
	public Payroll(String name, int id) {
		this.name = name;
		this.id = id;
		this.hours = 0;
		this.hourlyPay = 0.0;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * @param hours the hours to set
	 */
	public void setHours(int hours) {
		this.hours = hours;
	}

	/**
	 * @param hourlyPay the hourlyPay to set
	 */
	public void setHourlyPay(double hourlyPay) {
		this.hourlyPay = hourlyPay;
	}

	public double calculateGrossPay() {
		return hourlyPay * hours;
	}
}
