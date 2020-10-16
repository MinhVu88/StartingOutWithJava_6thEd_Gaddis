package CodeListings.Chapter11ExceptionsAndAdvancedFileIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class DeserializeObjects {

	public static void main(String[] args) throws Exception {
		Scanner kbi = new Scanner(System.in);
		
		System.out.print("\nenter the file name: ");
		
		String fileName = kbi.nextLine();
		
		File file = new File(fileName);
		
		if(file.exists()) {
			System.out.println("\n\t" + fileName + " has been created");
		}else {
			System.out.println("\n\t" + fileName + " hasn't been created");
		}
		
		ObjectInputStream objInputFile = new ObjectInputStream(new FileInputStream(file));
		
		final int ACC_QUANTITY = 3;
		
		BankAcc[] accounts = new BankAcc[ACC_QUANTITY];
		
		for(int index = 0; index < accounts.length; index++) {
			accounts[index] = (BankAcc) objInputFile.readObject();
		}
		
		objInputFile.close();
		
		kbi.close();
		
		for(int index = 0; index < accounts.length; index++) {
			System.out.println("\naccount #" + (index + 1) + ": $" + accounts[index].getBalance());
		}
	}

}
