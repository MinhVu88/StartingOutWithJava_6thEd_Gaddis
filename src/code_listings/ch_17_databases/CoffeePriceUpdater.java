package code_listings.ch_17_databases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CoffeePriceUpdater {
	
	final static String CONN = "jdbc:derby:CoffeeDB";
	
	public static void main(String[] args) {

		try (
				Connection conn = DriverManager.getConnection(CONN);

				Statement stmt = conn.createStatement();

				Scanner kbi = new Scanner(System.in);

				) {

			System.out.print("\nenter the product number (in the format of 'xx-xxx' where x is a digit): ");

			String prodNo = kbi.nextLine();

			if (findAndDisplayProduct(stmt, prodNo)) {
				System.out.print("\nenter the new price: $");
				
				double newPrice = kbi.nextDouble();
				
				updatePrice(stmt, newPrice, prodNo);
			} else {
				System.out.println("\nproduct not found");
			}
		
		} catch (SQLException e) {System.out.println("\n" + e.getMessage());}

	}
	
	private static boolean findAndDisplayProduct(Statement stmt, String prodNo) {
		
		boolean productFound = true;
		
		try (ResultSet rs = stmt.executeQuery("select * from coffee where prodnum = " + "'" + prodNo + "'")) {
			
			if (rs.next()) {
				System.out.println("\nProdNum" + "\t\t" + "Description" + "\t\t\t" + "Price");
				
				System.out.println("----------------------------------------------------------");
				
				System.out.println(rs.getString("prodnum") + "\t" + rs.getString("description") + "\t" + rs.getDouble("price"));
				
				productFound = true;
			} else {
				productFound = false;
			}
			
		} catch (SQLException e) {System.out.println("\n" + e.getMessage());}
		
		return productFound;
		
	}
	
	private static void updatePrice(Statement stmt, double newPrice, String prodNo) {
		
		try {
			
			int updatedRow = stmt.executeUpdate("update coffee set price = " + Double.toString(newPrice) + " where prodnum = " + "'" + prodNo + "'");
			
			if (updatedRow == 1) {
				System.out.println("\n\tupdated successfully => " + updatedRow + " row(s) updated");
			} else {
				System.out.println("\n\tupdated unsuccessfully => " + updatedRow + " row(s) updated");
			}
		
		} catch (SQLException e) {System.out.println("\n" + e.getMessage());}
		
	}
}
