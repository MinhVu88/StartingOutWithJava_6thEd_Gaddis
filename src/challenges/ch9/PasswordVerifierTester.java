package challenges.ch9;

import java.util.Scanner;

public class PasswordVerifierTester {

	public static void main(String[] args) {
		Scanner kbi = new Scanner(System.in);
		
		System.out.print("\nRequirements for a valid password:\n" + 
						 "\n* The password should be at least 6 characters long\n" +
						 "\n* The password should contain at least 1 uppercase and at least 1 lowercase letter\n" +
						 "\n* The password should have at least 1 digit");
		
		System.out.print("\n\nenter your password: ");
		
		String password = kbi.nextLine();
		
		PasswordVerifier pv = new PasswordVerifier(password);
		
		if(pv.length() && pv.uppercase() && pv.lowercase() && pv.digit()) {
			System.out.println("\n\tYour password is valid");
		}else {
			System.out.println("\n\tYour password is invalid");
		}
		
		kbi.close();
	}

}
