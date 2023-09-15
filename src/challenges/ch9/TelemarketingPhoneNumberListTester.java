package challenges.ch9;

import java.util.Scanner;

public class TelemarketingPhoneNumberListTester {

	public static void main(String[] args) {
		Scanner kbi = new Scanner(System.in);
		
		System.out.println("\nThe name list:\n" + "\n\tHarrison, Rose\n" + "\n\tJames, Jean\n" + "\n\tSmith, William\n" + "\n\tSmith, Brad\n");
		
		String reply;
		
		do {
			System.out.print("\nenter a name or the 1st few characters of a name to search for his/her corresponding phone numbers: ");
			
			String name = kbi.nextLine();
			
			TelemarketingPhoneNumberList nameAndPhone = new TelemarketingPhoneNumberList(name);
			
			System.out.print("\nanother name? (Y/y/N/n): ");
			
			reply = kbi.nextLine();
			
		} while (reply.equalsIgnoreCase("y"));
		
		
		kbi.close();
	}

}
