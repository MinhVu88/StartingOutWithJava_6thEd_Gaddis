package challenges.ch10;

/*
- this class has fields for a person�s name, address & telephone number 

- Write 1 or more constructors & the appropriate mutator & accessor methods for the class�s fields

- Next, design a class named Customer, which extends the Person class 

- The Customer class should have a field for a customer number & a boolean field indicating whether the customer wishes to be on a mailing list 

- Write 1 or more constructors & the appropriate mutator & accessor methods for the class�s fields 

- Demonstrate an object of the Customer class in a simple program
*/

public class Person {
	private String name, address, phoneNo;
	
	// a no-arg constructor
	public Person() {}

	/**
	 * @param name
	 * @param address
	 * @param phoneNo
	 */
	public Person(String name, String address, String phoneNo) {
		this.name = name;
		
		this.address = address;
		
		this.phoneNo = phoneNo;
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
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the phoneNo
	 */
	public String getPhoneNo() {
		return phoneNo;
	}

	/**
	 * @param phoneNo the phoneNo to set
	 */
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "\n* Name: " + name + ", address: " + address + ", phone no: " + phoneNo;
	}
	
	
}
