package challenges.ch6;

import java.util.Scanner;

public class RoulettePocketTester {

	public static void main(String[] args) {
		Scanner kbi = new Scanner(System.in);
		
		boolean keepPlaying;
		
		String reply;
		
		do {
			System.out.print("\nenter a pocket number between 0 & 36: ");
			
			int no = kbi.nextInt();
			
			RoulettePocket num = new RoulettePocket(no);
			
			System.out.println("\nthe color you get: " + num.getPocketColor());
			
			while(num.getPocketColor() == "invalid input") {
				System.out.println("\nplz try again");
				
				System.out.print("\nenter a pocket number between 0 & 36: ");
				
				no = kbi.nextInt();
				
				num.setPocketNo(no);
				
				System.out.println("\nthe color you get: " + num.getPocketColor());
			}
			
			kbi.nextLine();
			
			System.out.print("\nwanna pick a number between 0 & 36 again? (Y/y/N/n): ");
			
			reply = kbi.nextLine();
			
			if(reply.equalsIgnoreCase("Y")) {
				keepPlaying = true;
			}else {
				keepPlaying = false;
			}
			
		}while(keepPlaying);
		
		System.out.println("\n\tthank you for playing the game");
		
		kbi.close();
	}

}
