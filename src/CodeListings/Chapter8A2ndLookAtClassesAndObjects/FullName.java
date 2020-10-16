package CodeListings.Chapter8A2ndLookAtClassesAndObjects;

/*
- without a programmer-defined constructor, the String fields in this class will be initialized to null by the default constructor when an instance is created

- String fields are reference variables

- a reference variable whose value is null doesn't reference any instance, thus it can't be used to perform an operation that would require the existence of an instance

- an instance method like getLength() will still be able to be invoked no matter what values the fields are initialized to

- however the program will crash when you run it because the method is called before the fields are made to reference String objects

- solution 1: use if statements in getLength to determine whether any of the fields are set to null

- solution 2: write a no-arg constructor that assigns values to the reference fields
*/

public class FullName {
	// these would be null reference variables by default due to the lack of a programmer-defined constructor such as a no-arg constructor 
	private String firstName, middleName, lastName;
	
	/*
	// solution 2:
	public FullName() {
		firstName = "";
		
		middleName = "";
		
		lastName = "";
	}
	*/
	
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the middleName
	 */
	public String getMiddleName() {
		return middleName;
	}

	/**
	 * @param middleName the middleName to set
	 */
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastname() {
		return lastName;
	}

	/**
	 * @param lastname the lastName to set
	 */
	public void setLastname(String lastname) {
		this.lastName = lastname;
	}
	
	public int getLength() {
		// solution 1:
		int length = 0;
		
		if(firstName != null) {
			length += firstName.length();
		}
		
		if(middleName != null) {
			length += middleName.length();
		}
		
		if(lastName != null) {
			length += lastName.length();
		}
		
		return length;
	}
	
	@Override
	public String toString() {
		return firstName + " " + middleName + " " + lastName;
	}
	
}
