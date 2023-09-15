package code_listings.ch_09_text_processing_and_wrapper_classes;

import java.util.Scanner;

public class TelephoneTester {

	public static void main(String[] args) {
		Scanner kbi = new Scanner(System.in);
		
		System.out.print("\nenter a 10-digit unformated phone number (without the parentheses & the hyphen): ");
		
		String phoneNo = kbi.nextLine();
		
		System.out.println("\nthe formated version of the number you've just entered: " + Telephone.format(phoneNo));
		
		System.out.print("\nenter a 13-digit formated phone number as (XXX)XXX-XXXX: ");
		
		phoneNo = kbi.nextLine();
		
		System.out.println("\nthe unformated version of the number you've just entered: " + Telephone.unformat(phoneNo)); 
		
		kbi.close();
	}

}
