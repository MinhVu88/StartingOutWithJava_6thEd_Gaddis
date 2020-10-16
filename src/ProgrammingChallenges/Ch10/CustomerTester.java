package ProgrammingChallenges.Ch10;

import java.util.Scanner;

public class CustomerTester {

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
		
		Customer cust = new Customer(name, address, phoneNo, custNo);
		
		if(reply.equalsIgnoreCase("y")) {
			cust.setOnMailingList(true);
		}else {
			cust.setOnMailingList(false);
		}
		
		System.out.println(cust);
		
		kbi.close();
	}

}
