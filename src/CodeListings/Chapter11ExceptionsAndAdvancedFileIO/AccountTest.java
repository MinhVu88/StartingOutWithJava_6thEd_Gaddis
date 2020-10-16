package CodeListings.Chapter11ExceptionsAndAdvancedFileIO;

// This program demonstrates how the BankAccount class constructor throws a programmer-defined exception

public class AccountTest {

	public static void main(String[] args) {
		try {
			BankAcc acc = new BankAcc(-100.0); // a custom NegativeStartingBalance exception
		
		} catch (NegativeStartingBalance e) {
			System.out.println("\n" + e.getMessage());
		}
	}

}
