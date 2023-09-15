package challenges.ch6;
import javax.swing.JOptionPane;

public class RetailItemTester {
	public static void main(String[] args) {
		String description;
		int unitsOnHand;
		double price;
		
		// item 1
		description = JOptionPane.showInputDialog("item 1:");
		unitsOnHand = Integer.parseInt(JOptionPane.showInputDialog("units on hand of item 1:"));
		price = Double.parseDouble(JOptionPane.showInputDialog("price of item 1:"));
		
		RetailItem item1 = new RetailItem(description, unitsOnHand, price);
		
		// item 2
		description = JOptionPane.showInputDialog("item 2:");
		unitsOnHand = Integer.parseInt(JOptionPane.showInputDialog("units on hand of item 2:"));
		price = Double.parseDouble(JOptionPane.showInputDialog("price of item 2:"));
		
		RetailItem item2 = new RetailItem(description, unitsOnHand, price);
		
		// item 3
		description = JOptionPane.showInputDialog("item 3:");
		unitsOnHand = Integer.parseInt(JOptionPane.showInputDialog("units on hand of item 3:"));
		price = Double.parseDouble(JOptionPane.showInputDialog("price of item 3:"));
		
		RetailItem item3 = new RetailItem(description, unitsOnHand, price);
		
		System.out.println("\t\tDescription 		Units on Hand 	Price");
		System.out.println("----------------------------------------------------------------");
	
		// display the 3 items
		System.out.println("item #1         " + item1.getDescription() + "      		" + item1.getUnitsOnHand() + "       	" + item1.getPrice());
		System.out.println("item #2         " + item2.getDescription() + "      	" + item2.getUnitsOnHand() + "       	" + item2.getPrice());
		System.out.println("item #3         " + item3.getDescription() + "      		" + item3.getUnitsOnHand() + "       	" + item3.getPrice());
		
		System.exit(0);
	}
}
