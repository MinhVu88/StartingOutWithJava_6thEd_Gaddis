package code_listings.ch_09_text_processing_and_wrapper_classes;

import java.util.Scanner;

// This program uses the startsWith & endsWith method to search using a partial string

public class PersonSearch {

	public static void main(String[] args) {
		Scanner kbi = new Scanner(System.in);
		
		String[] names = {"Helen Davis", "Ricky Scott", "Dan Archer", 
							"Lou Zalinsky", "Herbert Blunt", "Dave Lowery", 
							"Stanley Dostler", "Fred Prosnan", "Duane Bartmann",
							"Aaron Greasley", "Steve Atkins", "Leslie Mulder",
							"Greg Kosch", "Gary Bildeberg", "Pauline Finn"};
		
		String reply;
		
		do {
			System.out.print("\nenter any number of letters with which a name starts or ends: ");
			
			String subStr = kbi.nextLine();
			
			for(String name : names) {
				if(name.startsWith(subStr) || name.endsWith(subStr)) {
					System.out.println("\n\t" + name);
				}
			}
			
			System.out.print("\nkeep searching? (Y/y/N/n): ");
			
			reply = kbi.nextLine();
			
		}while(reply.equalsIgnoreCase("Y"));
		
		kbi.close();
	}

}
