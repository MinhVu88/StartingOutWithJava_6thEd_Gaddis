package challenges.ch7;

import java.util.Scanner;

public class ChargeAccountValidationTester {

	public static void main(String[] args) {
		int[] accNumbers = {5658845, 4520125, 7895122, 8777541, 8451277, 1302850,

							8080152, 4562555, 5552012, 5050552, 7825877, 1250255,

							1005231, 6545231, 3852085, 7576651, 7881200, 4581002};
		
		displayResult(accNumbers);
	}
	
	public static void displayResult(int[] accNo) {
		Scanner kbi = new Scanner(System.in);
		
		boolean tryAgain = true;
		
		do {
			System.out.print("\nenter a 7-digit charge account number: ");
			
			int no = kbi.nextInt();
			
			ChargeAccountValidation accNoList = new ChargeAccountValidation(accNo);
			
			if(accNoList.checkAccNo(no)) {
				System.out.println("\n\tvalid number");
				
				tryAgain = false;
			}else {
				System.out.println("\n\tinvalid number. plz try again");
				
				tryAgain = true;
			}
		}while(tryAgain);
		
		kbi.close();
	}

}
