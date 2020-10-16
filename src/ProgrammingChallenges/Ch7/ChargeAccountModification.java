package ProgrammingChallenges.Ch7;
import java.io.*;
import java.util.Scanner;

/*
- Modify ChargeAccountValidationHelper.java, so it reads the list of valid charge account numbers from a file. 

- Use Notepad or another text editor to create the file
*/

public class ChargeAccountModification {

	public static void main(String[] args) throws IOException {
		Scanner kbi0 = new Scanner(System.in);
		
		System.out.print("\nthe file name: ");
		
		String fileName = kbi0.nextLine();
		
		File file = new File(fileName);
		
		if(!file.exists()) {
			System.out.println("\n" + fileName + " hasn't been created");
		}else {
			System.out.println("\n" + fileName + " has been created. Plz try another file name");
		}
		
		PrintWriter outputFile = new PrintWriter(file);
		
		outputFile.println(5658845 + " " + 4520125 + " " + 7895122 + " " + 8777541 + " " + 8451277 + " " + 1302850);
		
		outputFile.println(8080152 + " " + 4562555 + " " + 5552012 + " " + 5050552 + " " + 7825877 + " " + 1250255);
		
		outputFile.println(1005231 + " " + 6545231 + " " + 3852085 + " " + 7576651 + " " + 7881200 + " " + 4581002);
		
		outputFile.close();
		
		final int ACCOUNT_QUANTITY = 18;
		
		int[] accNumbers = new int[ACCOUNT_QUANTITY];
		
		Scanner inputFile = new Scanner(file);
		
		int index = 0;
		
		while(inputFile.hasNext() && index < accNumbers.length) {
				accNumbers[index] = inputFile.nextInt();
				
				index++;
			}
		
		displayResult(accNumbers);
		
		inputFile.close();
		
		kbi0.close();
	}
	
	public static void displayResult(int[] accNo) {
		Scanner kbi1 = new Scanner(System.in);
		
		boolean tryAgain = true;
		
		do {
			System.out.print("\nenter a 7-digit charge account number: ");
			
			int no = kbi1.nextInt();
			
			ChargeAccountValidation accNoList = new ChargeAccountValidation(accNo);
			
			if(accNoList.checkAccNo(no)) {
				System.out.println("\n\tvalid number");
				
				tryAgain = false;
			}else {
				System.out.println("\n\tinvalid number. plz try again");
				
				tryAgain = true;
			}
		}while(tryAgain);
		
		kbi1.close();
	}
}
