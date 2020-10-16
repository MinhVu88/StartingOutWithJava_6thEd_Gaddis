package ProgrammingChallenges.Ch6;

/*
- Design a class that holds the following personal data: name, address, age & phone number

- Write appropriate accessor & mutator methods 

- Demonstrate the class by writing a program that creates 3 instances of it 

- 1 instance should hold your information & the other 2 should hold your friends’ or family members’ information
*/

public class PersonalInfo {
	private String name, address, phoneNo;
	private int age;
	
	/**
	 * @param name
	 * @param address
	 * @param phoneNo
	 * @param age
	 */
	public PersonalInfo(String name, String address, String phoneNo, int age) {
		this.name = name;
		this.address = address;
		this.phoneNo = phoneNo;
		this.age = age;
	}

	/**
	 * 
	 */
	public PersonalInfo() {
		name = "";
		address = "";
		phoneNo = "";
		age = 0;
	}

	/**
	 * @param age
	 */
	public PersonalInfo(int age) {
		this.age = age;
		name = "";
		address = "";
		phoneNo = "";
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

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
}
