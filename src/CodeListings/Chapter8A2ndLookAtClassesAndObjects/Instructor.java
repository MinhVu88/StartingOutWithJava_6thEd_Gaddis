package CodeListings.Chapter8A2ndLookAtClassesAndObjects;

public class Instructor {
	private String firstName, lastName, officeNo;
	
	// a no-args constructor
	public Instructor() {
		this.firstName = "";
		
		this.lastName = "";
		
		this.officeNo = "";
	}

	/**
	 * @param firstName
	 * @param lastName
	 * @param officeNo
	 */
	public Instructor(String firstName, String lastName, String officeNo) {
		this.firstName = firstName;
		
		this.lastName = lastName;
		
		this.officeNo = officeNo;
	}

	/**
	 * this constructor makes copies of a particular instance of the Instructor class -> a copy constructor
	 * 
	 * @param anotherInstructorObject a reference to a copy of an Instructor object, passed to the copy constructor as an argument
	 */
	public Instructor(Instructor anotherInstructorObject) {
		this.firstName = anotherInstructorObject.firstName;
		
		this.lastName = anotherInstructorObject.lastName;
		
		this.officeNo = anotherInstructorObject.officeNo;
	}

	@Override
	public String toString() {
		return "firstName = " + firstName + ", lastName = " + lastName + ", office number = " + officeNo;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @param officeNo the officeNo to set
	 */
	public void setOfficeNo(String officeNo) {
		this.officeNo = officeNo;
	}
	
	
}
