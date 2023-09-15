package challenges.ch6;

/*
- Write a class named Employee that has the following fields:

� name: The name field references a String object that holds the employee�s name

� idNumber: The idNumber is an int variable that holds the employee�s ID number

� department: The department field references a String object that holds the name of the department where the employee works

� position: The position field references a String object that holds the employee�s job title

- The class should have the following constructors:

� A constructor that accepts the following values as arguments & assigns them to the appropriate fields: employee�s name, employee�s ID number, department & position

� A constructor that accepts the following values as arguments & assigns them to the appropriate fields: employee�s name and ID number. The department & position
fields should be assigned an empty string ("")

� A no-arg constructor that assigns empty strings ("") to the name, department & position fields & 0 to the idNumber field

- Write appropriate mutator methods that store values in these fields & accessor methods that return the values in these fields 

- Once you have written the class, write a separate program that creates 3 Employee objects to hold the following data:

Name 				ID Number 		Department 			Position
-----------------------------------------------------------------------
Susan Meyers 		47899 			Accounting 			Vice President
Mark Jones 			39119 			IT 					Programmer
Joy Rogers 			81774 			Manufacturing 		Engineer

- The program should store this data in the 3 objects & then display the data for each employee on the screen
*/

public class Employee {
	private String name, department, job;
	private int id;
	
	/**
	 * @param name
	 * @param department
	 * @param job
	 * @param id
	 */
	public Employee(String name, int id, String department, String job) {
		this.name = name;
		this.department = department;
		this.job = job;
		this.id = id;
	}

	/**
	 * @param name
	 * @param id
	 */
	public Employee(String name, int id) {
		this.name = name;
		this.id = id;
		department = "";
		job = "";
	}

	public Employee() {
		name = "";
		department = "";
		job = "";
		id = 0;
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
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}

	/**
	 * @param department the department to set
	 */
	public void setDepartment(String department) {
		this.department = department;
	}

	/**
	 * @return the job
	 */
	public String getJob() {
		return job;
	}

	/**
	 * @param job the job to set
	 */
	public void setJob(String job) {
		this.job = job;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	
}
