package challenges.ch9;

/*
- Imagine you are developing a software package for Amazon.com that requires users to enter their own passwords 

- Your software requires that users� passwords meet the following criteria:

� The password should be at least 6 characters long

� The password should contain at least 1 uppercase and at least 1 lowercase letter

� The password should have at least 1 digit

- Write a class that verifies that a password meets the stated criteria 

- Demonstrate the class in a program that allows the user to enter a password and 
	then displays a message indicating whether it is valid or not
*/

public class PasswordVerifier {
	private String password;
	
	public PasswordVerifier() {}

	/**
	 * @param password
	 */
	public PasswordVerifier(String password) {
		this.password = password;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	public boolean length() {
		return this.password.length() == 6;
	}
	
	public boolean uppercase() {
		char[] array = this.password.toCharArray();
		
		for(int index = 0; index < array.length; index++) {
			if(Character.isUpperCase(array[index])) {
				return true;
			}
		}
		
		return false;
	}
	
	public boolean lowercase() {
		char[] array = this.password.toCharArray();
		
		for(int index = 0; index < array.length; index++) {
			if(Character.isLowerCase(array[index])) {
				return true;
			}
		}
		
		return false;
	}
	
	public boolean digit() {
		char[] array = this.password.toCharArray();
		
		for(int index = 0; index < array.length; index++) {
			if(Character.isDigit(array[index])) {
				return true;
			}
		}
		
		return false;
	}
}
