package challenges.ch10;

/*
- The Employee class should keep the following information in fields:

	� Employee name

	� Employee number in the format XXX�L, where each X is a digit within the range 0�9 & the L is a letter within the range A�M

	� Hire date

- Write 1 or more constructors & the appropriate accessor & mutator methods for the class

- Next, write a class named ProductionWorker that extends the Employee class 

- The ProductionWorker class should have fields to hold the following information:

	� Shift (an integer)

	� Hourly pay rate (a double)

- The workday is divided into 2 shifts: day & night 

- The shift field will be an integer value representing the shift that the employee works 

- The day shift is shift 1 & the night shift is shift 2 

- Write 1 or more constructors & the appropriate accessor & mutator methods for the class 

- Demonstrate the classes by writing a program that uses a ProductionWorker object
*/

public class Employee {
	private String name, number, date;
	
	// a no-arg constructor
	public Employee() {}
	
	/**
	 * @param name
	 * @param number
	 * @param date
	 */
	public Employee(String name, String number, String date) {
		this.name = name;
		
		this.number = number;
		
		this.date = date;
	}
	
	// a copy constructor
	public Employee(Employee anotherEmp) {
		this.name = anotherEmp.name;
		
		this.number = anotherEmp.number;
		
		this.date = anotherEmp.date;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the number
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * @param number the number to set
	 */
	public boolean setNumber(String number) {
		this.number = number;
		
		char[] array = this.number.toCharArray();
		
		if(array.length == 5 && Character.isDigit(array[0]) && Character.isDigit(array[1]) && Character.isDigit(array[2]) && array[3] == '-' && 
			(((int) array[4] >= 65 && (int) array[4] <= 77) || ((int) array[4] >= 97 && (int) array[4] <= 109))) {
			return true;
		}
		
		return false;
	}

	/**
	 * @return the date
	 */
	public String getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "\n* Employee name: " + this.name + ", number: " + this.number + ", hire date: " + this.date;
	}
	
	
}
