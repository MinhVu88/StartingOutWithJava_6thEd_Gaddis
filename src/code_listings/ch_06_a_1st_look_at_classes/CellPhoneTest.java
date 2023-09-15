package code_listings.ch_06_a_1st_look_at_classes;
import java.util.Scanner;

// this program runs a simple test of the CellPhone class

public class CellPhoneTest {
	public static void main(String[] args) {
		String testManufacturer, testModel;
		double testRetailPrice;
		
		Scanner kbi = new Scanner(System.in);
		
		System.out.print("the manufacturer: ");
		testManufacturer = kbi.nextLine();
		
		System.out.println();
		
		System.out.print("the model: ");
		testModel = kbi.nextLine();
		
		System.out.println();
		
		System.out.print("the retail price: ");
		testRetailPrice = kbi.nextDouble();
		
		System.out.println();
		
		// create an instance of the CellPhone class called phone & pass the data (keyboard input) as arguments to the constructor
		CellPhone phone = new CellPhone(testManufacturer, testModel, testRetailPrice);
		
		// get the data & display it
		System.out.println("\nthe manufacturer: " + phone.getManufacturer() + " - the model: " + phone.getModel() + " - the retail price: $" + phone.getRetailPrice());
		
		kbi.close();
	}
}
