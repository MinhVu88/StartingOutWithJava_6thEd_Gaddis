package challenges.ch7;

/*
- Write a Payroll class that uses the following arrays as fields:

� employeeId: An array of 7 integers to hold employee identification numbers 

+ The array should be initialized with the following numbers: 5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 7580489

� hours: An array of 7 integers to hold the number of hours worked by each employee

� payRate: An array of 7 doubles to hold each employee�s hourly pay rate

� wages: An array of 7 doubles to hold each employee�s gross wages

- The class should relate the data in each array through the indices 

- For example, the number in element 0 of the hours array should be the number of hours worked by the employee 
	whose identification number is stored in element 0 of the employeeId array 

- That same employee�s pay rate should be stored in element 0 of the payRate array

- In addition to the appropriate accessor & mutator methods, the class should have a method that 
	accepts an employee�s identification number as an argument & returns the gross pay for that employee

- Demonstrate the class in a complete program that displays each employee number & asks the user to enter that employee�s hours & pay rate 

- It should then display each employee�s identification number & gross wages

- Input Validation: Do not accept negative values for hours or numbers less than 6.00 for pay rate
*/

public class Payroll {
	private int[] employeeId, hours;
	
	private double[] payRate, grossWages;
	
	// a no-args constructor
	public Payroll() {}

	/**
	 * @return the employeeId
	 */
	public int[] getEmployeeId() {
		return employeeId;
	}

	/**
	 * @param empID the employeeId to set
	 */
	public void setEmployeeId(int[] empID) {
		this.employeeId = new int[empID.length];
		
		for(int index = 0; index < this.employeeId.length; index++) {
			this.employeeId[index] = empID[index];
		}
	}

	/**
	 * @return the hours
	 */
	public int[] getHours() {
		return hours;
	}

	/**
	 * @param hours the hours to set
	 */
	public void setHours(int[] hours) {
		this.hours = hours;
	}

	/**
	 * @return the payRate
	 */
	public double[] getPayRate() {
		return payRate;
	}

	/**
	 * @param payRate the payRate to set
	 */
	public void setPayRate(double[] payRate) {
		this.payRate = payRate;
	}

	/**
	 * @return the grossWages
	 */
	public double getGrossWages(int empId) {
		double grossPay = 0.0;
		
		for(int index = 0; index < this.employeeId.length; index++) {
			if(empId == this.employeeId[index]) {
				grossWages[index] = payRate[index] * hours[index];
				
				grossPay += grossWages[index];
			}
		}
		
		return grossPay;
	}

	/**
	 * @param grossWages the grossWages to set
	 */
	public void setGrossWages(double[] grossWages) {
		this.grossWages = grossWages;
	}
	
}
