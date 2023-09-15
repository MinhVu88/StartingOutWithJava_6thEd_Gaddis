package code_listings.ch_17_databases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CoffeeInserter {
	
	final static String CONN = "jdbc:derby:CoffeeDB";
	
	public static void main(String[] args) {
		
		try (
				Connection conn = DriverManager.getConnection(CONN);
				
				Statement stmt = conn.createStatement();
				
				Scanner kbi = new Scanner(System.in);
				
				) {
			
			System.out.print("\nenter the coffee description: ");
			
			String description = kbi.nextLine();
			
			System.out.print("\nenter the product number (in the format of 'xx-xxx' where x is a digit): ");
			
			String prodNo = kbi.nextLine();
			
			System.out.print("\nenter the price: $");
			
			double price = kbi.nextDouble();
			
			// the Statement object's executeUpdate() returns 1 representing the 1 row that was inserted into the table 
			int insertedRow = stmt.executeUpdate("insert into coffee (prodnum, description, price) values (" + "'" + prodNo + "'" + ", " + 
																											   "'" + description + "'" + ", " + 
																											   		 price + ")");
			
			if (insertedRow == 1) {
				System.out.println("\n\tupdate CoffeeDB successfully");
				
				System.out.println("\n\t" + insertedRow + " row(s) added to the Coffee table");
			}
			
		} catch (SQLException e) {System.out.println("\n\tERROR: " + e.getMessage() + " => update CoffeeDB unsuccessfully");}
		
	}

}
