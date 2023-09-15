package challenges.ch9;

import java.util.Scanner;

public class VowelsAndConsonantsTester {

	public static void main(String[] args) {
		Scanner kbi = new Scanner(System.in);
		
		boolean exit = true;
		
		do {
			System.out.print("\nenter a string: ");
			
			String str = kbi.nextLine();
			
			VowelsAndConsonants userInput = new VowelsAndConsonants(str);
			
			System.out.println("\nThe options:\n" + 
								"\n\t1. Count the number of vowels in the string\n" +
								"\n\t2. Count the number of consonants in the string\n" +
								"\n\t3. Count both the vowels and consonants in the string\n" +
								"\n\t4. Enter another string\n" +
								"\n\t5. Exit the program");
			
			System.out.print("\nenter the option: ");
			
			int option = kbi.nextInt();
			
			kbi.nextLine();
			
			String reply;
			
			if(option == 1) {
				System.out.println("\n\tThe number of vowels in the string: " + userInput.vowels());
				
				System.out.print("\nanother option? (Y/y/N/n) ");
				
				reply = kbi.nextLine();
				
				if(reply.equalsIgnoreCase("Y")) {
					exit = false;
				}else {
					exit = true;
				}
			}else if(option == 2) {
				System.out.println("\n\tThe number of consonants in the string: " + userInput.consonants());
				
				System.out.print("\nanother option? (Y/y/N/n) ");
				
				reply = kbi.nextLine();
				
				if(reply.equalsIgnoreCase("Y")) {
					exit = false;
				}else {
					exit = true;
				}
			}else if(option == 3) {
				System.out.println("\n\tThe vowels & consonants in the string: " + userInput.vowelsAndConsonants());
				
				System.out.print("\nanother option? (Y/y/N/n) ");
				
				reply = kbi.nextLine();
				
				if(reply.equalsIgnoreCase("Y")) {
					exit = false;
				}else {
					exit = true;
				}
			}else if(option == 4) {
				exit = false;
			}else if(option == 5) {
				exit = true;
			}
		} while (!exit);
		
		System.out.println("\nthanks for playing");
		
		kbi.close();
	}

}
