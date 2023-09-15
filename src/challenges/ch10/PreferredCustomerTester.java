package challenges.ch10;

import java.util.Scanner;

public class PreferredCustomerTester {

	public static void main(String[] args) {
		Scanner kbi = new Scanner(System.in);
		
		System.out.print("\ncustomer name: ");
		
		String name = kbi.nextLine();
		
		System.out.print("\naddress: ");
		
		String address = kbi.nextLine();
		
		System.out.print("\nphone number: ");
		
		String phoneNo = kbi.nextLine();
		
		System.out.print("\ncustomer number: ");
		
		String custNo = kbi.nextLine();
		
		System.out.print("\nwanna be on our mailing list? (Y/y/N/n) ");
		
		String reply = kbi.nextLine();
		
		System.out.print("\nyour expense: $");
		
		double expense = kbi.nextDouble();
		
		PreferredCustomer favCust = new PreferredCustomer(name, address, phoneNo, custNo, expense);
		
		if(reply.equalsIgnoreCase("y")) {
			favCust.setOnMailingList(true);
		}else {
			favCust.setOnMailingList(false);
		}
		
		System.out.println(favCust);
		
		kbi.close();
	}

}
