package ProgrammingChallenges.Ch8;

/*
- Write a class named Month 

- The class should have an int field named monthNumber that holds the number of the month 

- For example, January would be 1, February would be 2 and so forth 

- In addition, provide the following methods:

• A no-arg constructor that sets the monthNumber field to 1

• A constructor that accepts the number of the month as an argument 

	+ It should set the monthNumber field to the value passed as the argument 

	+ If a value less than 1 or greater than 12 is passed, the constructor should set monthNumber to 1

• A constructor that accepts the name of the month, such as “January” or “February” as an argument 

	+ It should set the monthNumber field to the correct corresponding value

• A setMonthNumber method that accepts an int argument, which is assigned to the monthNumber field 

	+ If a value less than 1 or greater than 12 is passed, the method should set monthNumber to 1

• A getMonthNumber method that returns the value in the monthNumber field

• A getMonthName method that returns the name of the month 

	+ For example, if the monthNumber field contains 1, then this method should return “January”

• A toString method that returns the same value as the getMonthName method

• An equals method that accepts a Month object as an argument 

	+ If the argument object holds the same data as the calling object, this method should return true 
	
	+ Otherwise, it should return false

• A greaterThan method that accepts a Month object as an argument 

	+ If the calling object’s monthNumber field is greater than the argument’s monthNumber field, this method should return true 

	+ Otherwise, it should return false

• A lessThan method that accepts a Month object as an argument 

	+ If the calling object’s monthNumber field is less than the argument’s monthNumber field, this method should return true 

	+ Otherwise, it should return false
*/

public class Month {
	private int monthNumber;

	/**
	 * @return the monthNumber
	 */
	public int getMonthNumber() {return monthNumber;}

	/**
	 * @param monthNumber the monthNumber to set
	 */
	public void setMonthNumber(int monthNumber) {
		if(monthNumber < 1 || monthNumber > 12) {
			monthNumber = 1;
		}
		
		this.monthNumber = monthNumber;
	}

	public Month() {this.monthNumber = 1;}

	/**
	 * @param monthNumber
	 */
	public Month(int monthNumber) {
		if(monthNumber < 1 || monthNumber > 12) {
			monthNumber = 1;
		}
		
		this.monthNumber = monthNumber;
	}

	public Month(String monthName) {
		switch (monthName) {
			case "January":
				monthNumber = 1;
				break;
			case "February":
				monthNumber = 2;
				break;
			case "March":
				monthNumber = 3;
				break;
			case "April":
				monthNumber = 4;
				break;
			case "May":
				monthNumber = 5;
				break;
			case "June":
				monthNumber = 6;
				break;
			case "July":
				monthNumber = 7;
				break;
			case "August":
				monthNumber = 8;
				break;
			case "September":
				monthNumber = 9;
				break;
			case "October":
				monthNumber = 10;
				break;
			case "November":
				monthNumber = 11;
			case "December":
				monthNumber = 12;
				break;
			default:
				monthNumber = -1;
				break;
		}
	}
	
	public String getMonthName() {
		String month = "";
		
		if(this.monthNumber == 1) {
			month = "January";
		}else if(this.monthNumber == 2) {
			month = "February";
		}else if(this.monthNumber == 3) {
			month = "March";
		}else if(this.monthNumber == 4) {
			month = "April";
		}else if(this.monthNumber == 5) {
			month = "May";
		}else if(this.monthNumber == 6) {
			month = "June";
		}else if(this.monthNumber == 7) {
			month = "July";
		}else if(this.monthNumber == 8) {
			month = "August";
		}else if(this.monthNumber == 9) {
			month = "September";
		}else if(this.monthNumber == 10) {
			month = "October";
		}else if(this.monthNumber == 11) {
			month = "November";
		}else if(this.monthNumber == 12) {
			month = "December";
		}
		
		return month;
	}
	
	public String toString() {
		String month = "";
		
		if(this.monthNumber == 1) {
			month = "January";
		}else if(this.monthNumber == 2) {
			month = "February";
		}else if(this.monthNumber == 3) {
			month = "March";
		}else if(this.monthNumber == 4) {
			month = "April";
		}else if(this.monthNumber == 5) {
			month = "May";
		}else if(this.monthNumber == 6) {
			month = "June";
		}else if(this.monthNumber == 7) {
			month = "July";
		}else if(this.monthNumber == 8) {
			month = "August";
		}else if(this.monthNumber == 9) {
			month = "September";
		}else if(this.monthNumber == 10) {
			month = "October";
		}else if(this.monthNumber == 11) {
			month = "November";
		}else if(this.monthNumber == 12) {
			month = "December";
		}
		
		return month;
	}
	
	public boolean equals(Month anotherMonthObject) {
		if(this.monthNumber == anotherMonthObject.monthNumber) {
			return true;
		}
		
		return false;
	}
	
	public boolean greaterThan(Month anotherMonthObject) {
		if(this.monthNumber > anotherMonthObject.monthNumber) {
			return true;
		}
		
		return false;
	}
	
	public boolean lessThan(Month anotherMonthObject) {
		if(this.monthNumber < anotherMonthObject.monthNumber) {
			return true;
		}
		
		return false;
	}
}
