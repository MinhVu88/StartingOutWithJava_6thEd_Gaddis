package ProgrammingChallenges.Ch7;

import java.util.ArrayList;

/*
- Create a class with a method that accepts a charge account number as its argument 

- The method should determine whether the number is valid by comparing it to the following list of valid charge account numbers:

5658845 	4520125 	7895122 	8777541 	8451277 	1302850

8080152 	4562555 	5552012 	5050552 	7825877 	1250255

1005231 	6545231 	3852085 	7576651 	7881200 	4581002

- These numbers should be stored in an array or an ArrayList object 

- Use a sequential search to locate the number passed as an argument 

- If the number is in the array, the method should return true, indicating the number is valid 

- If the number is not in the array, the method should return false, indicating the number is invalid

- Write a program that tests the class by asking the user to enter a charge account number

- The program should display a message indicating whether the number is valid or invalid
*/

public class ChargeAccountValidation {
	private ArrayList<Integer> chargeAccNo;
	
	// a no-args constructor
	public ChargeAccountValidation() {}

	/**
	 * @param chargeAccNo
	 */
	public ChargeAccountValidation(ArrayList<Integer> chargeAccNo) {
		this.chargeAccNo = chargeAccNo;
	}
	
	/**
	 * 
	 * @param accNo a reference to an array of int values
	 */
	public ChargeAccountValidation(int[] accNo) {
		this.chargeAccNo = new ArrayList<>(accNo.length);
		
		for(int index = 0; index < accNo.length; index++) {
			this.chargeAccNo.add(accNo[index]);
		}
	}

	/**
	 * @return the chargeAccNo
	 */
	public ArrayList<Integer> getChargeAccNo() {
		return chargeAccNo;
	}

	/**
	 * @param chargeAccNo the chargeAccNo to set
	 */
	public void setChargeAccNo(ArrayList<Integer> chargeAccNo) {
		this.chargeAccNo = chargeAccNo;
	}
	
	/**
	 * 
	 * @param no the charge account number entered by user
	 * @return true or false based on the validation of the input
	 */
	public boolean checkAccNo(int no) {
		if(this.chargeAccNo.contains(no)) {
			return true;
		}else {
			return false;
		}
	}
}
